package gestaoPessoas;

import gestaoFuncionario.Gerenciamento.PedidoFerias;
import interfaceLoja.Pessoa;
import loja.EstoqueADD;
import gestaoFuncionario.Id_Funcionario;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Gerente extends Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private Date dataContratacao;
    private String cargo;

    public Gerente(int id, String nome, String cpf, Date dataContratacao, String cargo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataContratacao = dataContratacao;
        this.cargo = cargo;
    }

    public Gerente() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Gerente verificarIdGerente(List<Gerente> gerentes, int id) {
        for (Gerente gerente : gerentes) {
            if (gerente.getId() == id) {
                return gerente;
            }
        }
        return null;
    }

    public void acessoGerente(List<Gerente> gerentes) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema, Gerente!");

        List<PedidoFerias> pedidosFerias = PedidoFerias.obterListaDePedidosFerias();

        Gerente gerenteEncontrado = null;

        while (gerenteEncontrado == null) {
            System.out.println("Digite o ID de gerente:");
            int idDigitado = scanner.nextInt();
            scanner.nextLine();

            gerenteEncontrado = verificarIdGerente(gerentes, idDigitado);

            if (gerenteEncontrado != null) {
                System.out.println("Bem-Vindo, " + gerenteEncontrado.getNome() + "!");
            } else {
                System.out.println("Id de gerente não encontrado. Tente novamente.");
            }
        }

        System.out.println("Opções:");
        System.out.println("1. Sou eu");
        System.out.println("2. Não sou eu");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            do {
                System.out.println("Menu de Opções:");
                System.out.println("1 - Cadastro de Funcionário");
                System.out.println("2 - Aprovar pedido de férias");
                System.out.println("3 - Cadastro Cliente");
                System.out.println("4 - Verificar lista de clientes");
                System.out.println("5 - Acessar estoque");
                System.out.println("0 - Sair");

                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Você escolheu Cadastro de Funcionário.");

                        Id_Funcionario idFuncionario = new Id_Funcionario();

                        try {
                            idFuncionario.cadastrarFuncionario();
                        } catch (Exception e) {
                            System.out.println("Erro ao cadastrar funcionário: " + e.getMessage());
                        }
                        break;

                    case 2:
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

                    case 3:
                        System.out.println("Acessando função de cadastro de Cliente:");
                        Cliente cliente = new Cliente();
                        try {
                            cliente.cadastrarCliente();
                        } catch (Exception e) {
                            System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
                        }
                        break;

                    case 4:
                        System.out.println("Verificar lista de clientes:");
                        Cliente exibirClientes = new Cliente();
                        exibirClientes.exibirClientesCadastrados();
                        break;

                    case 5:
                        System.out.println("Acessando a função estoque...");
                        EstoqueADD.AdicionarEstoque();
                        break;

                    case 0:
                        System.out.println("Saindo do menu de gerente.");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } while (opcao != 0);
        } else if (opcao == 2) {
            System.out.println("Você selecionou 'Não sou eu'.");
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}