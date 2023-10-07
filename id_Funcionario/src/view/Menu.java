package view;

import Funcionario.Gerenciamento.Gerente;
import Funcionario.Gerenciamento.Funcionario;
import Funcionario.Gerenciamento.PedidoFerias;
import Ponto.Ponto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        List<PedidoFerias> pedidosFerias = new ArrayList<>();

        System.out.println("Olá, Bem-vindo ao sistema");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastro de Funcionário");
        System.out.println("2 - Bater Ponto");
        System.out.println("3 - Acessar como Gerente");
        System.out.println("0 - Sair");
        System.out.println("Digite uma opção:");

        int escolha = scanner.nextInt();
        scanner.nextLine();

        while (escolha != 0) {
            if (escolha == 1) {
                System.out.println("Você escolheu Cadastro de Funcionário.");
                Funcionario.cadastrarFuncionario(funcionarios);
            } else if (escolha == 2) {
                System.out.println("Você escolheu Bater Ponto.");
                Ponto.registrarPonto();
            } else if (escolha == 3) {
                System.out.print("Digite seu ID de Gerente: ");
                int idGerente = scanner.nextInt();
                scanner.nextLine();

                Gerente gerenciamento = new Gerente();
                Gerente gerente = gerenciamento;

                if (gerente != null) {
                    gerente.gerenteMenu(pedidosFerias);
                } else {
                    System.out.println("ID de gerente não encontrado.");
                }
            } else {
                System.out.println("Opção inválida. Escolha uma opção válida.");
            }

            System.out.println("\nEscolha uma opção:");
            escolha = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Saindo do sistema.");
        scanner.close();
    }
}