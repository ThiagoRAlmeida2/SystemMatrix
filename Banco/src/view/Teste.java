package view;

import gestaoBanco.Conta;
import gestaoBanco.poupanca;
public class Teste {
    public static void main(String[] args) {
        Conta c = new poupanca(030, "111112", 0.0, "Titular");;

        c.setAgencia(030);
        c.setNumero("111112");
        c.creditar(100.00);
        c.debitar(50.00);

        if(c instanceof poupanca) {
            ((poupanca) c).renderJuros(5.00);
        }else {
            System.out.println("classe poupança ainda não foi criada!!");
        }
    }
}
