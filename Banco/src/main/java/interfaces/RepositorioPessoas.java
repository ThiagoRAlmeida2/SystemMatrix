package interfaces;

import gestaoPessoas.Pessoa;

import java.util.List;

public interface RepositorioPessoas {
    void inserir (Pessoa pessoa);
    Pessoa procurar(String nomeUsuario);
    void remover(String nomeUsuario);
    List<Pessoa> listarPessoas();
}
