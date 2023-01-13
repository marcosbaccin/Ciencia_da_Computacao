#include<stdlib.h>  // malloc, free, rand
#include<iostream>
using namespace std;

int main(){
    int i, n;
    int *pData;
    cout << "Qtd de numeros: ";
    cin >> i;
    pData = (int*)calloc(i, sizeof(int));
    if(pData == NULL)   exit(1);
    for(n = 0; n < i; n++){
        cout << "\nDigite o " << n+1 << "o. numero: ";
        cin >> pData[n];
    }
    cout << "\nVoce digitou: ";
    for(n = 0; n < i; n++)  cout << pData[n] << " ";
    free(pData);

    return 0;
}