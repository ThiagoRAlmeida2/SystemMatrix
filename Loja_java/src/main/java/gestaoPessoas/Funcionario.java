package gestaoPessoas;

import interfaceLoja.Pessoa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Funcionario extends Pessoa implements Serializable {

    private String cargo;
    private int id;
    private String carteira;
    private String nome;
    private String cpf;
    private Date dataContratacao;
    private double salario;

    public Funcionario(String nome, String endereco, String cpf, String cargo, int idade, String carteira, int id) {
        super(nome, endereco, cargo, cpf, idade);
        this.cargo = cargo;
        this.carteira = carteira;
        this.id = id;
        this.nome = nome;
    }

    public Funcionario(int id, String nome, String cpf, Date dataContratacao, String gerente, int i) {
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    public String getCarteira() {
        return carteira;
    }

    public String getCargo(){
        return cargo;
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Funcionario: " +
                "nome: '" + getNome() + '\'' +
                ", cpf: '" + getCpf() + '\'' +
                ", cargo '" + getCargo() + '\'' +
                ", carteira: '" + carteira + '\'' +
                ", id: " + id;
    }

    // Método para encontrar um funcionário com base no ID
    public static Funcionario encontrarFuncionario(int id) {
        List<Funcionario> funcionarios = obterListaDeFuncionarios();

        return funcionarios.stream()
                .filter(funcionario -> funcionario.getId() == id)
                .findFirst()
                .orElse(null);
    }

    private static List<Funcionario> obterListaDeFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();

        // Adicionar funcionários à lista usando o construtor adequado
        funcionarios.add(new Funcionario("Thiago", "Endereco1", "123.456.789-80", "Gerente", 30, "2752782", 1));
        funcionarios.add(new Funcionario("Caio", "Endereco2", "987.654.321-65", "Vendedor", 25, "7827827", 2));
        funcionarios.add(new Funcionario("Pedro", "Endereco3", "456.789.123-87", "Analista", 28, "4758164", 3));
        funcionarios.add(new Funcionario("Gustavo", "Endereco4", "275.548.647-78", "Gerente", 32, "4758164", 4));

        return funcionarios;
    }
}
