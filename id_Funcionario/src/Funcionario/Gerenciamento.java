package Funcionario;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Gerenciamento {

    public static class Funcionario {
        private int id;
        private String nome;
        private String sobrenome;
        private String cpf;
        private Date dataContratacao;
        private String cargo;
        private double salario;

        public Funcionario(int id, String nome, String sobrenome, String cpf, Date dataContratacao, String cargo, double salario) {
            this.id = id;
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.cpf = cpf;
            this.dataContratacao = dataContratacao;
            this.cargo = cargo;
            this.salario = salario;
        }

        public Funcionario() {

        }

        public int getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public String getSobrenome() {
            return sobrenome;
        }

        public String getCpf() {
            return cpf;
        }

        public Date getDataContratacao() {
            return dataContratacao;
        }

        public String getCargo() {
            return cargo;
        }

        public double getSalario() {
            return salario;
        }

        @Override
        public String toString() {
            return "Funcionario{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    ", sobrenome='" + sobrenome + '\'' +
                    ", cpf='" + cpf + '\'' +
                    ", dataContratacao=" + dataContratacao +
                    ", cargo='" + cargo + '\'' +
                    ", salario=" + salario +
                    '}';
        }

        public void gerenteMenu(List<PedidoFerias> pedidosFerias) {
        }

        public static void cadastrarFuncionario(List<Funcionario> funcionarios) {
        }
    }

    public static class PedidoFerias {
        private String funcionarioNome;
        private int dias;

        public PedidoFerias(String funcionarioNome, int dias) {
            this.funcionarioNome = funcionarioNome;
            this.dias = dias;
        }

        public String getFuncionarioNome() {
            return funcionarioNome;
        }

        public int getDias() {
            return dias;
        }
    }

    public static class Vendedor extends Funcionario {
        private double vendasRealizadas;
        private double comissao;
        private double metasVendas;

        public Vendedor(int id, String nome, String sobrenome, String cpf, Date dataContratacao, String cargo, double salario, double vendasRealizadas, double comissao, double metasVendas) {
            super(id, nome, sobrenome, cpf, dataContratacao, cargo, salario);

            this.vendasRealizadas = vendasRealizadas;
            this.comissao = comissao;
            this.metasVendas = metasVendas;
        }

        public double getVendasRealizadas() {
            return vendasRealizadas;
        }

        public void setVendasRealizadas(double vendasRealizadas) {
            this.vendasRealizadas = vendasRealizadas;
        }

        public double getComissao() {
            return comissao;
        }

        public void setComissao(double comissao) {
            this.comissao = comissao;
        }

        public double getMetasVendas() {
            return metasVendas;
        }

        public void setMetasVendas(double metasVendas) {
            this.metasVendas = metasVendas;
        }
    }

    public static class Gerente extends Funcionario {
        private int numeroEquipe;
        private double metasVendas;

        public Gerente(int id, String nome, String sobrenome, String cpf, Date dataContratacao,
                       String cargo, double salario, int numeroEquipe, double metasVendas) {
            super(id, nome, sobrenome, cpf, dataContratacao, cargo, salario);

            this.numeroEquipe = numeroEquipe;
            this.metasVendas = metasVendas;
        }

        public Gerente() {
            super();
        }

        public int getNumeroEquipe() {
            return numeroEquipe;
        }

        public double getMetasVendas() {
            return metasVendas;
        }
    }

    public static List<Gerente> listaDeGerentes = new ArrayList<>();

    public static void cadastrarGerente(int id, String nome, String sobrenome, String cpf, Date dataContratacao,
                                        String cargo, double salario, int numeroEquipe, double metasVendas) {
        Gerente gerente = new Gerente(id, nome, sobrenome, cpf, dataContratacao, cargo, salario, numeroEquipe, metasVendas);
        listaDeGerentes.add(gerente);
        salvarGerentes();
    }

    private static boolean idJaExiste(int id) {
        for (Gerente gerente : listaDeGerentes) {
            if (gerente.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static void carregarGerentes() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("gerentes.dat"))) {
            listaDeGerentes = (List<Gerente>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Em caso de erro ou arquivo não encontrado, não faz nada
        }
    }

    public static void salvarGerentes() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("gerentes.dat"))) {
            oos.writeObject(listaDeGerentes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
