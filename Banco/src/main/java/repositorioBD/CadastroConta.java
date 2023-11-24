package repositorioBD;

import conexaoBD.Conexao;
import gestaoBanco.Conta;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CadastroConta {

    public static void inserir(Conta conta) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO banco(agencia, numero_conta, saldo, limite_conta, titular_conta) VALUES (?,?,?,?,?)";

        conn = Conexao.getConexao();
        ps = conn.prepareStatement(sql);
        ps.setInt(1, conta.getAgencia());
        ps.setString(2, conta.getNumero());
        ps.setDouble(3, conta.getSaldo());
        ps.setDouble(4, conta.getLimiteConta());
        ps.setString(5, conta.getTitularConta());
        ps.executeUpdate();
        conn.close();
    }
}
