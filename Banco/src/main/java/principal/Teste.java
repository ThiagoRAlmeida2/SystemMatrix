package principal;

import conexaoBD.Conexao;
import gestaoBanco.Conta;
import gestaoBanco.ContaPoupanca;

import java.sql.Connection;
import java.util.*;

public class Teste {
    public static void main(String[] args) {
        try{
            Connection conn  = Conexao.getConexao();
            System.out.println("Conexão realizada com sucesso!" );
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
