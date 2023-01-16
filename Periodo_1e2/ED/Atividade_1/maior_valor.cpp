#include<stdlib.h>  /* malloc, free, rand */
#include<iostream>
using namespace std;


int main(){
    int qtd, n, maior;
    int *numeros = NULL;

    cout << "Qtd de valores: "; cin >> qtd;
    numeros = (int*)calloc(qtd, sizeof(int));

    if(numeros == NULL)   exit(1);
    for(n = 0; n < qtd; n++){
        cout << "\nDigite o " << n+1 << "o. numero: ";
        cin >> numeros[n];
        if(n == 0){
            maior = numeros[0];
        } else if(numeros[n] > maior){
            maior = numeros[n];
        }
    }

    cout << "\nVoce digitou: ";
    for(n = 0; n < qtd; n++)  cout << numeros[n] << " ";
    
    cout << "\nO maior valor digitado foi: " << maior;
    return 0;
}