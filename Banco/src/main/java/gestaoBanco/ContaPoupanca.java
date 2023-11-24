package gestaoBanco;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, String numero, double saldo, double limiteConta, String titularConta){
       super(agencia, numero, saldo, limiteConta, titularConta);
    }

    public ContaPoupanca(){
        super();
    }

    public void renderJuros(double taxa){
        double saldoAtual = getSaldo();
        creditar(saldoAtual * taxa);
    }

    public void aumentarLimiteConta(double valor){
        if (getSaldo() >= 100.00){
            setLimiteConta(valor * 0.01);
        }
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
