package interfaces;

import gestaoBanco.Conta;

import java.util.List;

public interface RepositorioContas {
    void inserir(Conta conta);
    Conta procurar(String numeroConta);
    void remover(String numeroConta);
    List<Conta> listarContas();
}
