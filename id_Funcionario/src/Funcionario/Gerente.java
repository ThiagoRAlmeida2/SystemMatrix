package Funcionario;

import Funcionario.Gerenciamento.Funcionario;
import Funcionario.Gerenciamento.PedidoFerias;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema, Gerente!");

        List<Funcionario> funcionarios = new ArrayList<>();
        List<PedidoFerias> pedidosFerias = new ArrayList<>();

        Funcionario gerente = null;
        boolean encontrado = false;

        while (!encontrado) {
            System.out.print("Digite seu ID de Gerente: ");
            int idGerente = scanner.nextInt();
            scanner.nextLine();

            for (Funcionario funcionario : funcionarios) {
                if (funcionario.getId() == idGerente) {
                    gerente = funcionario;
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("ID de gerente não encontrado.");
            }
        }

        System.out.println("Bem-vindo, " + gerente.getNome() + "!");

        System.out.println("Opções:");
        System.out.println("1. Sou eu");
        System.out.println("2. Não sou eu");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            System.out.println("Você selecionou 'Sou eu'.");
            do {
                System.out.println("Menu de Opções:");
                System.out.println("1. Visualizar relatório de vendas");
                System.out.println("2. Aprovar pedido de férias");
                System.out.println("3. Sair");

                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Visualizando relatório de vendas...");
                        // Coloque aqui a lógica para exibir o relatório de vendas
                        break;
                    case 2:
                        System.out.println("Aprovando pedido de férias...");
                        System.out.println("Pedidos de férias pendentes:");
                        for (int i = 0; i < pedidosFerias.size(); i++) {
                            PedidoFerias pedido = pedidosFerias.get(i);
                            System.out.println(i + ". Funcionário: " + pedido.getFuncionarioNome()
                                    + ", Dias: " + pedido.getDias());
                        }

                        // Solicite ao gerente que escolha um pedido para aprovar
                        System.out.print("Digite o número do pedido a ser aprovado: ");
                        int numeroPedido = scanner.nextInt();
                        scanner.nextLine();

                        if (numeroPedido >= 0 && numeroPedido < pedidosFerias.size()) {
                            PedidoFerias pedidoAprovado = pedidosFerias.remove(numeroPedido);
                            System.out.println("Pedido de férias aprovado para " + pedidoAprovado.getFuncionarioNome() + ".");
                        } else {
                            System.out.println("Número de pedido inválido.");
                        }
                        break;
                    case 3:
                        System.out.println("Saindo do menu de gerente.");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } while (opcao != 3);
        } else if (opcao == 2) {
            System.out.println("Você selecionou 'Não sou eu'.");
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}