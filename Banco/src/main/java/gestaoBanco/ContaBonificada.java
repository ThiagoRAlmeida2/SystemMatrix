package gestaoBanco;

public class ContaBonificada extends Conta{
    private double bonus;

    public ContaBonificada(int agencia, String numero, double saldo, double limiteConta, String titularConta){
        super(agencia, numero, saldo, limiteConta, titularConta);
    }

    public double getBonus(){
        return bonus;
    }

    public void renderBonus(){
        super.creditar(this.bonus);
        this.bonus = 0.00;
    }

    @Override
    public void creditar(double valor){
        this.bonus = this.bonus + (valor * 0.50);
        super.creditar(valor);
    }

    public void aumentarLimiteConta(double valor){
        if (getSaldo() >= 50.00){
            setLimiteConta(bonus + valor * 0.02);
        }
    }
}
