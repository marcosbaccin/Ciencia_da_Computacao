#include<stdio.h>
#include<stdlib.h>


void fracao(float num, int *inteiro, float *frac){
    *inteiro = (int) num;
    *frac = num - *inteiro;
}

int main(){
    float num, frac;
    int inteiro;

    printf("Digite um numero: ");
    scanf("%f", &num);

    fracao(num, &inteiro, &frac);

    printf("Parte Inteira : %d \n", inteiro);
    printf("Parte Decimal : %f\n", frac);

    system("pause");
    return 0;
}