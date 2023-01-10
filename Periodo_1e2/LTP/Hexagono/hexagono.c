#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void calculaHexa(float l, float* area, float* perimetro){
    *area = 3 * pow(l, 2) * sqrt(3) / 2;
    *perimetro = 6*l;
}

int main(){
    float l, perimetro, area;

    printf("Digite o lado: ");
    scanf("%f", &l);

    if (l <= -1){
        printf("Digite um valor positivo!\n");
        system("pause");
        exit(1);
    } else {
        calculaHexa(l, &area, &perimetro);
        printf("A area eh de: %f\n", area);
        printf("O perimetro eh de: %f\n", perimetro);
    }

    system("pause");
    return 0;
}