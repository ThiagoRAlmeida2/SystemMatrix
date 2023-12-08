package Ponto;
import java.util.Scanner;

import gestaoPessoas.Funcionario;

public class Ponto {
    public static void registrarPonto() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID do funcionário: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Funcionario funcionario = Funcionario.encontrarFuncionario(id);

        if (funcionario != null) {
            System.out.print("Digite o horário de entrada (hh:mm): ");
            String horarioEntrada = scanner.next();
            System.out.print("Digite o horário de saída (hh:mm): ");
            String horarioSaida = scanner.next();

            System.out.println("Detalhes do Funcionário:");
            System.out.println(funcionario);
            System.out.println("Horário de Entrada: " + horarioEntrada);
            System.out.println("Horário de Saída: " + horarioSaida);
        } else {
            System.out.println("Funcionário com ID " + id + " não encontrado.");
        }
    }
}