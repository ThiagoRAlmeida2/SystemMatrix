package Ponto;
import BancoDeDados.Funcionario;
import java.util.Scanner;
import static BancoDeDados.Funcionario.encontrarFuncionario;

public class Ponto {
    public static void registrarPonto() {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário o ID do funcionário
        System.out.print("Digite o ID do funcionário: ");
        int id = scanner.nextInt();

        //Criar objeto (Funcionario)
        Funcionario funcionario = encontrarFuncionario(id);

        if (funcionario != null) {
            // Pedir ao usuário o horário de entrada
            System.out.print("Digite o horário de entrada (hh:mm): ");
            String horarioEntrada = scanner.next();

            // Pedir ao usuário o horário de saída
            System.out.print("Digite o horário de saída (hh:mm): ");
            String horarioSaida = scanner.next();

            //Mostra os horarios
            System.out.println("Detalhes do Funcionário:");
            System.out.println(funcionario);

            System.out.println("Horário de Entrada: " + horarioEntrada);
            System.out.println("Horário de Saída: " + horarioSaida);
        } else {
            System.out.println("Funcionário com ID " + id + " não encontrado.");
        }

        scanner.close();
    }

}
