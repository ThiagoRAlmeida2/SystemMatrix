package Controler;

import gestaoBanco.Conta;
import java.util.Scanner;

public class Controler {
    Scanner input = new Scanner(System.in);
    Conta conta = null;
    String numero, titular;
    double saldo, limiteConta;
    int agencia;

    public void criarConta(){
        System.out.println("Digite o numero da Conta: ");
        numero = input.next();
        conta.setNumero(numero);
        System.out.println("Digite a Agencia: ");
        agencia = input.nextInt();
        conta.setAgencia(agencia);
        System.out.println("Digite o nome do Titular: ");
        titular = input.next();
        conta.setTitularConta(titular);
        System.out.println("Digite o limite da conta: ");
        limiteConta = input.nextDouble();
        conta.setLimiteConta(limiteConta);

        conta = new Conta(agencia, numero, saldo, limiteConta, titular);
    }
    public void mostrarSaldo(){
        if (conta != null) {
            System.out.println("O saldo da conta de: " + conta.getTitularConta()
                    + " é o valor de R$: " + conta.getSaldo());
        } else {
            System.out.println("A conta ainda não foi criada!");
        }
    }

    public static void main(String[] args) {
        Controler controler = new Controler();
        controler.criarConta();
        controler.mostrarSaldo();
    }
}
