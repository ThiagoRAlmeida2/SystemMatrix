package Conexao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class ConexaoBD {
    public static Connection getConexao() throws Exception {
        Connection conn;
        String urlConexao = "jdbc:mysql://localhost/Loja_java";
        String user = "King";
        String psw = "Thiagomitosis12!";

        DriverManager.registerDriver(new  com.mysql.cj.jdbc.Driver());
        conn = DriverManager.getConnection(urlConexao, user, psw);

        return conn;
    }
}