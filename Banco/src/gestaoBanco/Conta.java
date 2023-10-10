package gestaoBanco;

public class Conta {
    private int agencia;
    private String numero;
    private double saldo = 0.00;
    private double limiteConta;
    private String titularConta;

    public Conta (int agencia, String numero, double limiteConta, double conta, String titularConta) {
        this.agencia = agencia;
        this.numero = numero;
        this.limiteConta = limiteConta;
        this.titularConta = titularConta;
    }
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(double limiteConta) {
        this.limiteConta = limiteConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public void creditar (double valor){
        this.saldo += valor;
    }

    public void debitar (double valor){
        this.saldo -= valor;
    }
}
