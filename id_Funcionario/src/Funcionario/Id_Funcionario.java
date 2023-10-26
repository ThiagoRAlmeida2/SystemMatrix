package Funcionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import BancoDeDados.Funcionario;

public class Id_Funcionario {
    public static void cadastrarFuncionario() {
        Scanner scanner = new Scanner(System.in);
        String idGerente = "";
        System.out.println("Cadastro de Funcionário");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Carteira de trabalho: ");
        String carteira = scanner.nextLine();

        String cargo = "";

        System.out.println("Escolha o cargo:");
        System.out.println("1 - Vendedor");
        System.out.println("2 - Gerente");
        System.out.println("3 - Departamento");
        System.out.println("4 - Fornecedor");

        int cargoEscolhido;
        String[] opcoesCargos = {"Cliente", "Vendedor", "Funcionario", "Departamento", "Fornecedor"};

        do {
            try {
                System.out.print("Opção: ");
                cargoEscolhido = Integer.parseInt(scanner.nextLine());

                if (cargoEscolhido >= 1 && cargoEscolhido <= 4) {
                    cargo = opcoesCargos[cargoEscolhido];
                } else {
                    System.out.println("Opção inválida. Por favor, escolha uma das opções (1 a 4).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Por favor, escolha uma das opções (1 a 4).");
                cargoEscolhido = 0; // Valor inválido
            }
        } while (cargoEscolhido < 1 || cargoEscolhido > 4);

        switch (cargoEscolhido) {
            case 1:
                cargo = "Vendedor";
                break;
            case 2:
                cargo = "Funcionario";
                break;
            case 3:
                cargo = "Departamento";
                break;
            case 4:
                cargo = "Fornecedor";
                break;
            default:
                cargo = "Cliente";
                break;
        }

        System.out.print("Data de Contrato (dd/mm/aaaa): ");
        String dataContratacaoStr = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dataContratacao = null;

        try {
            dataContratacao = dateFormat.parse(dataContratacaoStr);
        } catch (ParseException e) {
            System.out.println("Data de Contrato inválida. Use o formato dd/mm/aaaa.");
            scanner.close();
            return;
        }

        Random random = new Random();
        int id = 100000 + random.nextInt(900000);

        Funcionario funcionario = new Funcionario(nome, sobrenome, cpf, carteira, id);
        Funcionario.getListaDeFuncionarios().add(funcionario);

        if (cargo.equals("Funcionario")) {
            idGerente = "45" + Funcionario.gerarIdUnico();
            System.out.println("ID do Gerente: " + idGerente);
            funcionario.setId(idGerente);
        }

        while (true) {
            System.out.println("Verifique seus dados:");
            System.out.println("\nDados do Funcionário:");
            System.out.println("Nome: " + nome);
            System.out.println("CPF: " + cpf);
            System.out.println("Carteira de Trabalho: " + carteira);
            System.out.println("Data de Contrato: " + dateFormat.format(dataContratacao));
            System.out.println("Cargo: " + cargo);

            if (cargo.equals("Funcionario")) {
                System.out.println("ID do Gerente: " + idGerente);
            }
            if (cargo.equals("Vendedor")) {
                System.out.println("ID do Vendedor: " + id);
            }

            System.out.print("\nDigite '1' para confirmar ou '2' para modificar: ");
            String confirmacao = scanner.nextLine().toLowerCase();

            if (confirmacao.equals("1")) {
                System.out.println("Seu cadastro foi concluído! Bem-vindo à empresa.");
                break;
            } else if (confirmacao.equals("2")) {
                System.out.println("Por favor, digite os dados novamente.");

                System.out.print("Nome: ");
                nome = scanner.nextLine();

                System.out.print("CPF: ");
                cpf = scanner.nextLine();

                System.out.print("Carteira de trabalho: ");
                carteira = scanner.nextLine();

                System.out.print("Cargo: ");
                cargo = scanner.nextLine();

                System.out.print("Data de Contrato (dd/mm/aaaa): ");
                dataContratacaoStr = scanner.nextLine();

                try {
                    dataContratacao = dateFormat.parse(dataContratacaoStr);
                } catch (ParseException e) {
                    System.out.println("Data de Contrato inválida. Use o formato dd/mm/aaaa.");
                    scanner.close();
                    return;
                }
            } else {
                System.out.println("Opção inválida. Por favor, digite '1' para confirmar ou '2' para modificar.");
            }
        }
        scanner.close();
    }
}