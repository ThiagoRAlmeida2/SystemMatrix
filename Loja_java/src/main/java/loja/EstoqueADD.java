package loja;
import java.util.*;

import gestaoPessoas.Vendedor;

public class EstoqueADD {

	public static void AdicionarEstoque(Object o) {
		Estoque ref = new Estoque();
        Scanner scan = new Scanner(System.in);
        int entrada, opc, quantidade;

        
        while (true) {
        System.out.println("\nDigite a opção que você deseja:");
        System.out.println("1: adicionar estoque.\n2: mostrar estoque atual.\n3: sair.\n");
        System.out.print("Opção: ");
        entrada = scan.nextInt();

        if (entrada == 1) {
            System.out.println("\nDigite a opção:");
            System.out.println("1001: Camisa Social\n1002: Camisa Polo\n1003: Regata\n1004: Camisa Estampada\n1005: Camisa Agostinho Carrara\n1006: Bermuda Jeans\n1007: Bermuda de Treino\n1008: Shorts de Praia\n1009: Calça Jeans\n1010: Calça de Moletom\n1011: Calça Social\n1012: Cueca Box\n1013: Cueca Copinho\n1014: Cueca CK\n1015: Sapato Social\n1016: Sapato Tênis\n1017: Sapato Cano Longo\n1018: Bota\n1019: Havaianas\n1020: Kenner\n1021: Vestidos\n1022: Camisa Feminina\n1023: Camisa Jeans Feminina\n1024: Top\n1025: Calça Feminina\n1026: Saia\n1027: Mini Saia\n1028: Biquíni Parte de Cima\n1029: Biquíni Parte de Baixo\n1030: Biquíni Conjunto\n1031: Calcinha\n1032: Calcinha Fio Dental\n1033: Salto\n1034: Rasteirinha\n1035: Bota Feminina\n1036: Sapato Feminino\n");
            System.out.print("Opção: ");
            opc = scan.nextInt();

            System.out.println("\nDigite a quantidade:");
            quantidade = scan.nextInt();
            System.out.println();

            switch (opc) {
                case 1001: ref.CamisaSocial += quantidade; break;
                case 1002: ref.CamisaPolo += quantidade; break;
                case 1003: ref.Regata += quantidade; break;
                case 1004: ref.CamisaEstampada += quantidade; break;
                case 1005: ref.CamisaAgostinhoCarrara += quantidade; break;
                case 1006: ref.BermudaJeans += quantidade; break;
                case 1007: ref.BermudaTreino += quantidade; break;
                case 1008: ref.ShortsDePraia += quantidade; break;
                case 1009: ref.CalcaJeans += quantidade; break;
                case 1010: ref.CalcaDeMoletom += quantidade; break;
                case 1011: ref.CalcaSocial += quantidade; break;
                case 1012: ref.CuecaBox += quantidade; break;
                case 1013: ref.CuecaCopinho += quantidade; break;
                case 1014: ref.CuecaCK += quantidade; break;
                case 1015: ref.SapatoSocial += quantidade; break;
                case 1016: ref.SapatoTenis += quantidade; break;
                case 1017: ref.SapatoCanoLongo += quantidade; break;
                case 1018: ref.Bota += quantidade; break;
                case 1019: ref.Havainas += quantidade; break;
                case 1020: ref.Kenner += quantidade; break;
                case 1021: ref.Vestidos += quantidade; break;
                case 1022: ref.CamisaFeminina += quantidade; break;
                case 1023: ref.CamisaJeansFeminina += quantidade; break;
                case 1024: ref.Top += quantidade; break;
                case 1025: ref.CalcaFeminina += quantidade; break;
                case 1026: ref.Saia += quantidade; break;
                case 1027: ref.Minissaia += quantidade; break;
                case 1028: ref.BiquiniParteCima += quantidade; break;
                case 1029: ref.BiquiniParteBaixo += quantidade; break;
                case 1030: ref.BiquiniConjunto += quantidade; break;
                case 1031: ref.Calcinha += quantidade; break;
                case 1032: ref.CalcinhaFioDental += quantidade; break;
                case 1033: ref.Salto += quantidade; break;
                case 1034: ref.Rasteirinha += quantidade; break;
                case 1035: ref.BotaFeminina += quantidade; break;
                case 1036: ref.SapatoFeminino += quantidade; break;
                default: System.out.println("Opção inválida!");
            }
        } else if (entrada == 2) {
    		
    		System.out.printf("\nQuantidade atual:\nCamisa Social: %d\nCamisa Polo: %d\nRegata: %d\nCamisa Estampada: %d\nCamisa Agostinho Carrara: %d\nBermuda Jeans: %d\nBermuda de Treino: %d\nShorts de Praia: %d\nCalça Jeans: %d\nCalça de Moletom: %d\nCalça Social: %d\nCueca Box: %d\nCueca Copinho: %d\nCueca CK: %d\nSapato Social: %d\nSapato Tênis: %d\nSapato Cano Longo: %d\nBota: %d\nHavaianas: %d\nKenner: %d\nVestidos: %d\nCamisa Feminina: %d\nCamisa Jeans Feminina: %d\nTop: %d\nCalça Feminina: %d\nSaia: %d\nMini Saia: %d\nBiquíni Parte de Cima: %d\nBiquíni Parte de Baixo: %d\nBiquíni Conjunto: %d\nCalcinha: %d\nCalcinha Fio Dental: %d\nSalto: %d\nRasteirinha: %d\nBota Feminina: %d\nSapato Feminino: %d\n", ref.CamisaSocial, ref.CamisaPolo, ref.Regata, ref.CamisaEstampada, ref.CamisaAgostinhoCarrara, ref.BermudaJeans, ref.BermudaTreino, ref.ShortsDePraia, ref.CalcaJeans, ref.CalcaDeMoletom, ref.CalcaSocial, ref.CuecaBox, ref.CuecaCopinho, ref.CuecaCK, ref.SapatoSocial, ref.SapatoTenis, ref.SapatoCanoLongo, ref.Bota, ref.Havainas, ref.Kenner, ref.Vestidos, ref.CamisaFeminina, ref.CamisaJeansFeminina, ref.Top, ref.CalcaFeminina, ref.Saia, ref.Minissaia, ref.BiquiniParteCima, ref.BiquiniParteBaixo, ref.BiquiniConjunto, ref.Calcinha, ref.CalcinhaFioDental, ref.Salto, ref.Rasteirinha, ref.BotaFeminina, ref.SapatoFeminino);
    		
    	} else if (entrada == 3) {
    		Vendedor vendedor = new Vendedor();
            Vendedor.FuncaoVendedor(null);
            
    	} else {
    		System.out.println("Opção inválida");
    	}
	}
    }
}