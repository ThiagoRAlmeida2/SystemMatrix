#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

int main(){
    setlocale(LC_ALL, "Portuguese");
    int func, ponto;
    char id[6];
    FILE *file;
    
//Quantidade do estoque	
int CamisaSocial = 10;
int CamisaPolo = 0;
int Regata = 0;
int CamisaEstampada = 0;
int CamisaAgostinhoCarrara = 0;
int BermudaJeans = 0;
int BermudaTreino = 0;
int ShortsDePraia = 0;
int CalcaJeans = 0;
int CalcaDeMoletom = 0;
int CalcaSocial = 0;
int CuecaBox = 0;
int CuecaCopinho = 0;
int CuecaCK = 0;
int SapatoSocial = 0;
int SapatoTenis = 0;
int SapatoCanoLongo = 0;
int Bota = 0;
int Havainas = 0;
int Kenner = 0;
int Vestidos = 0;
int CamisaFeminina = 0;
int CamisaJeansFeminina = 0;
int Top = 0;
int CalcaFeminina = 0;
int Saia = 0;
int Minissaia = 0;
int BiquiniParteCima = 0;
int BiquiniParteBaixo = 0;
int BiquiniConjunto = 0;
int Calcinha = 0;
int CalcinhaFioDental = 0;
int Salto = 0;
int Rasteirinha = 0;
int BotaFeminina = 0;
int SapatoFeminino = 0;
//Preço dos itens
float PrecoCamisaSocial = 59.90;
float PrecoCamisaPolo = 39.90;
float PrecoRegata = 39.90;
float PrecoCamisaEstampada = 179.90;
float PrecoCamisaAgostinhoCarrara = 79.90;
float PrecoBermudaJeans = 199.90;
float PrecoBermudaTreino = 69.90;
float PrecoShortsDePraia = 106.90;
float PrecoCalcaJeans = 189.90;
float PrecoCalcaDeMoletom = 129.90;
float PrecoCalcaSocial = 129.90;
float PrecoCuecaBox = 19.90;
float PrecoCuecaCopinho = 14.90;
float PrecoCuecaCK = 29.90;
float PrecoSapatoSocial = 269.90;
float PrecoSapatoTenis = 219.90;
float PrecoSapatoCanoLongo = 149.90;
float PrecoBota = 119.90;
float PrecoHavainas = 19.90;
float PrecoKenner = 129.90;
float PrecoVestidos = 140.90;
float PrecoCamisaFeminina = 228.90;
float PrecoCamisaJeansFeminina = 294.90;
float PrecoTop = 89.90;
float PrecoCalcaFeminina = 79.90;
float PrecoSaia = 22.90;
float PrecoMinissaia = 26.70;
float PrecoBiquiniParteCima = 49.90;
float PrecoBiquiniParteBaixo = 39.90;
float PrecoBiquiniConjunto = 84.90;
float PrecoCalcinha = 19.90;
float PrecoCalcinhaFioDental = 39.90;
float PrecoSalto = 89.90;
float PrecoRasteirinha = 39.90;
float PrecoBotaFeminina = 99.90;
float PrecoSapatoFeminino = 199.90;

    
    printf("[Seja bem-vind@ ao sistema da loja]\n\n");
    
    while (1) {
    
    printf("Qual função você deseja acessar?\n");
    printf("(1)Bater o ponto.\n(2)Caixa\n(3)Estoque\n");
    printf("\nFunção: ");
    scanf("%d", &func);
    
    if(func == 1) { //Função de ponto
    	
    	file = fopen("pontos e referência dos funcionários.txt", "a");
			if (file == NULL) {
        		printf("Erro ao abrir o arquivo de log.\n");
        		perror("Erro ao abrir o arquivo de log");
        		return 1;}
    	
    	printf("\nVocê está entrando ou saíndo?\n");
        printf("(1)Entrando.\n(2)Saindo.");
        printf("\n\nResposta: ");
        scanf("%d", &ponto);
        
        if (ponto == 1) {
        	printf("\nDigite seu ID (apenas números)\n");
        	printf("ID: ");
        	scanf("%5s", id);
        
    		time_t t = time(NULL);
    		struct tm tm = *localtime(&t);
    		printf("Hora de entrada registrada: %02d:%02d:%02d\n\n", tm.tm_hour, tm.tm_min, tm.tm_sec);
    		fprintf(file, "Hora de entrada do funcionário %5s: %02d:%02d:%02d\n\n", id, tm.tm_hour, tm.tm_min, tm.tm_sec);
    	
		} else if (ponto == 2) {

        	printf("\nDigite seu ID (apenas números)");
        	printf("ID: ");
        	scanf("%5s", id);
        
    		time_t t = time(NULL);
    		struct tm tm = *localtime(&t);
    		printf("Hora de saída registrada: %02d:%02d:%02d\n\n", tm.tm_hour, tm.tm_min, tm.tm_sec);
    		fprintf(file, "Hora de saída do funcionário %5s: %02d:%02d:%02d\n\n", id, tm.tm_hour, tm.tm_min, tm.tm_sec);
    		
		} else {
			printf("Opção inválida!!");
		}
		fclose(file);
		
    } else if(func == 2) { //Função de caixa
    	
    	int n100, n50, n20, n10, n5, n2, m1, c50, c25, c10, c5;
    	int codigo, qtd, forma;
    	float compra = 0, pago, troco;
    	float trocoinicio;
//Nota Fiscal  	
int qtdCamisaSocial = 0;
int qtdCamisaPolo = 0;
int qtdRegata = 0;
int qtdCamisaEstampada = 0;
int qtdCamisaAgostinhoCarrara = 0;
int qtdBermudaJeans = 0;
int qtdBermudaTreino = 0;
int qtdShortsDePraia = 0;
int qtdCalcaJeans = 0;
int qtdCalcaDeMoletom = 0;
int qtdCalcaSocial = 0;
int qtdCuecaBox = 0;
int qtdCuecaCopinho = 0;
int qtdCuecaCK = 0;
int qtdSapatoSocial = 0;
int qtdSapatoTenis = 0;
int qtdSapatoCanoLongo = 0;
int qtdBota = 0;
int qtdHavainas = 0;
int qtdKenner = 0;
int qtdVestidos = 0;
int qtdCamisaFeminina = 0;
int qtdCamisaJeansFeminina = 0;
int qtdTop = 0;
int qtdCalcaFeminina = 0;
int qtdSaia = 0;
int qtdMinissaia = 0;
int qtdBiquiniParteCima = 0;
int qtdBiquiniParteBaixo = 0;
int qtdBiquiniConjunto = 0;
int qtdCalcinha = 0;
int qtdCalcinhaFioDental = 0;
int qtdSalto = 0;
int qtdRasteirinha = 0;
int qtdBotaFeminina = 0;
int qtdSapatoFeminino = 0;
    //desisti de comentar o que cada parte faz
	while (1)	{
		
		printf("Digite o codigo do produto, digite 1 para cancelar ou digite 0 para finalizar: ");
		scanf("%d", &codigo);
		
		if (codigo == 0) {
			break;
		} else if (codigo == 1) {
            printf("\nCompra cancelada!\n\n");
            compra = 0.0;
            break;
        } else {
		{
			printf("Digite a quantidade: ");
			scanf("%d", &qtd);
			
		if (codigo == 1001) {
    		if (qtd <= CamisaSocial) {
        		compra += PrecoCamisaSocial * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		CamisaSocial -= qtd;
        		qtdCamisaSocial += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1002) {
    		if (qtd <= CamisaPolo) {
        		compra += PrecoCamisaPolo * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		CamisaPolo -= qtd;
        		qtdCamisaPolo += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1003) {
    		if (qtd <= Regata) {
        		compra += PrecoRegata * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		Regata -= qtd;
        		qtdRegata += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1004) {
    		if (qtd <= CamisaEstampada) {
        		compra += PrecoCamisaEstampada * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		CamisaEstampada -= qtd;
        		qtdCamisaEstampada += qtd;
    		} else {
       			printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1005) {
    		if (qtd <= CamisaAgostinhoCarrara) {
        		compra += PrecoCamisaAgostinhoCarrara * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		CamisaAgostinhoCarrara -= qtd;
        		qtdCamisaAgostinhoCarrara += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1006) {
    		if (qtd <= BermudaJeans) {
        		compra += PrecoBermudaJeans * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		BermudaJeans -= qtd;
        		qtdBermudaJeans += qtd;
        		
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1007) {
			if (qtd <= BermudaTreino) {
        		compra += PrecoBermudaTreino * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		BermudaTreino -= qtd;
        		qtdBermudaTreino += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1008) {
			if (qtd <= ShortsDePraia) {
        		compra += PrecoShortsDePraia * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		ShortsDePraia -= qtd;
        		qtdShortsDePraia += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1009) {
			if (qtd <= CalcaJeans) {
        		compra += PrecoCalcaJeans * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		CalcaJeans -= qtd;
        		qtdCalcaJeans += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1010) {
			if (qtd <= CalcaDeMoletom) {
        		compra += PrecoCalcaDeMoletom * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		CalcaDeMoletom -= qtd;
        		qtdCalcaDeMoletom += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1011) {
			if (qtd <= CalcaSocial) {
        		compra += PrecoCalcaSocial * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		CalcaSocial -= qtd;
        		qtdCalcaSocial += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1012) {
			if (qtd <= CuecaBox) {
        		compra += PrecoCuecaBox * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		CuecaBox -= qtd;
        		qtdCuecaBox += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1013) {
			if (qtd <= CuecaCopinho) {
        		compra += PrecoCuecaCopinho * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		CuecaCopinho -= qtd;
        		qtdCuecaCopinho += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1014) {
			if (qtd <= CuecaCK) {
        		compra += PrecoCuecaCK * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		CuecaCK -= qtd;
        		qtdCuecaCopinho += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1015) {
			if (qtd <= SapatoSocial) {
        		compra += PrecoSapatoSocial * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		SapatoSocial -= qtd;
        		qtdSapatoSocial += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1016) {
			if (qtd <= SapatoTenis) {
        		compra += PrecoSapatoTenis * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		SapatoTenis -= qtd;
        		qtdSapatoTenis += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1017) {
			if (qtd <= SapatoCanoLongo) {
        		compra += PrecoSapatoCanoLongo * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		SapatoCanoLongo -= qtd;
        		qtdSapatoCanoLongo += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1018) {
			if (qtd <= Bota) {
        		compra += PrecoBota * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		Bota -= qtd;
        		qtdBota += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1019) {
			if (qtd <= Havainas) {
        		compra += PrecoHavainas * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		Havainas -= qtd;
        		qtdHavainas += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1020) {
			if (qtd <= Kenner) {
        		compra += PrecoKenner * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		Kenner -= qtd;
        		qtdKenner += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1021) {
			if (qtd <= Vestidos) {
        		compra += PrecoVestidos * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		Vestidos -= qtd;
        		qtdVestidos += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1022) {
			if (qtd <= CamisaFeminina) {
        		compra += PrecoCamisaFeminina * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		CamisaFeminina -= qtd;
        		qtdCamisaFeminina += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1023) {
			if (qtd <= CamisaJeansFeminina) {
        		compra += PrecoCamisaJeansFeminina * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		CamisaJeansFeminina -= qtd;
        		qtdCamisaJeansFeminina += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1024) {
			if (qtd <= Top) {
        		compra += PrecoTop * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		Top -= qtd;
        		qtdTop += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1025) {
			if (qtd <= CalcaFeminina) {
        		compra += PrecoCalcaFeminina * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		CalcaFeminina -= qtd;
        		qtdCalcaFeminina += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1026) {
			if (qtd <= Saia) {
        		compra += PrecoSaia * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		Saia -= qtd;
        		qtdSaia += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1027) {
			if (qtd <= Minissaia) {
        		compra += PrecoMinissaia * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		Minissaia -= qtd;
        		qtdMinissaia += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1028) {
			if (qtd <= BiquiniParteCima) {
        		compra += PrecoBiquiniParteCima * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		BiquiniParteCima -= qtd;
        		qtdBiquiniParteCima += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1029) {
			if (qtd <= BiquiniParteBaixo) {
        		compra += PrecoBiquiniParteBaixo * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		BiquiniParteBaixo -= qtd;
        		qtdBiquiniParteBaixo += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1030) {
			if (qtd <= BiquiniConjunto) {
        		compra += PrecoBiquiniConjunto * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		BiquiniConjunto -= qtd;
        		qtdBiquiniConjunto += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1031) {
			if (qtd <= Calcinha) {
        		compra += PrecoCalcinha * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		Calcinha -= qtd;
        		qtdCalcinha += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1032) {
			if (qtd <= CalcinhaFioDental) {
        		compra += PrecoCalcinhaFioDental * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		CalcinhaFioDental -= qtd;
        		qtdCalcinhaFioDental += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1033) {
			if (qtd <= Salto) {
        		compra += PrecoSalto * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		BermudaJeans -= qtd;
        		qtdBermudaJeans += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1034) {
			if (qtd <= Rasteirinha) {
        		compra += PrecoRasteirinha * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		Rasteirinha -= qtd;
        		qtdRasteirinha += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1035) {
			if (qtd <= BotaFeminina) {
        		compra += PrecoBotaFeminina * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		BotaFeminina -= qtd;
        		qtdBotaFeminina += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else if (codigo == 1036) {
			if (qtd <= SapatoFeminino) {
        		compra += PrecoSapatoFeminino * qtd;
        		printf("\nO valor atual da compra é: %.2f\n\n", compra);
        		SapatoFeminino -= qtd;
        		qtdSapatoFeminino += qtd;
    		} else {
        		printf("Quantidade insuficiente no estoque!\n\n");
    		}
		} else {
			printf("Codigo inválido!!");
		}
		}
		}
	}
		if (compra == 0) {
			printf("Compra sem valor cancelada!\n\n");
		} else {
			int idvenda;
			printf("Digite o ID do funcionario que atendeu o cliente");
			scanf("%d", &idvenda);
			printf("Informe a forma de pagamento:\n1: Dinheiro\n2: Cartão\nOpção:");
			
			scanf("%d", &forma);
			printf("\n\n");
			
		if (forma == 1) {
			
		while(1) {
		printf("O valor total da compra é: %.2f\n", compra);
		printf("Digite o valor total pago pelo cliente: ");
		scanf("%f", &pago);
	
		troco = pago - compra;
		trocoinicio = troco;
		
		if (pago > compra) {
		printf("O troco do cliente será: %.2f \n", troco);
		printf("Passe as seguintes notas: \n\n");
	
			n100 = troco / 100;
			troco = fmod(troco, 100);
		
			n50 = troco / 50;
			troco = fmod(troco, 50);
		
			n20 = troco / 20;
			troco = fmod(troco, 20);
		
			n10 = troco / 10;
			troco = fmod(troco, 10);
		
		 	 n5 = troco / 5;
			troco = fmod(troco, 5);
		
			n2 = troco / 2;
			troco = fmod(troco, 2);
		
			m1 = troco / 1;
    		troco = fmod(troco, 1);

    		c50 = troco / 0.5;
    		troco = fmod(troco, 0.5);

    		c25 = troco / 0.25;
    		troco = fmod(troco, 0.25);

    		c10 = troco / 0.1;
    		troco = fmod(troco, 0.1);

    		c5 = round(troco / 0.05);

		
		printf("Notas de R$100: %d\n", n100);
    	printf("Notas de R$50: %d\n", n50);
    	printf("Notas de R$20: %d\n", n20);
    	printf("Notas de R$10: %d\n", n10);
    	printf("Notas de R$5: %d\n", n5);
    	printf("Notas de R$2: %d\n", n2);
    	printf("Moedas de R$1: %d\n", m1);
    	printf("Moedas de R$0.50: %d\n", c50);
    	printf("Moedas de R$0.25: %d\n", c25);
    	printf("Moedas de R$0.10: %d\n", c10);
    	printf("Moedas de R$0.05: %d\n\n", c5);
    	
    	 file = fopen("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\Faculdade\\Logica matematica e algoritmo\\registro de vendas.txt", "a");
			if (file == NULL) {
        		printf("Erro ao abrir o arquivo de log.\n");
        		perror("Erro ao abrir o arquivo de log");
        		return 1;
			}

		fprintf(file, "\n----------------------------------\n");
        time_t t = time(NULL);
 		struct tm tm = *localtime(&t);		
 		fprintf(file, "Data e hora de confirmação da compra: %02d/%02d/%04d %02d:%02d:%02d\n\n", tm.tm_mday, tm.tm_mon + 1, tm.tm_year + 1900, tm.tm_hour, tm.tm_min, tm.tm_sec);
    	
    	if (qtdCamisaSocial >= 1) {
    		fprintf(file, "Camisa Social......x%d\n", qtdCamisaSocial);
		} if (qtdCamisaPolo >= 1) {
		    fprintf(file, "Camisa Polo......x%d\n", qtdCamisaPolo);
		} if (qtdRegata >= 1) {
    		fprintf(file, "Regata......x%d\n", qtdRegata);
		} if (qtdCamisaEstampada >= 1) {
		    fprintf(file, "Camisa Estampada......x%d\n", qtdCamisaEstampada);
		} if (qtdCamisaAgostinhoCarrara >= 1) {
    		fprintf(file, "Camisa Agostinho Carrara......x%d\n", qtdCamisaAgostinhoCarrara);
		} if (qtdBermudaJeans >= 1) {
		    fprintf(file, "Bermuda Jeans......x%d\n", qtdBermudaJeans);
		} if (qtdBermudaTreino >= 1) {
    		fprintf(file, "Bermuda de Treino......x%d\n", qtdBermudaTreino);
		} if (qtdShortsDePraia >= 1) {
		    fprintf(file, "Shorts de Praia......x%d\n", qtdShortsDePraia);
		} if (qtdCalcaJeans >= 1) {
		    fprintf(file, "Calça Jeans......x%d\n", qtdCalcaJeans);
		} if (qtdCalcaDeMoletom >= 1) {
    		fprintf(file, "Calça de Moletom......x%d\n", qtdCalcaDeMoletom);
		} if (qtdCalcaSocial >= 1) {
		    fprintf(file, "Calça Social......x%d\n", qtdCalcaSocial);
		} if (qtdCuecaBox >= 1) {
    		fprintf(file, "Cueca Box......x%d\n", qtdCuecaBox);
		} if (qtdCuecaCopinho >= 1) {
		    fprintf(file, "Cueca Copinho......x%d\n", qtdCuecaCopinho);
		} if (qtdCuecaCK >= 1) {
		    fprintf(file, "Cueca CK......x%d\n", qtdCuecaCK);
		} if (qtdSapatoSocial >= 1) {
		    fprintf(file, "Sapato Social......x%d\n", qtdSapatoSocial);
		} if (qtdSapatoTenis >= 1) {
			fprintf(file, "Sapato Tênis......x%d\n", qtdSapatoTenis);
		} if (qtdSapatoCanoLongo >= 1) {
		    fprintf(file, "Sapato Cano Longo......x%d\n", qtdSapatoCanoLongo);
		} if (qtdBota >= 1) {
		    fprintf(file, "Bota......x%d\n", qtdBota);
		} if (qtdHavainas >= 1) {
		    fprintf(file, "Havaianas......x%d\n", qtdHavainas);
		} if (qtdKenner >= 1) {
		    fprintf(file, "Kenner......x%d\n", qtdKenner);
		} if (qtdVestidos >= 1) {
	   	   	fprintf(file, "Vestidos......x%d\n", qtdVestidos);
		} if (qtdCamisaFeminina >= 1) {
			fprintf(file, "Camisa Feminina......x%d\n", qtdCamisaFeminina);
		} if (qtdCamisaJeansFeminina >= 1) {
			fprintf(file, "Camisa Jeans Feminina......x%d\n", qtdCamisaJeansFeminina);
		} if (qtdTop >= 1) {
			fprintf(file, "Top......x%d\n", qtdTop);
		} if (qtdCalcaFeminina >= 1) {
			fprintf(file, "Calça Feminina......x%d\n", qtdCalcaFeminina);
		} if (qtdSaia >= 1) {
			fprintf(file, "Saia......x%d\n", qtdSaia);
		} if (qtdMinissaia >= 1) {
			fprintf(file, "Minissaia......x%d\n", qtdMinissaia);
		} if (qtdBiquiniParteCima >= 1) {
			fprintf(file, "Biquíni Parte de Cima......x%d\n", qtdBiquiniParteCima);
		} if (qtdBiquiniParteBaixo >= 1) {
			fprintf(file, "Biquíni Parte de Baixo......x%d\n", qtdBiquiniParteBaixo);
		} if (qtdBiquiniConjunto >= 1) {
			fprintf(file, "Biquíni Conjunto......x%d\n", qtdBiquiniConjunto);
		} if (qtdCalcinha >= 1) {
			fprintf(file, "Calcinha......x%d\n", qtdCalcinha);
		} if (qtdCalcinhaFioDental >= 1) {
			fprintf(file, "Calcinha Fio Dental......x%d\n", qtdCalcinhaFioDental);
		} if (qtdSalto >= 1) {
			fprintf(file, "Salto......x%d\n", qtdSalto);
		} if (qtdRasteirinha >= 1) {
			fprintf(file, "Rasteirinha......x%d\n", qtdRasteirinha);
		} if (qtdBotaFeminina >= 1) {
			fprintf(file, "Bota Feminina......x%d\n", qtdBotaFeminina);
		} if (qtdSapatoFeminino >= 1) {
			fprintf(file, "Sapato Feminino......x%d\n", qtdSapatoFeminino);
		}
		
		fprintf(file, "\nID do vendedor %5d\n", idvenda);
		fprintf(file, "\nForma de pagamento: Dinheiro\n");
		fprintf(file, "Valor total da compra: R$:%.2f\n", compra);
		fprintf(file, "Valor pago pelo cliente: R$%.2f\n", pago);
		fprintf(file, "Troco: R$:%.2f", trocoinicio);
		fclose(file);
    	
    	
    	break;
		} else if (pago < compra) {
			printf("\nO valor pago insuficiente!\n");
			
		} else if(pago == compra) {
			printf("Valor pago equivale ao valor da compra, não há necessidade de passar troco");
			
    	 file = fopen("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\Faculdade\\Logica matematica e algoritmo\\registro de vendas.txt", "a");
			if (file == NULL) {
        		printf("Erro ao abrir o arquivo de log.\n");
        		perror("Erro ao abrir o arquivo de log");
        		return 1;
			}

		fprintf(file, "\n----------------------------------\n");
        time_t t = time(NULL);
 		struct tm tm = *localtime(&t);		
 		fprintf(file, "Data e hora de confirmação da compra: %02d/%02d/%04d %02d:%02d:%02d\n\n", tm.tm_mday, tm.tm_mon + 1, tm.tm_year + 1900, tm.tm_hour, tm.tm_min, tm.tm_sec);
    	
    	if (qtdCamisaSocial >= 1) {
    		fprintf(file, "Camisa Social......x%d\n", qtdCamisaSocial);
		} if (qtdCamisaPolo >= 1) {
		    fprintf(file, "Camisa Polo......x%d\n", qtdCamisaPolo);
		} if (qtdRegata >= 1) {
    		fprintf(file, "Regata......x%d\n", qtdRegata);
		} if (qtdCamisaEstampada >= 1) {
		    fprintf(file, "Camisa Estampada......x%d\n", qtdCamisaEstampada);
		} if (qtdCamisaAgostinhoCarrara >= 1) {
    		fprintf(file, "Camisa Agostinho Carrara......x%d\n", qtdCamisaAgostinhoCarrara);
		} if (qtdBermudaJeans >= 1) {
		    fprintf(file, "Bermuda Jeans......x%d\n", qtdBermudaJeans);
		} if (qtdBermudaTreino >= 1) {
    		fprintf(file, "Bermuda de Treino......x%d\n", qtdBermudaTreino);
		} if (qtdShortsDePraia >= 1) {
		    fprintf(file, "Shorts de Praia......x%d\n", qtdShortsDePraia);
		} if (qtdCalcaJeans >= 1) {
		    fprintf(file, "Calça Jeans......x%d\n", qtdCalcaJeans);
		} if (qtdCalcaDeMoletom >= 1) {
    		fprintf(file, "Calça de Moletom......x%d\n", qtdCalcaDeMoletom);
		} if (qtdCalcaSocial >= 1) {
		    fprintf(file, "Calça Social......x%d\n", qtdCalcaSocial);
		} if (qtdCuecaBox >= 1) {
    		fprintf(file, "Cueca Box......x%d\n", qtdCuecaBox);
		} if (qtdCuecaCopinho >= 1) {
		    fprintf(file, "Cueca Copinho......x%d\n", qtdCuecaCopinho);
		} if (qtdCuecaCK >= 1) {
		    fprintf(file, "Cueca CK......x%d\n", qtdCuecaCK);
		} if (qtdSapatoSocial >= 1) {
		    fprintf(file, "Sapato Social......x%d\n", qtdSapatoSocial);
		} if (qtdSapatoTenis >= 1) {
			fprintf(file, "Sapato Tênis......x%d\n", qtdSapatoTenis);
		} if (qtdSapatoCanoLongo >= 1) {
		    fprintf(file, "Sapato Cano Longo......x%d\n", qtdSapatoCanoLongo);
		} if (qtdBota >= 1) {
		    fprintf(file, "Bota......x%d\n", qtdBota);
		} if (qtdHavainas >= 1) {
		    fprintf(file, "Havaianas......x%d\n", qtdHavainas);
		} if (qtdKenner >= 1) {
		    fprintf(file, "Kenner......x%d\n", qtdKenner);
		} if (qtdVestidos >= 1) {
	   	   	fprintf(file, "Vestidos......x%d\n", qtdVestidos);
		} if (qtdCamisaFeminina >= 1) {
			fprintf(file, "Camisa Feminina......x%d\n", qtdCamisaFeminina);
		} if (qtdCamisaJeansFeminina >= 1) {
			fprintf(file, "Camisa Jeans Feminina......x%d\n", qtdCamisaJeansFeminina);
		} if (qtdTop >= 1) {
			fprintf(file, "Top......x%d\n", qtdTop);
		} if (qtdCalcaFeminina >= 1) {
			fprintf(file, "Calça Feminina......x%d\n", qtdCalcaFeminina);
		} if (qtdSaia >= 1) {
			fprintf(file, "Saia......x%d\n", qtdSaia);
		} if (qtdMinissaia >= 1) {
			fprintf(file, "Minissaia......x%d\n", qtdMinissaia);
		} if (qtdBiquiniParteCima >= 1) {
			fprintf(file, "Biquíni Parte de Cima......x%d\n", qtdBiquiniParteCima);
		} if (qtdBiquiniParteBaixo >= 1) {
			fprintf(file, "Biquíni Parte de Baixo......x%d\n", qtdBiquiniParteBaixo);
		} if (qtdBiquiniConjunto >= 1) {
			fprintf(file, "Biquíni Conjunto......x%d\n", qtdBiquiniConjunto);
		} if (qtdCalcinha >= 1) {
			fprintf(file, "Calcinha......x%d\n", qtdCalcinha);
		} if (qtdCalcinhaFioDental >= 1) {
			fprintf(file, "Calcinha Fio Dental......x%d\n", qtdCalcinhaFioDental);
		} if (qtdSalto >= 1) {
			fprintf(file, "Salto......x%d\n", qtdSalto);
		} if (qtdRasteirinha >= 1) {
			fprintf(file, "Rasteirinha......x%d\n", qtdRasteirinha);
		} if (qtdBotaFeminina >= 1) {
			fprintf(file, "Bota Feminina......x%d\n", qtdBotaFeminina);
		} if (qtdSapatoFeminino >= 1) {
			fprintf(file, "Sapato Feminino......x%d\n", qtdSapatoFeminino);
		}
		
		fprintf(file, "\nID do vendedor %5d\n", idvenda);
		fprintf(file, "\nForma de pagamento: Dinheiro\n");
		fprintf(file, "Valor total da compra: R$:%.2f\n", compra);
		fprintf(file, "Valor pago pelo cliente: R$%.2f\n", pago);
		fprintf(file, "Troco: R$:%.2f", trocoinicio);
		fclose(file);
			break;
		}
		}
		} else if (forma == 2) {
			int debcre;
			printf("Débito(1), Crédito(2)\nOpção:");
			scanf("%d", &debcre);
			printf("\nCartão Aprovado\n\n");
			
		 file = fopen("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\Faculdade\\Logica matematica e algoritmo\\registro de vendas.txt", "a");
		if (file == NULL) {
       		printf("Erro ao abrir o arquivo de log.\n");
       		perror("Erro ao abrir o arquivo de log");
       		return 1;
			}
			
		fprintf(file, "\n----------------------------------\n");
        time_t t = time(NULL);
 		struct tm tm = *localtime(&t);		
 		fprintf(file, "Data e hora de confirmação da compra: %02d/%02d/%04d %02d:%02d:%02d\n\n", tm.tm_mday, tm.tm_mon + 1, tm.tm_year + 1900, tm.tm_hour, tm.tm_min, tm.tm_sec);
    	
    	if (qtdCamisaSocial >= 1) {
    		fprintf(file, "Camisa Social......x%d\n", qtdCamisaSocial);
		} if (qtdCamisaPolo >= 1) {
		    fprintf(file, "Camisa Polo......x%d\n", qtdCamisaPolo);
		} if (qtdRegata >= 1) {
    		fprintf(file, "Regata......x%d\n", qtdRegata);
		} if (qtdCamisaEstampada >= 1) {
		    fprintf(file, "Camisa Estampada......x%d\n", qtdCamisaEstampada);
		} if (qtdCamisaAgostinhoCarrara >= 1) {
    		fprintf(file, "Camisa Agostinho Carrara......x%d\n", qtdCamisaAgostinhoCarrara);
		} if (qtdBermudaJeans >= 1) {
		    fprintf(file, "Bermuda Jeans......x%d\n", qtdBermudaJeans);
		} if (qtdBermudaTreino >= 1) {
    		fprintf(file, "Bermuda de Treino......x%d\n", qtdBermudaTreino);
		} if (qtdShortsDePraia >= 1) {
		    fprintf(file, "Shorts de Praia......x%d\n", qtdShortsDePraia);
		} if (qtdCalcaJeans >= 1) {
		    fprintf(file, "Calça Jeans......x%d\n", qtdCalcaJeans);
		} if (qtdCalcaDeMoletom >= 1) {
    		fprintf(file, "Calça de Moletom......x%d\n", qtdCalcaDeMoletom);
		} if (qtdCalcaSocial >= 1) {
		    fprintf(file, "Calça Social......x%d\n", qtdCalcaSocial);
		} if (qtdCuecaBox >= 1) {
    		fprintf(file, "Cueca Box......x%d\n", qtdCuecaBox);
		} if (qtdCuecaCopinho >= 1) {
		    fprintf(file, "Cueca Copinho......x%d\n", qtdCuecaCopinho);
		} if (qtdCuecaCK >= 1) {
		    fprintf(file, "Cueca CK......x%d\n", qtdCuecaCK);
		} if (qtdSapatoSocial >= 1) {
		    fprintf(file, "Sapato Social......x%d\n", qtdSapatoSocial);
		} if (qtdSapatoTenis >= 1) {
			fprintf(file, "Sapato Tênis......x%d\n", qtdSapatoTenis);
		} if (qtdSapatoCanoLongo >= 1) {
		    fprintf(file, "Sapato Cano Longo......x%d\n", qtdSapatoCanoLongo);
		} if (qtdBota >= 1) {
		    fprintf(file, "Bota......x%d\n", qtdBota);
		} if (qtdHavainas >= 1) {
		    fprintf(file, "Havaianas......x%d\n", qtdHavainas);
		} if (qtdKenner >= 1) {
		    fprintf(file, "Kenner......x%d\n", qtdKenner);
		} if (qtdVestidos >= 1) {
	   	   	fprintf(file, "Vestidos......x%d\n", qtdVestidos);
		} if (qtdCamisaFeminina >= 1) {
			fprintf(file, "Camisa Feminina......x%d\n", qtdCamisaFeminina);
		} if (qtdCamisaJeansFeminina >= 1) {
			fprintf(file, "Camisa Jeans Feminina......x%d\n", qtdCamisaJeansFeminina);
		} if (qtdTop >= 1) {
			fprintf(file, "Top......x%d\n", qtdTop);
		} if (qtdCalcaFeminina >= 1) {
			fprintf(file, "Calça Feminina......x%d\n", qtdCalcaFeminina);
		} if (qtdSaia >= 1) {
			fprintf(file, "Saia......x%d\n", qtdSaia);
		} if (qtdMinissaia >= 1) {
			fprintf(file, "Minissaia......x%d\n", qtdMinissaia);
		} if (qtdBiquiniParteCima >= 1) {
			fprintf(file, "Biquíni Parte de Cima......x%d\n", qtdBiquiniParteCima);
		} if (qtdBiquiniParteBaixo >= 1) {
			fprintf(file, "Biquíni Parte de Baixo......x%d\n", qtdBiquiniParteBaixo);
		} if (qtdBiquiniConjunto >= 1) {
			fprintf(file, "Biquíni Conjunto......x%d\n", qtdBiquiniConjunto);
		} if (qtdCalcinha >= 1) {
			fprintf(file, "Calcinha......x%d\n", qtdCalcinha);
		} if (qtdCalcinhaFioDental >= 1) {
			fprintf(file, "Calcinha Fio Dental......x%d\n", qtdCalcinhaFioDental);
		} if (qtdSalto >= 1) {
			fprintf(file, "Salto......x%d\n", qtdSalto);
		} if (qtdRasteirinha >= 1) {
			fprintf(file, "Rasteirinha......x%d\n", qtdRasteirinha);
		} if (qtdBotaFeminina >= 1) {
			fprintf(file, "Bota Feminina......x%d\n", qtdBotaFeminina);
		} if (qtdSapatoFeminino >= 1) {
			fprintf(file, "Sapato Feminino......x%d\n", qtdSapatoFeminino);
		}
		
		fprintf(file, "\nID do vendedor %5d\n", idvenda);
		fprintf(file, "\nForma de pagamento: Cartão\n");
		fprintf(file, "Valor total da compra: R$:%.2f\n", compra);
		fprintf(file, "Valor pago pelo cliente: R$%.2f\n", compra);
		fprintf(file, "Troco: R$:0,00");
		fclose(file);
		}
		}
    } else if(func == 3) {
    	
    	int entrada, opc, quantidade;

while (1) {
    printf("\nDigite a opção que você deseja:\n");
    printf("1: adicionar estoque.\n2: mostrar estoque atual.\n3: sair.\n\n");
    printf("Opção: ");
    scanf("%d", &entrada);

    if (entrada == 1) {
        printf("\nDigite a opção:\n");
		printf("1001: Camisa Social\n1002: Camisa Polo\n1003: Regata\n1004: Camisa Estampada\n1005: Camisa Agostinho Carrara\n1006: Bermuda Jeans\n1007: Bermuda de Treino\n1008: Shorts de Praia\n1009: Calça Jeans\n1010: Calça de Moletom\n1011: Calça Social\n1012: Cueca Box\n1013: Cueca Copinho\n1014: Cueca CK\n1015: Sapato Social\n1016: Sapato Tênis\n1017: Sapato Cano Longo\n1018: Bota\n1019: Havaianas\n1020: Kenner\n1021: Vestidos\n1022: Camisa Feminina\n1023: Camisa Jeans Feminina\n1024: Top\n1025: Calça Feminina\n1026: Saia\n1027: Mini Saia\n1028: Biquíni Parte de Cima\n1029: Biquíni Parte de Baixo\n1030: Biquíni Conjunto\n1031: Calcinha\n1032: Calcinha Fio Dental\n1033: Salto\n1034: Rasteirinha\n1035: Bota Feminina\n1036: Sapato Feminino\n\n");		
		printf("Opção: ");
		scanf("%d", &opc);
		
		printf("\nDigite a quantidade:\n");
		scanf("%d", &quantidade);
		printf("\n");
		
		if (opc == 1001) {
    		CamisaSocial += quantidade;
		} else if (opc == 1002) {
		    CamisaPolo += quantidade;
		} else if (opc == 1003) {
		    Regata += quantidade;
		} else if (opc == 1004) {
		    CamisaEstampada += quantidade;
		} else if (opc == 1005) {
		    CamisaAgostinhoCarrara += quantidade;
		} else if (opc == 1006) {
		    BermudaJeans += quantidade;
		} else if (opc == 1007) {
		    BermudaTreino += quantidade;
		} else if (opc == 1008) {
		    ShortsDePraia += quantidade;
		} else if (opc == 1009) {
 	      CalcaJeans += quantidade;
		} else if (opc == 1010) {
 	      CalcaDeMoletom += quantidade;
		} else if (opc == 1011) {
		    CalcaSocial += quantidade;
		} else if (opc == 1012) {
		    CuecaBox += quantidade;
		} else if (opc == 1013) {
		    CuecaCopinho += quantidade;
		} else if (opc == 1014) {
		    CuecaCK += quantidade;
		} else if (opc == 1015) {
		    SapatoSocial += quantidade;
		} else if (opc == 1016) {
		    SapatoTenis += quantidade;
		} else if (opc == 1017) {
			SapatoCanoLongo += quantidade;
		} else if (opc == 1018) {
		    Bota += quantidade;
		} else if (opc == 1019) {
		    Havainas += quantidade;
		} else if (opc == 1020) {
		    Kenner += quantidade;
		} else if (opc == 1021) {
		    Vestidos += quantidade;
		} else if (opc == 1022) {
		    CamisaFeminina += quantidade;
		} else if (opc == 1023) {
		    CamisaJeansFeminina += quantidade;
		} else if (opc == 1024) {
		    Top += quantidade;
		} else if (opc == 1025) {
		    CalcaFeminina += quantidade;
		} else if (opc == 1026) {
		    Saia += quantidade;
		} else if (opc == 1027) {
		    Minissaia += quantidade;
		} else if (opc == 1028) {
		    BiquiniParteCima += quantidade;
		} else if (opc == 1029) {
		    BiquiniParteBaixo += quantidade;
		} else if (opc == 1030) {
		    BiquiniConjunto += quantidade;
		} else if (opc == 1031) {
		    Calcinha += quantidade;
		} else if (opc == 1032) {
		    CalcinhaFioDental += quantidade;
		} else if (opc == 1033) {
		    Salto += quantidade;
		} else if (opc == 1034) {
		    Rasteirinha += quantidade;
		} else if (opc == 1035) {
		    BotaFeminina += quantidade;
		} else if (opc == 1036) {
		    SapatoFeminino += quantidade;
		} else {
		    printf("Opção inválida!\n");
		}
	
	} else if (entrada == 2) {
		
		printf("\nQuantidade atual:\nCamisa Social: %d\nCamisa Polo: %d\nRegata: %d\nCamisa Estampada: %d\nCamisa Agostinho Carrara: %d\nBermuda Jeans: %d\nBermuda de Treino: %d\nShorts de Praia: %d\nCalça Jeans: %d\nCalça de Moletom: %d\nCalça Social: %d\nCueca Box: %d\nCueca Copinho: %d\nCueca CK: %d\nSapato Social: %d\nSapato Tênis: %d\nSapato Cano Longo: %d\nBota: %d\nHavaianas: %d\nKenner: %d\nVestidos: %d\nCamisa Feminina: %d\nCamisa Jeans Feminina: %d\nTop: %d\nCalça Feminina: %d\nSaia: %d\nMini Saia: %d\nBiquíni Parte de Cima: %d\nBiquíni Parte de Baixo: %d\nBiquíni Conjunto: %d\nCalcinha: %d\nCalcinha Fio Dental: %d\nSalto: %d\nRasteirinha: %d\nBota Feminina: %d\nSapato Feminino: %d\n", CamisaSocial, CamisaPolo, Regata, CamisaEstampada, CamisaAgostinhoCarrara, BermudaJeans, BermudaTreino, ShortsDePraia, CalcaJeans, CalcaDeMoletom, CalcaSocial, CuecaBox, CuecaCopinho, CuecaCK, SapatoSocial, SapatoTenis, SapatoCanoLongo, Bota, Havainas, Kenner, Vestidos, CamisaFeminina, CamisaJeansFeminina, Top, CalcaFeminina, Saia, Minissaia, BiquiniParteCima, BiquiniParteBaixo, BiquiniConjunto, Calcinha, CalcinhaFioDental, Salto, Rasteirinha, BotaFeminina, SapatoFeminino);
		
	} else if (entrada == 3) {
		
		printf("\n");
		break;
		
	} else {
		printf("Opção invalida\n");
	}
	}
	}
	}
    
    return 0;
}
