#include <stdio.h>

int main () {
    int x, y;

    printf("Digite um numero: ");
    scanf("%d", &x);
    printf("Digite mais um numero: ");
    scanf("%d", &y);

    if(&x > &y){
        printf("%d tem o maior endereco de memoria: %x", x, &x);
    } else if(&y > &x) {
        printf("%d tem o maior endereco de memoria: %x", y, &y);
    } else {
        printf("Os enderços de memoria de X e Y possuem o mesmo tamanho.");
    }
    
    printf("\n");

    if(x > y){
        printf("O maior valor digitado foi %d", x);
    } else if(y > x){
        printf("O maior valor digitado foi %d", y);
    } else {
        printf("Os valores digitados são iguais.");
    }

    printf("\n");
    system("pause");
    return 0;
}