#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main (void){
    FILE *arq;
    char nome[100];
    printf("Qual sera o nome do arquivo: ");
    scanf("%s", nome);
    strcat(nome, ".txt");
    arq = fopen(nome, "a");
    fclose(arq);
    printf("O arquivo foi criado com sucesso!");
    return(0);
}