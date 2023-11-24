package repositorios;

import gestaoPessoas.Pessoa;
import interfaces.RepositorioPessoas;

import java.util.List;

public class RepositorioPessoasLista implements RepositorioPessoas {
    List<Pessoa> p;

    @Override
    public void inserir(Pessoa p){

    }

    @Override
    public Pessoa procurar(String nomeUsuario){
        Pessoa pessoaProcurada = null;

        return pessoaProcurada;
    }

    @Override
    public void remover(String nomeUsuario){

    }

    @Override
    public List<Pessoa> listarPessoas(){
        return p;
    }
}
