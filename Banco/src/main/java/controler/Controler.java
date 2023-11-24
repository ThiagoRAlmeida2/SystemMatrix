package controler;

import execoes.SaldoInsuficienteException;
import repositorioBD.CadastroConta;
import repositorios.RepositorioContasLista;
import gestaoBanco.Conta;
import gestaoBanco.ContaPoupanca;
import interfaces.RepositorioContas;

import java.util.Scanner;

public class Controler {
    Scanner input = new Scanner(System.in);
    RepositorioContas contas;
    Conta conta;
//    Conta novaConta = new Conta();    //não pode ser instancia pois conta é asbtrata
    int agencia;
    String titular, numeroConta, contaBusca;
    double limiteConta, valor;

    public void criarConta() throws Exception {
        contas = new RepositorioContasLista();
        conta = new ContaPoupanca();
        System.out.println("Digite o numero da Agencia: ");
        agencia = input.nextInt();
        conta.setAgencia(agencia);
        System.out.println("Digite o numero da Conta: ");
        numeroConta = input.next();
        conta.setNumero(numeroConta);
        System.out.println("Digite o limite da Conta: ");
        limiteConta = input.nextDouble();
        conta.setLimiteConta(limiteConta);
        System.out.println("Digite o nome do Titular: ");
        titular = input.next();
        conta.setTitularConta(titular);
//        contas.inserir(conta);
        CadastroConta.inserir(conta);
    }

    public void procurarConta(){
        Conta procura;
        System.out.println("Digite o numero da conta a ser procurada: ");
        contaBusca = input.next();
        procura = contas.procurar(contaBusca);
        System.out.println("Informações da conta: " + procura);
    }

    public void mostrarSaldo(){
        System.out.println("O saldo da conta de: " + conta.getTitularConta()
                    + " é o valor de R$: " + conta.getSaldo());
    }

    public void removerConta(){
        System.out.println("Digite o numero da conta a ser deletada: ");
        contaBusca = input.next();
        contas.remover(contaBusca);
        System.out.println("Conta deletada com sucesso!");
    }

    public void listarContas(){
        System.out.println("===== Contas do Banco FICR =====");
        contas.listarContas();
    }

    public void realizarSaque() throws SaldoInsuficienteException {
        System.out.println("Digite o valor a sacar: ");
        valor = input.nextDouble();
        conta.debitar(valor);
    }

    public void solicitarAumentoLimiteConta(){
        System.out.println("Digite o valo a ser solicitado:");
        valor = input.nextDouble();
        conta.aumentarLimiteConta(valor);
    }
}