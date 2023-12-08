package interfaceLoja;

import java.util.Date;

public abstract class Pessoa {

    private String nome;
    private String cargo;
    private String endereco;
    private String cpf;
    private int idade;

    public Pessoa() {
    }
    public Pessoa(String nome, String endereco, String cargo, String cpf, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.cargo = cargo;
        this.cpf = cpf;
        this.idade = idade;
    }
    public Pessoa(String nome, String endereco, String cpf, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public int getId() {
        return 0;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }
}