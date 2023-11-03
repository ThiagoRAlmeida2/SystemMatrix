package Gerente;
import Funcionario.Gerenciamento;
import Funcionario.Gerenciamento.Funcionario;
import Funcionario.Gerenciamento.PedidoFerias;
import view.Menu;

import java.util.List;
import java.util.Scanner;

public class Gerente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema, Gerente!");

        List<Gerenciamento.Gerente> funcionarios = Gerenciamento.main(args);
        List<PedidoFerias> pedidosFerias = PedidoFerias.obterListaDePedidosFerias();

        boolean encontrado = false;
        Funcionario gerente = null;

        while (!encontrado) {
            System.out.print("Digite seu ID de Gerente: ");
            int idGerente = scanner.nextInt();
            scanner.nextLine();

            for (Funcionario funcionario : funcionarios) {
                if (funcionario.getId().equals(Integer.toString(idGerente))) {
                    gerente = funcionario;
                    encontrado = true;
                    break;
                }
               
            }
            if (!encontrado) {
                System.out.println("ID de gerente não encontrado.");
            } else {
                break;
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
                System.out.println("1. Aprovar pedido de férias");
                System.out.println("2. Ver equipe");
                System.out.println("3. Sair");

                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Aprovando pedido de férias...");
                        System.out.println("Pedidos de férias pendentes:");
                        for (int i = 0; i < pedidosFerias.size(); i++) {
                            PedidoFerias pedido = pedidosFerias.get(i);
                            System.out.println(i + ". Funcionário: " + pedido.getFuncionarioNome()
                                    + ", Dias: " + pedido.getDias());
                        }

                       
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

                    case 2:
                        System.out.println("Visualizando equipe...");
                        // Coloque a lógica para visualizar a equipe aqui(pro 3° ciclo)
                        break;
                    case 3:
                        System.out.println("Saindo do menu de gerente.");
                        Menu menu = new Menu();
                        menu.main(null);
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } while (opcao != 4);
        } else if (opcao == 2) {
            System.out.println("Você selecionou 'Não sou eu'.");
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}