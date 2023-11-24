package gestaoBanco;

import execoes.SaldoInsuficienteException;

public abstract class Conta {
    private int agencia;
    private String numero;
    private double saldo = 0.0;
    private double limiteConta;
    private String titularConta;

    public Conta (int agencia, String numero, double saldo, double limiteConta, String titularConta){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.limiteConta = limiteConta;
        this.titularConta = titularConta;
    }

    public Conta (double limiteConta, String titularConta){
        this.limiteConta = limiteConta;
        this.titularConta = titularConta;
    }

    public Conta (){

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

    public void debitar (double valor) throws SaldoInsuficienteException {
        if ((this.saldo <= 0) || (valor > this.saldo)){
            throw new SaldoInsuficienteException();
        }
        this.saldo -= valor;
    }

    public abstract void aumentarLimiteConta(double valor);

    public String toString(){
        return "[Agencia: " + this.agencia + " Numero da conta: " + this.numero
                + " Titular: " + this.titularConta + " Saldo: " + this.saldo
                + " Limite da Conta: " + this.limiteConta + "]";
    }
}
