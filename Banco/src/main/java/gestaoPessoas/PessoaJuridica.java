package gestaoPessoas;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String nomeFantasia;
    private int anoCriacao;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public String verificarIdade(){
        String mensagem;
        if (anoCriacao > 5){
            mensagem = "Elegível para abrir conta";
        } else {
            mensagem = "Não pode criar conta com menos de 5 anos de criação";
        }
        return mensagem;
    }
}
