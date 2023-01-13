#include<stdlib.h>  /* malloc, free, rand */
#include<iostream>
#include "time.h"
using namespace std;
int main(){
    int i, n;
    char * buffer;
    srand((unsigned)time(0));
    cout << "Qual o tamanho da string? "; cin >> i;
    buffer = (char*)malloc(i+1);
    if(buffer == NULL)  exit(1);
    for(n = 0; n < i; n++)
        buffer[n] = rand() % 26 + 97;
    buffer[i] = '\0';
    cout << "String aleatoria: " << buffer;
    free(buffer);

    return 0;
}
