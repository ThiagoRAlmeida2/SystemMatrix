package gestaoBanco;

public class poupanca extends Conta {
    public poupanca(int agencia, String numero, double limiteConta, String titularConta) {
        super(agencia, numero, limiteConta, limiteConta, titularConta);
    }

    public void renderJuros(double taxa) {
        double saldoAtual = getSaldo();
        creditar(saldoAtual * taxa);
    }
}
