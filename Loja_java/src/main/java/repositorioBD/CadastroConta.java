package repositorioBD;

import Conexao.ConexaoBD;
import gestaoFuncionario.Gerenciamento;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CadastroConta {
    public static void inserir(Gerenciamento.Funcionario Funcionario) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO funcionario(id, nome, sobrenome, cpf, dataContratacao, cargo, Salario) VALUES (?,?,?,?,?,?,?)";

        conn = ConexaoBD.getConexao();
        ps = conn.prepareStatement(sql);
        ps.setInt(1, Funcionario.getId());
        ps.setString(2, Funcionario.getNome());
        ps.setString(3, Funcionario.getSobrenome());
        ps.setString(4, Funcionario.getCpf());
        ps.setDate(5, Funcionario.getDataContratacao());
        ps.setString(6, Funcionario.getCargo());
        ps.setDouble(7, Funcionario.getSalario());

        ps.executeUpdate();
        conn.close();
    }
}
