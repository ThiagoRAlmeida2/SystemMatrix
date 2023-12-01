package view;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Ponto.Ponto;
import gestaoFuncionario.funcionario_ID;
import gestaoFuncionario.Gerenciamento.Funcionario;
import gestaoFuncionario.Gerenciamento.PedidoFerias;
import gestaoPessoas.Gerente;
import gestaoPessoas.Cliente;
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
            System.out.println("1 - Acessar como Gerente");
            System.out.println("2 - Acessar como vendedor");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opção:");

            String input = scanner.nextLine();

            try {
                escolha = Integer.parseInt(input);

                switch (escolha) {
                    // Id de gerente (45006, 45001, 45007)
                    case 1:
                        System.out.println("Você selecionou a opção Acessar como Gerente");
                        Gerente gerente = new Gerente();
                        Gerente.gerente(null);
                        break;

                    case 2:
                        //Id de vendedor (100125, 100274, 789632, 4123745)
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
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                escolha = -1;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } while (escolha != 0);
    }
}
