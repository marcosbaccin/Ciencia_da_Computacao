#include<stdlib.h>  /* malloc, free, rand */
#include<iostream>
using namespace std;

int main(){
    int entrada, n;
    int qtd = 0;
    int *numeros = NULL;
    int *mais_numeros = NULL;
    
    do{
        cout << "Digite um valor inteiro (0 para terminar): ";
        cin >> entrada;
        qtd++;
        mais_numeros = (int*)realloc(numeros, qtd*sizeof(int));
        if(mais_numeros != NULL){
            numeros = mais_numeros;
            numeros[qtd-1] = entrada;
        } else{
            free(numeros);
            cout << "Erro na re-alocacao de memoria";
            exit(1);
        }
    } while(entrada != 0);

    cout << "Numeros digitados: ";
    for(n = 0; n < qtd; n++)
        cout << numeros[n] << " ";
    
    free(numeros);

    return 0;
}