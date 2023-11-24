package repositorios;

import gestaoBanco.Conta;
import interfaces.RepositorioContas;

import java.util.ArrayList;
import java.util.List;

public class RepositorioContasLista implements RepositorioContas {
    List<Conta> contas;

    public RepositorioContasLista(){
        contas = new ArrayList<Conta>();
    }

    @Override
    public void inserir(Conta conta){
        contas.add(conta);
    }

    @Override
    public Conta procurar(String numConta){
        Conta contaProcurada=null;
        for (Conta c : contas){
            if (c.getNumero().equals(numConta)){
                contaProcurada = c;
            }
        }
        return contaProcurada;
    }

    @Override
    public void remover(String numConta){
        int posicao = -1;
        for (Conta c : contas){
            if (c.getNumero().equals(numConta)){
                posicao = contas.indexOf(c);
                break;
            }
        }
        if (posicao != -1){
            contas.remove(posicao);
        }

    }

    @Override
    public List<Conta> listarContas(){
        return this.contas;
    }
}
