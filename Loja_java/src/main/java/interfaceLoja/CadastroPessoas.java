package interfaceLoja;

import java.util.List;

public interface CadastroPessoas {
    boolean inserirPessoa(Pessoa p);
    List<Pessoa> listarPessoa();
    void removerPessoa(int id);
    boolean adicionarGerentes(Pessoa p);
}
