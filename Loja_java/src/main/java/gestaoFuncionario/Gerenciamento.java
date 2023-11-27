package gestaoFuncionario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Gerenciamento {

    public static class Funcionario {
        public static List<Funcionario> Gerenciamento;
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

        public Funcionario(int id, String nome, String sobrenome, String cpf, Date dataContratacao, String cargo) {
        }

        public int getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }
        public String getSobrenome(){
            return sobrenome;
        }

        public String getCpf() {
            return cpf;
        }

        public java.sql.Date getDataContratacao() {
            return (java.sql.Date) dataContratacao;
        }

        public String getCargo() {
            return cargo;
        }

        public double getSalario() {
            return salario;
        }
        public void setDataContratacao(Date dataContratacao) {
            this.dataContratacao = dataContratacao;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        public void setSalario(double salario) {
            this.salario = salario;
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
    }

    public static class PedidoFerias {
        private String funcionarioNome;
        private int dias;

        public PedidoFerias(String funcionarioNome, int dias) {
            this.funcionarioNome = funcionarioNome;
            this.dias = dias;
        }

        public void setDias(int dias) {
            this.dias = dias;
        }

        public int getDias() {
            return dias;
        }

        public void setFuncionarioNome(String funcionarioNome) {
            this.funcionarioNome = funcionarioNome;
        }

        public String getFuncionarioNome() {
            return funcionarioNome;
        }

        public static List<PedidoFerias> obterListaDePedidosFerias() {
            List<PedidoFerias> pedidosFerias = new ArrayList<>();

            pedidosFerias.add(new PedidoFerias("Maria", 10));
            pedidosFerias.add(new PedidoFerias("José", 15));
            pedidosFerias.add(new PedidoFerias("Ana", 20));

            return pedidosFerias;
        }
    }

    public static class Vendedor extends Funcionario {
        public Vendedor(int id, String nome, String sobrenome, String cpf, Date dataContratacao) {
            super(id, nome, sobrenome, cpf, dataContratacao, "Vendedor");
        }
    }

    public static List<Vendedor> listaDeVendedores = obterListaDeVendedores();

    public static List<Vendedor> obterListaDeVendedores() {
        List<Vendedor> vendedores = new ArrayList<>();

        vendedores.add(new Vendedor(100125, "João", "Silva", "123.456.789-01", new Date()));
        vendedores.add(new Vendedor(100274, "Ana", "Pereira", "987.654.321-09", new Date()));
        vendedores.add(new Vendedor(789632, "João", "Pedro", "458.456.789-96", new Date()));

        return vendedores;
    }

    public static int HorarioTrabalhado() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora de início (0-24): ");
        int horaInicio = scanner.nextInt();

        System.out.print("Digite a hora de fim (0-24): ");
        int horaFim = scanner.nextInt();

        int horasTrabalhadas = horaFim - horaInicio;

        if (horasTrabalhadas < 0) {
            System.out.println("Horário de fim deve ser após o horário de início.");
            horasTrabalhadas = 0;
        }

        return horasTrabalhadas;
    }
    public static class Gerente extends Funcionario {
        private int numeroEquipe;
        private double metasVendas;

        public Gerente(int id, String nome, String sobrenome, String cpf, Date dataContratacao, String cargo, int numeroEquipe, double metasVendas) {
            super(id, nome, sobrenome, cpf, dataContratacao, "Gerente", 0);
            this.numeroEquipe = numeroEquipe;
            this.metasVendas = metasVendas;
        }

        public Gerente() {
            super();
        }

        public void gerente() {
        }
    }

    public static List<Gerente> getListaDeGerentes() {
        return listaDeGerentes;
    }

    public static List<Gerente> listaDeGerentes = new ArrayList<>();

    public static List<Gerente> main() {
        List<Gerente> gerentes = new ArrayList<>();

        gerentes.add(new Gerente(45006, "Maria", "Isabel", "987.654.321-65", new Date(), "Gerente", 1, 100000));
        gerentes.add(new Gerente(45001, "José", "Santos", "456.789.123-87", new Date(), "Gerente", 1, 95000));
        gerentes.add(new Gerente(45007, "Ana", "Pereira", "275.548.647-78", new Date(), "Gerente", 1, 90000));
        return gerentes;
    }
}