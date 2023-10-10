package principal;

import Controler.Controler;
import view.Menu;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
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
                case 2:
                    break;
                case 3: controler.mostrarSaldo();
                    break;
                case 4:
                    System.exit(0);
                default: System.out.println("Opção inválida!");
            }

            System.out.println("Deseja continuar?:");
            resposta = input.next();
        } while (resposta.equalsIgnoreCase("Sim"));
    }
}
