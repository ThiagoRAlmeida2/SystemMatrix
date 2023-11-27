package view;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Ponto.Ponto;
import gestaoFuncionario.Gerenciamento;
import gestaoFuncionario.Id_Funcionario;
import gestaoFuncionario.Gerenciamento.Funcionario;
import gestaoFuncionario.Gerenciamento.PedidoFerias;
import gestaoPessoas.Gerente;
import gestaoPessoas.Vendedor;

public class Menu {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Funcionario> funcionarios = new ArrayList<>();
            List<PedidoFerias> pedidosFerias = new ArrayList<>();

            int escolha;

            do {
                System.out.println("Olá, Bem-vindo ao sistema");
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Cadastro de Funcionário");
                System.out.println("2 - Bater Ponto");
                System.out.println("3 - Acessar como Gerente");
                System.out.println("4 - Acessar como vendedor");
                System.out.println("0 - Sair");
                System.out.println("Digite uma opção:");

                escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                    case 1:
                        System.out.println("Você escolheu Cadastro de Funcionário.");
                        Id_Funcionario.cadastrarFuncionario();
                        break;
                    case 2:
                        System.out.println("Você escolheu Bater Ponto.");
                        Ponto.registrarPonto();
                        break;
                    case 3:
                        System.out.println("Você selecionou a opção Acessar como Gerente");
                        Gerente gerente = new Gerente();
                        Gerente.gerente(null);
                        break;
                    case 4:
                        System.out.println("Você selecionou a opção Acessar como vendedor.");
                        Vendedor vendedor = new Vendedor();
                        Vendedor.FuncaoVendedor(null);
                        break;
                    case 0:
                        System.out.println("Saindo do sistema.");
                        break;
                    default:
                        System.out.println("Opção inválida. Escolha uma opção válida.");
                }
            } while (escolha != 0);

            scanner.close();
    }
}