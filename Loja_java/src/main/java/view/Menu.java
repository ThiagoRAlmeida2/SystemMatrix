package view;

import Ponto.Ponto;
import gestaoFuncionario.Gerenciamento;
import gestaoPessoas.Gerente;
import gestaoPessoas.Vendedor;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Gerenciamento gerenciamento = new Gerenciamento();
        gerenciamento.adicionarGerente(45006, "Maria Isabel", "987.654.321-65");
        gerenciamento.adicionarVendedores(123456, "joao Paulo", "rua manoel", "65464", new Date(), "Vendedor", 20);

        int escolha;

        do {
            System.out.println("Olá, Bem-vindo a nossa Loja");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Acessar como Gerente");
            System.out.println("2 - Acessar como vendedor");
            System.out.println("3 - Bater Ponto");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opção:");

            String input = scanner.nextLine();

            try {
                escolha = Integer.parseInt(input);

                switch (escolha) {
                    case 1:
                        System.out.println("Você selecionou a opção Acessar como Gerente");
                        Gerente gerente = new Gerente();
                        List<Gerente> listaDeGerentes = gerenciamento.gerentes();
                        gerente.acessoGerente(listaDeGerentes);
                        break;
                    case 2:
                        System.out.println("Você selecionou a opção Acessar como vendedor.");
                        Vendedor vendedor = new Vendedor();
                        vendedor.funcaoVendedor(gerenciamento);
                        break;
                    case 3:
                        System.out.println("Você selecionou a função Bater Ponto:");
                        Ponto.registrarPonto();
                        break;
                    case 0:
                        System.out.println("Saindo do sistema.");
                        break;
                    default:
                        System.out.println("Opção inválida. Escolha uma opção válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                escolha = -1;
            }
        } while (escolha != 0);
        scanner.close();
    }
}