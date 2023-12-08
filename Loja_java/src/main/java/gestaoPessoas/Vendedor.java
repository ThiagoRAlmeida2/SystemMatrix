package gestaoPessoas;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import gestaoFuncionario.Gerenciamento;
import interfaceLoja.Pessoa;
import loja.Caixa;
import loja.EstoqueADD;



public class Vendedor extends Pessoa {
    private int id;
    private Date dataContratacao;
    private String nome;

    public Vendedor (int id, String nome, String endereco, String cpf, Date dataContratacao, String cargo, int idade) {
        super(nome,endereco, cargo, cpf, idade);
        this.id = id;
        this.dataContratacao = dataContratacao;
        this.nome = nome;
    }

    public Vendedor() {
    }
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Vendedor verificarIdVendedor(List<Vendedor> vendedores, int id) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getId() == id) {
                return vendedor;
            }
        }
        return null;
    }

    public void funcaoVendedor(Gerenciamento gerenciamento) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema, Vendedor!");
        List<Gerenciamento.PedidoFerias> pedidosFerias = Gerenciamento.PedidoFerias.obterListaDePedidosFerias();
        int opcao;

        Vendedor vendedorEncontrado = null;

        while (vendedorEncontrado == null) {
            System.out.println("Digite o ID de vendedor:");
            int idDigitado = scanner.nextInt();
            scanner.nextLine();

            vendedorEncontrado = verificarIdVendedor(gerenciamento.vendedores, idDigitado);

            if (vendedorEncontrado != null) {
                System.out.println("Bem-Vindo, " + vendedorEncontrado.getNome() + "!");
            } else {
                System.out.println("Id de vendedor não encontrado. Tente novamente.");
            }
        }

        do {
            System.out.println("Selecione a seguinte opção");
            System.out.println("1 - Caixa");
            System.out.println("2 - Verificar Horários");
            System.out.println("3 - Pedido de Férias");
            System.out.println("4 - Estoque");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Você selecionou a opção Caixa.");
                    Caixa.FuncaoCaixa();
                    break;

                case 2:
                    System.out.println("Você selecionou a opção Verificar Horários.");
                    int horasTrabalhadas = Gerenciamento.HorarioTrabalhado();
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

                        String funcionarioNome = getNome();
                        Gerenciamento.PedidoFerias pedidoFerias = new Gerenciamento.PedidoFerias(funcionarioNome, diasDesejados);

                        pedidosFerias.add(pedidoFerias);

                        System.out.println("Pedido de férias registrado com sucesso para " + funcionarioNome + " (" + diasDesejados + " dias).");
                    } else {
                        System.out.println("Quantidade de dias inválida. Por favor, digite um valor entre 1 e 30.");
                    }
                    break;

                case 4:
                    System.out.println("Você selecionou a opção Estoque:");
                    EstoqueADD.AdicionarEstoque();
                    break;
                case 0:
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
            }
        } while (opcao != 0);
    }
}