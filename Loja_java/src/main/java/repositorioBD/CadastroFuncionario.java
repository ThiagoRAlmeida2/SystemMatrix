package repositorioBD;

import Conexao.ConexaoBD;
import gestaoPessoas.Funcionario;
import interfaceLoja.CadastroPessoas;
import interfaceLoja.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CadastroFuncionario {
    public static void inserirFuncionario(Funcionario Funcionario) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO funcionario(id, nome, cargo, cpf, endereco, idade, carteira) VALUES (?,?,?,?,?,?,?)";

        conn = ConexaoBD.getConexao();
        ps = conn.prepareStatement(sql);
        ps.setInt(1, Funcionario.getId());
        ps.setString(2, Funcionario.getNome());
        ps.setString(3, Funcionario.getCargo());
        ps.setString(4, Funcionario.getCpf());
        ps.setString(5, Funcionario.getEndereco());
        ps.setInt(6, Funcionario.getIdade());
        ps.setString(7, Funcionario.getCarteira());

        ps.executeUpdate();
        conn.close();
    }
}

