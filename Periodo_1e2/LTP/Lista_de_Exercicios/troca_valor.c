#include<stdio.h>

void trocar_valor(int *a, int *b){
    *a = *a + *b;
    *b = *a - *b;
    *a = *a - *b;
}

int main (){
    int a, b;

    printf("Digite um numero: ");
    scanf("%d", &a);
    printf("Digite mais um numero: ");
    scanf("%d", &b);

    printf("a: %d\tb: %d\n", a, b);
    
    trocar_valor(&a, &b);
    printf("a: %d\tb: %d\n", a, b);

    system("pause");
    return 0;
}