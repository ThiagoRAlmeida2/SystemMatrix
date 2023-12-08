package view;

import Conexao.ConexaoBD;
import java.sql.Connection;

public class Teste {
    public static void main(String[] args) {
        try{
            Connection conn  = ConexaoBD.getConexao();
            System.out.println("Conexão realizada com sucesso!" );
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
