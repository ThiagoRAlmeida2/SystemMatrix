package BancoDeDados;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private String sobrenome;
    private String cpf;
    private String carteira;
    private int id;

    public Funcionario(String nome, String sobrenome, String cpf, String carteira, int id) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.carteira = carteira;
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public String getNome(){
        return nome;
    }
    // Getters e setters omitidos para manter o código mais curto

    @Override
    public String toString() {
        return "Funcionario: " +
                "nome: '" + nome + '\'' +
                "sobrenome:" + sobrenome + '\'' +
                ", cpf: " + cpf + '\'' +
                ", carteira: " + carteira + '\'' +
                ", id: " + id;
    }

    private static List<Funcionario> listaDeFuncionarios = new ArrayList<>();

    public static List<Funcionario> getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }

    // Método para encontrar um funcionário com base no ID
    public static Funcionario encontrarFuncionario(int id) {
        List<Funcionario> funcionarios = obterListaDeFuncionarios();

        // Percorrer a lista de funcionários e achar o id correspondente
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                return funcionario; // Retorna a funcionário
            }
        }
        return null;
    }
    private static List<Funcionario> obterListaDeFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();

        //Adicionar funcionários à lista
        funcionarios.add(new Funcionario("Thiago","Ribeiro", "123.456.789-80", "2752782", 1));
        funcionarios.add(new Funcionario("Caio","Vinicius", "987.654.321-65", "7827827", 2));
        funcionarios.add(new Funcionario("Pedro", "Gabriel", "456.789.123-87", "4758164", 3));
        funcionarios.add(new Funcionario("Gustavo", "Domingues", "275.548.647-78", "4758164", 4));
        return funcionarios;
    }

    public void setId(String idGerente) {
    }
    public static String gerarIdUnico() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10000);
        return "45" + String.format("%04d", numeroAleatorio);
    }
}
