package principal;

import controler.Controler;
import execoes.SaldoInsuficienteException;
import view.Menu;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        Controler controler = new Controler();
        String resposta;
        int op;

        do{
            menu.mostrarMenuPrincipal();
            op = input.nextInt();
            switch (op){
                case 1: controler.criarConta();
                    break;
                case 2: controler.procurarConta();
                    break;
                case 3: controler.removerConta();
                    break;
                case 4: controler.listarContas();
                    break;
                case 5: try {
                            controler.realizarSaque();
                        } catch (SaldoInsuficienteException e) {
                            System.out.println(e.getMessage());
                        } finally {
                            System.out.println("Realize um deposito na sua conta!");
                        }
                    break;
                case 6:
                    System.exit(0);
                default: System.out.println("Opção inválida!");
            }

            System.out.println("Deseja continuar?:");
            resposta = input.next();
        } while (resposta.equalsIgnoreCase("Sim"));
    }
}