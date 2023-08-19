#include <stdio.h>
#include <math.h>

int main() {
    int hora_chegada, minuto_chegada, hora_partida, minuto_partida;
    double preco;
    int diferenca_horas, horas_arredondadas;

    printf("Digite a hora de chegada: ");
    scanf("%d", &hora_chegada);
    printf("Digite o minuto de chegada: ");
    scanf("%d", &minuto_chegada);
    printf("Digite a hora de partida: ");
    scanf("%d", &hora_partida);
    printf("Digite o minuto de partida: ");
    scanf("%d", &minuto_partida);
    diferenca_horas = hora_partida - hora_chegada;
    if (diferenca_horas < 0) {
        diferenca_horas += 24;
    }

    horas_arredondadas = ceil(diferenca_horas);

    if (horas_arredondadas <= 2) {
        preco = horas_arredondadas * 8.0;
    } else if (horas_arredondadas <= 4) {
        preco = 2 * 8.0 + (horas_arredondadas - 2) * 8.5;
    } else {
        preco = 2 * 8.0 + 2 * 8.5 + (horas_arredondadas - 4) * 2.0;
    }
    
    printf("Preco cobrado pelo estacionamento: R$ %.2f\n", preco);

    return 0;
}
