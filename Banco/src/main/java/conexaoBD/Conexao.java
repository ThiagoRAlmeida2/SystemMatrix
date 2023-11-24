package conexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection getConexao() throws Exception{
        Connection conn = null;
        String urlConexao = "jdbc:mysql://localhost/banco_ficr";
        String user = "root";
        String psw= "";

        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        conn = DriverManager.getConnection(urlConexao, user, psw);

        return conn;
    }
}
