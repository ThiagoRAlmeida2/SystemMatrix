#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

int op = 0;
int main(int i);

int numero() {
    int numSec, chute, cont;
    srand(time(0));
    numSec = rand() % 1000 + 1;
    cont = 10;

	// printf("%d", numSec);
    while (chute != numSec && cont != 0) {
        printf("Digite um número entre 1 e 1000: ");
        scanf("%d", &chute);

        if (chute == numSec) {
            int tryAct = 10 - cont + 1;
            printf("Acertou em %d tentativas!\n", tryAct);
            system("PAUSE");
        } else if (chute > numSec) {
            cont = cont - 1;
            if (cont == 0) {
                printf("Jogo encerrado, o número secreto é: %d\n", numSec);
            } else {
                printf("Errou... O número secreto é menor. Você tem mais %d chances\n", cont);
            }
        } else if (chute < numSec) {
            cont = cont - 1;
            if (cont == 0) {
                printf("Jogo encerrado, o número secreto é: %d\n", numSec);
                system("PAUSE");
                break;
            } else {
                printf("Errou... O número secreto é maior. Você tem mais %d chances\n", cont);
            }
        }
    }
     system("PAUSE");
    return 0;
}

int codigo(){
    int codSec[3], chute[3], i, acerto = 0;

    srand(time(0));
    codSec[0] = rand() % 10;
    codSec[1] = rand() % 10;
    codSec[2] = rand() % 10;
    //printf("%d %d %d\n", codSec[0], codSec[1], codSec[2]);
    while(acerto != 1){

    printf("Digite 3 números de 0 a 9 um de cada vez, apertando enter entre eles:\n");
    for (i = 0; i < 3; i++)
        scanf("%d", &chute[i]);

    if (chute[0] == codSec[0] && chute[1] == codSec[1] && chute[2] == codSec[2]) {
        printf("Todos os números certos na posição certa.\n");
        acerto = 1;
    } else if ((chute[0] == codSec[0] || chute[0] == codSec[1] || chute[0] == codSec[2]) &&
               (chute[1] == codSec[0] || chute[1] == codSec[1] || chute[1] == codSec[2]) &&
               (chute[2] == codSec[0] || chute[2] == codSec[1] || chute[2] == codSec[2])) {
        printf("Todos os números certos, mas nas posições erradas.\n");						//propositalmente não informa qual está em posição correta
    } else if ((chute[0] == codSec[0] && chute[1] == codSec[1]) ||
               (chute[0] == codSec[0] && chute[2] == codSec[2]) ||
               (chute[1] == codSec[1] && chute[2] == codSec[2])) {
        printf("Dois números certos na posição certa.\n");
    } else if (chute[0] == codSec[0] || chute[1] == codSec[1] || chute[2] == codSec[2]) {
        printf("Um número certo na posição certa.\n");
    } else if ((chute[0] == codSec[1] || chute[0] == codSec[2] || chute[1] == codSec[0] ||
                chute[1] == codSec[2] || chute[2] == codSec[0] || chute[2] == codSec[1])) {
        printf("Um número certo na posição errada.\n");
    } else if ((chute[0] == codSec[1] && chute[1] == codSec[0]) ||
               (chute[0] == codSec[2] && chute[2] == codSec[0]) ||
               (chute[1] == codSec[0] && chute[0] == codSec[1]) ||
               (chute[1] == codSec[2] && chute[2] == codSec[1]) ||
               (chute[2] == codSec[0] && chute[0] == codSec[2]) ||
               (chute[2] == codSec[1] && chute[1] == codSec[2])) {
        printf("Dois números certos na posição errada.\n");
    } else {
        printf("Nenhum número certo.\n");
    }
	}
	system("PAUSE");
    return 0;
}

int menu(){
	setlocale(LC_ALL, "Portuguese");
	system("CLS");
	printf("======================================\n");
	printf("		 AdviNúmero			\n");
	printf("======================================\n");
	printf("	  Digite sua opção:		\n");
	printf("	 1: Advinhe o número	\n");
	printf("	 2: Advinhe o código	\n");
	printf("	 3: Sair do Jogo		\n");
	printf("======================================\n");
	printf("Opção: ");
	scanf("%d", &op);


	switch(op){
	case 1:
		system("CLS");
		numero();
            main(op);
		break;
	case 2:
		system("CLS");
		codigo();
            main(op);
		break;
	case 3:
		system("CLS");
            main(op);
		break;
	default:
		printf("Opção inválida!\n");
		system("pause");
		system("CLS");
	}
	return 1;
}

int main(int i) {
	while (op != 3){
		menu();
	} if (op == 3){
		exit(0);
	}

	return 0;
}