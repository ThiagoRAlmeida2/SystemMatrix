package gestaoPessoas;

import interfaceLoja.Pessoa;
import repositorioBD.CadastroCliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Pessoa {
    private static List<Cliente> clientesCadastrados = new ArrayList<>();

    public Cliente(String nome, String endereco, String cpf, int idade) {
        super(nome, endereco, cpf, idade);
    }

    public static void cadastrarCliente() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();

        System.out.println("Digite o endereço do Cliente:");
        String endereco = scanner.nextLine();

        System.out.println("Digite o CPF do cliente:");
        String cpf = scanner.nextLine();

        System.out.println("Digite a idade do cliente:");
        int idade = scanner.nextInt();

        Cliente cliente = new Cliente(nome, endereco, cpf, idade);

        clientesCadastrados.add(cliente);

        System.out.println("Cliente cadastrado com sucesso:");
        cliente.exibirInformacoes();
        CadastroCliente.inserirCliente(cliente);
    }

    public static void exibirClientesCadastrados() {
        System.out.println("Clientes cadastrados:");
        for (Cliente cliente : clientesCadastrados) {
            cliente.exibirInformacoes();
        }
    }
}
