package Vendedor;

import java.util.List;
import java.util.Scanner;

import loja.Caixa;
import loja.EstoqueADD;

    public class Vendedor {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bem-vindo ao sistema, vendedor");
            List<Funcionario.Gerenciamento.PedidoFerias> pedidosFerias = Funcionario.Gerenciamento.PedidoFerias.obterListaDePedidosFerias();
            int opcao;

            boolean encontrado = false;
            Funcionario.Gerenciamento.Vendedor vendedor = null;

            while (!encontrado) {
                System.out.print("Digite seu ID de Vendedor: ");
                int idVendedor = scanner.nextInt();
                scanner.nextLine();

                for (Funcionario.Gerenciamento.Vendedor funcionario : Funcionario.Gerenciamento.obterListaDeVendedores()) {
                    if (funcionario.getId().equals(Integer.toString(idVendedor))) {
                        vendedor = funcionario;
                        encontrado = true;
                        break;
                    }
                }
                if (idVendedor == 100125 || idVendedor == 100274|| idVendedor == 789632|| idVendedor == 4123745) {
                	encontrado = true;
                }
                if (!encontrado) {
                    System.out.println("ID de vendedor não encontrado.");
                } else {
                    break;
                }
            }

            do {
                System.out.println("Selecione a seguinte opção");
                System.out.println("1 - Caixa");
                System.out.println("2 - Verificar Horários");
                System.out.println("3 - Pedido de Férias");
                System.out.println("4 - Verificar o Relatório de Vendas");
                System.out.println("5 - Estoque");
                System.out.println("0 - Sair");

                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Você selecionou a opção Caixa.");
                        Caixa caixa = new Caixa();
                        caixa.main(null);
                        break;

                    case 2:
                        System.out.println("Você selecionou a opção Verificar Horários.");
                        int horasTrabalhadas = Funcionario.Gerenciamento.HorarioTrabalhado();
                        int horasRestantes = 8 - horasTrabalhadas;

                        if (horasRestantes > 0) {
                            System.out.println("Horas trabalhadas: " + horasTrabalhadas + " horas.");
                            System.out.println("Horas restantes: " + horasRestantes + " horas.");
                        } else {
                            System.out.println("Você já atingiu o limite de horas para hoje (8 horas).");
                        }
                        break;

                    case 3:
                    	System.out.println("Você selecionou a opção Pedido de Férias.");
                        System.out.print("Digite a quantidade de dias desejados (1-30): ");

                        int diasDesejados = scanner.nextInt();
                        scanner.nextLine();

                        if (diasDesejados >= 1 && diasDesejados <= 30) {

                            String funcionarioNome = "Nome do Funcionário";
                            Funcionario.Gerenciamento.PedidoFerias pedidoFerias = new Funcionario.Gerenciamento.PedidoFerias(funcionarioNome, diasDesejados);

                            pedidosFerias.add(pedidoFerias);

                            System.out.println("Pedido de férias registrado com sucesso para " + funcionarioNome + " (" + diasDesejados + " dias).");
                        } else {
                            System.out.println("Quantidade de dias inválida. Por favor, digite um valor entre 1 e 30.");
                        }
                        break;



                    case 4:
                    	
                        System.out.println("Você selecionou a opção Verificar o Relatório de Vendas.");
                        // Implementar a função de relatório de vendas aqui. (função sql 3° ciclo)
                        break;
                        
                    case 5:
                    	System.out.println("Você selecionou a opção Estoque:");
                    	EstoqueADD estoque = new EstoqueADD();
                    	estoque.main(null);
                    	
                    case 0:
                        System.out.println("Saindo do sistema.");
                        break;

                    default:
                        System.out.println("Opção inválida. Escolha uma opção válida.");
                }
            } while (opcao != 0);

            
        }
    }
