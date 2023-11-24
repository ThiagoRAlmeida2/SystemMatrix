package gestaoPessoas;

public class PessoaFisica extends Pessoa{
    private String cpf;
    private int idade;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String verificarIdade(){
        String mensagem = null;
        if (getIdade() >= 16){
            mensagem= "Elegivel para abrir conta";
        } else {
           mensagem = "Menor de idade não pode criar conta";
        }
        return mensagem;
    }
}
