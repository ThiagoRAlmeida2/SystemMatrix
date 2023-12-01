package repositorioBD;

import Conexao.ConexaoBD;
import gestaoPessoas.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CadastroCliente {
    public static void inserirCliente(Cliente Cliente) throws Exception{
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO Cliente(Nome, endereco, cpf, idade) VALUES (?,?,?,?)";

        conn = ConexaoBD.getConexao();
        ps = conn.prepareStatement(sql);

        ps.setString(1, Cliente.getNome());
        ps.setString(2, Cliente.getEndereco());
        ps.setString(3, Cliente.getCpf());
        ps.setInt(4, Cliente.getIdade());

        ps.executeUpdate();
        conn.close();
    }
}
