package loja;
import java.util.*;

public class Caixa {

    public static void FuncaoCaixa(Object o) {
        Estoque ref = new Estoque();
        Scanner scan = new Scanner(System.in);
        int aux = 1, opcao, qtd;
        double totalCompra = 0;
        
        while(aux != 0) {
            System.out.println("Digite o código do produto, digite 1 para cancelar a compra ou digite 0 para finalizar");
            opcao = scan.nextInt();

            switch (opcao) {
            
            case 1:
            	System.out.println("Compra cancelada! retornando ao sistema de vendedor");
            	aux = 0;
            	totalCompra = 0;
            	break;
            	
                case 1001:
                    System.out.println("Camisa social: R$ 59,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.CamisaSocial) {
                        totalCompra = totalCompra + (qtd * ref.PrecoCamisaSocial);
                        ref.CamisaSocial -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;
                
                case 1002:
                    System.out.println("Camisa Polo: R$ 39,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.CamisaPolo) {
                        totalCompra = totalCompra + (qtd * ref.PrecoCamisaPolo);
                        ref.CamisaPolo -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1003:
                    System.out.println("Regata: R$ 39,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.Regata) {
                        totalCompra = totalCompra + (qtd * ref.PrecoRegata);
                        ref.Regata -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1004:
                    System.out.println("Camisa Estampada: R$ 179,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.CamisaEstampada) {
                        totalCompra = totalCompra + (qtd * ref.PrecoCamisaEstampada);
                        ref.CamisaEstampada -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1005:
                    System.out.println("Camisa Agostinho Carrara: R$ 79,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.CamisaAgostinhoCarrara) {
                        totalCompra = totalCompra + (qtd * ref.PrecoCamisaAgostinhoCarrara);
                        ref.CamisaAgostinhoCarrara -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1006:
                    System.out.println("Bermuda Jeans: R$ 199,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.BermudaJeans) {
                        totalCompra = totalCompra + (qtd * ref.PrecoBermudaJeans);
                        ref.BermudaJeans -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1007:
                    System.out.println("Bermuda Treino: R$ 69,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.BermudaTreino) {
                        totalCompra = totalCompra + (qtd * ref.PrecoBermudaTreino);
                        ref.BermudaTreino -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1008:
                    System.out.println("Shorts de Praia: R$ 106,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.ShortsDePraia) {
                        totalCompra = totalCompra + (qtd * ref.PrecoShortsDePraia);
                        ref.ShortsDePraia -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1009:
                    System.out.println("Calça Jeans: R$ 189,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.CalcaJeans) {
                        totalCompra = totalCompra + (qtd * ref.PrecoCalcaJeans);
                        ref.CalcaJeans -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1010:
                    System.out.println("Calça de Moletom: R$ 129,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.CalcaDeMoletom) {
                        totalCompra = totalCompra + (qtd * ref.PrecoCalcaDeMoletom);
                        ref.CalcaDeMoletom -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1011:
                    System.out.println("Calça Social: R$ 129,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.CalcaSocial) {
                        totalCompra = totalCompra + (qtd * ref.PrecoCalcaSocial);
                        ref.CalcaSocial -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1012:
                    System.out.println("Cueca Box: R$ 19,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.CuecaBox) {
                        totalCompra = totalCompra + (qtd * ref.PrecoCuecaBox);
                        ref.CuecaBox -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;
                
                case 1013:
                    System.out.println("Cueca Copinho: R$ 14,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.CuecaCopinho) {
                        totalCompra = totalCompra + (qtd * ref.PrecoCuecaCopinho);
                        ref.CuecaCopinho -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1014:
                    System.out.println("Cueca CK: R$ 29,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.CuecaCK) {
                        totalCompra = totalCompra + (qtd * ref.PrecoCuecaCK);
                        ref.CuecaCK -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;
                
                case 1015:
                    System.out.println("Sapato Social: R$ 269,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.SapatoSocial) {
                        totalCompra = totalCompra + (qtd * ref.PrecoSapatoSocial);
                        ref.SapatoSocial -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1016:
                    System.out.println("Sapato Tênis: R$ 219,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.SapatoTenis) {
                        totalCompra = totalCompra + (qtd * ref.PrecoSapatoTenis);
                        ref.SapatoTenis -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;
                
                case 1017:
                    System.out.println("Sapato Cano Longo: R$ 149,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.SapatoCanoLongo) {
                        totalCompra = totalCompra + (qtd * ref.PrecoSapatoCanoLongo);
                        ref.SapatoCanoLongo -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;
                
                case 1018:
                    System.out.println("Bota: R$ 119,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.Bota) {
                        totalCompra = totalCompra + (qtd * ref.PrecoBota);
                        ref.Bota -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;
                
                case 1019:
                    System.out.println("Havaianas: R$ 19,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.Havainas) {
                        totalCompra = totalCompra + (qtd * ref.PrecoHavainas);
                        ref.Havainas -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;
                
                case 1020:
                    System.out.println("Kenner: R$ 129,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.Kenner) {
                        totalCompra = totalCompra + (qtd * ref.PrecoKenner);
                        ref.Kenner -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1021:
                    System.out.println("Vestidos: R$ 140,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.Vestidos) {
                        totalCompra = totalCompra + (qtd * ref.PrecoVestidos);
                        ref.Vestidos -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;
                
                case 1022:
                    System.out.println("Camisa Feminina: R$ 228,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.CamisaFeminina) {
                        totalCompra = totalCompra + (qtd * ref.PrecoCamisaFeminina);
                        ref.CamisaFeminina -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;
                
                case 1023:
                    System.out.println("Camisa Jeans Feminina: R$ 294,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.CamisaJeansFeminina) {
                        totalCompra = totalCompra + (qtd * ref.PrecoCamisaJeansFeminina);
                        ref.CamisaJeansFeminina -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1024:
                    System.out.println("Top: R$ 89,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.Top) {
                        totalCompra = totalCompra + (qtd * ref.PrecoTop);
                        ref.Top -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1025:
                    System.out.println("Calça Feminina: R$ 79,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.CalcaFeminina) {
                        totalCompra = totalCompra + (qtd * ref.PrecoCalcaFeminina);
                        ref.CalcaFeminina -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;
                
                case 1026:
                    System.out.println("Saia: R$ 22,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.Saia) {
                        totalCompra = totalCompra + (qtd * ref.PrecoSaia);
                        ref.Saia -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1027:
                    System.out.println("Minissaia: R$ 26,70");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.Minissaia) {
                        totalCompra = totalCompra + (qtd * ref.PrecoMinissaia);
                        ref.Minissaia -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;
                
                case 1028:
                    System.out.println("Biquíni Parte de Cima: R$ 49,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.BiquiniParteCima) {
                        totalCompra = totalCompra + (qtd * ref.PrecoBiquiniParteCima);
                        ref.BiquiniParteCima -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1029:
                    System.out.println("Biquíni Parte de Baixo: R$ 39,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.BiquiniParteBaixo) {
                        totalCompra = totalCompra + (qtd * ref.PrecoBiquiniParteBaixo);
                        ref.BiquiniParteBaixo -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;
                
                case 1030:
                    System.out.println("Biquíni Conjunto: R$ 84,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.BiquiniConjunto) {
                        totalCompra = totalCompra + (qtd * ref.PrecoBiquiniConjunto);
                        ref.BiquiniConjunto -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1031:
                    System.out.println("Calcinha: R$ 19,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.Calcinha) {
                        totalCompra = totalCompra + (qtd * ref.PrecoCalcinha);
                        ref.Calcinha -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1032:
                    System.out.println("Calcinha Fio Dental: R$ 39,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.CalcinhaFioDental) {
                        totalCompra = totalCompra + (qtd * ref.PrecoCalcinhaFioDental);
                        ref.CalcinhaFioDental -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1033:
                    System.out.println("Salto: R$ 89,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.Salto) {
                        totalCompra = totalCompra + (qtd * ref.PrecoSalto);
                        ref.Salto -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1034:
                    System.out.println("Rasteirinha: R$ 39,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.Rasteirinha) {
                        totalCompra = totalCompra + (qtd * ref.PrecoRasteirinha);
                        ref.Rasteirinha -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;
                
                case 1035:
                    System.out.println("Bota Feminina: R$ 99,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.BotaFeminina) {
                        totalCompra = totalCompra + (qtd * ref.PrecoBotaFeminina);
                        ref.BotaFeminina -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;

                case 1036:
                    System.out.println("Sapato Feminino: R$ 199,90");
                    System.out.println("Digite a quantidade:");
                    qtd = scan.nextInt();
                    if (qtd <= ref.SapatoFeminino) {
                        totalCompra = totalCompra + (qtd * ref.PrecoSapatoFeminino);
                        ref.SapatoFeminino -= qtd;
                    } else {
                        System.out.println("Quantidade indisponível em estoque!");
                    }
                    System.out.println("Total da compra R$: " + totalCompra);
                    break;
                
                case 0:
                    aux = 0;
                    break;

                default:
                    System.out.println("Código de produto inválido.\n");
                    break;
            }
	
            }
        
        while (totalCompra != 0) {
        	System.out.println("O total da compra foi R$: " + totalCompra);
        	System.out.print("Escolha a forma de pagamento (1)Dinheiro (2)Crédito (3)Débito: ");
        	int pagamento = scan.nextInt();
        
        	switch (pagamento) {
        		case 1:
        		
        			System.out.print("Digite o total pago pelo cliente: ");
        			double totalPago = scan.nextDouble();
        		
        			if (totalPago < totalCompra) {
        				while (totalPago < totalCompra) {
        					System.out.println("Valor insuficiente");
        					System.out.print("Digite o total pago pelo cliente: ");
            				totalPago = scan.nextDouble();
        				}
        				} else if (totalPago > totalCompra) {
        			
        		        double troco = totalPago - totalCompra;

        		            System.out.printf("O troco do cliente será: R$ %.2f \n", troco);
        		            System.out.println("Passe as seguintes notas e moedas:\n");

        		            int n100 = (int) (troco / 100);
        		            troco %= 100;

        		            int n50 = (int) (troco / 50);
        		            troco %= 50;

        		            int n20 = (int) (troco / 20);
        		            troco %= 20;

        		            int n10 = (int) (troco / 10);
        		            troco %= 10;

        		            int n5 = (int) (troco / 5);
        		            troco %= 5;

        		            int n2 = (int) (troco / 2);
        		            troco %= 2;

        		            int m1 = (int) (troco / 1);
        		            troco %= 1;

        		            int c50 = (int) (troco / 0.5);
        		            troco %= 0.5;

        		            int c25 = (int) (troco / 0.25);
        		            troco %= 0.25;

        		            int c10 = (int) (troco / 0.1);
        		            troco %= 0.1;

        		            int c5 = (int) Math.round(troco / 0.05);

        		            System.out.println("Notas de R$100: " + n100);
        		            System.out.println("Notas de R$50: " + n50);
        		            System.out.println("Notas de R$20: " + n20);
        		            System.out.println("Notas de R$10: " + n10);
        		            System.out.println("Notas de R$5: " + n5);
        		            System.out.println("Notas de R$2: " + n2);
        		            System.out.println("Moedas de R$1: " + m1);
        		            System.out.println("Moedas de R$0.50: " + c50);
        		            System.out.println("Moedas de R$0.25: " + c25);
        		            System.out.println("Moedas de R$0.10: " + c10);
        		            System.out.println("Moedas de R$0.05: " + c5);
        		            totalCompra = 0;

        		        } else {
        		            System.out.println("Não há troco a ser devolvido.");
        		            totalCompra = 0;
        		        }
        			
        		case 2:
        			System.out.println("Transação aprovada!");
        			totalCompra = 0;
        			break;
        		
        		case 3:
        			System.out.println("Transação aprovada!");
        			totalCompra = 0;
            		break;
            		
        		default:
        			System.out.println("Opção inválida!");
        			break;
        		    }
        }
        		}
        	
        		}