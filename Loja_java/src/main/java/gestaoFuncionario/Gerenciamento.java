package gestaoFuncionario;

import gestaoPessoas.Gerente;
import gestaoPessoas.Vendedor;

import java.util.*;

public class Gerenciamento {
    public List<Gerente> gerentes;
    public List<Vendedor> vendedores;

    public Gerenciamento() {
        gerentes = new ArrayList<>();
        vendedores = new ArrayList<>();
        adicionarGerente(45006, "Maria Isabel", "987.654.321-65");
        adicionarVendedores(123456, "João Paulo", "Rua Manoel", "65464", new Date(), "Vendedor", 20);
    }

    public void adicionarVendedores(int id, String nome, String endereco, String cpf, Date dataContratacao, String cargo, int idade) {
        Vendedor novoVendedor = new Vendedor(id, nome, endereco, cpf, dataContratacao, cargo, idade);
        vendedores.add(novoVendedor);
    }

    public void adicionarGerente(int id, String nome, String cpf) {
        Gerente novoGerente = new Gerente(id, nome, cpf, new Date(), "Gerente");
        gerentes.add(novoGerente);
    }

    public List<Gerente> gerentes() {
        return gerentes;
    }

    public static class PedidoFerias {
        private String funcionarioNome;
        private int dias;

        public PedidoFerias(String funcionarioNome, int dias) {
            this.funcionarioNome = funcionarioNome;
            this.dias = dias;
        }

        public int getDias() {
            return dias;
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
}
