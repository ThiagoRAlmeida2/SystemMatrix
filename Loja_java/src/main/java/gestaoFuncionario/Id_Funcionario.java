package gestaoFuncionario;

import java.util.Random;
import java.util.Scanner;

import gestaoPessoas.Funcionario;
import repositorioBD.CadastroFuncionario;

public class Id_Funcionario {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    private static String obterCargo(int opcaoCargo) {
        switch (opcaoCargo) {
            case 1:
                return "Vendedor";
            case 2:
                return "Gerente";
            case 3:
                return "Departamento";
            case 4:
                return "Fornecedor";
            default:
                return "Cargo não especificado";
        }
    }

    public Funcionario cadastrarFuncionario() throws Exception {

        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o endereço do funcionário:");
        String endereco = scanner.nextLine();

        System.out.println("Digite o CPF do funcionário:");
        String cpf = scanner.nextLine();

        System.out.println("Escolha o cargo:");
        System.out.println("1 - Vendedor");
        System.out.println("2 - Gerente");
        System.out.println("3 - Departamento");
        System.out.println("4 - Fornecedor");

        int opcaoCargo = scanner.nextInt();
        scanner.nextLine();

        String cargo = obterCargo(opcaoCargo);

        System.out.println("Digite a carteira do funcionário:");
        String carteira = scanner.nextLine();

        int id;
        if("Gerente".equals(cargo)){
            id = Integer.parseInt("45" + String.format("%04d", random.nextInt(10000)));
        } else {
            id = Integer.parseInt(String.format("%05d", random.nextInt(100000)));
        }

        Funcionario novoFuncionario = new Funcionario(nome, endereco, cpf, cargo, 0, carteira, id);
        System.out.println("Funcionário cadastrado com sucesso:");
        System.out.println(novoFuncionario);

        CadastroFuncionario.inserirFuncionario(novoFuncionario);
        scanner.close();

        return novoFuncionario;
    }
}
