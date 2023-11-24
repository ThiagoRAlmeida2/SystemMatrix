package execoes;

public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException(){
        super("Saldo  insuficiente para esta operação!");
    }
}
