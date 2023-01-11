#include<stdio.h>
#include<stdlib.h>
#include <string.h>

struct agenda{
    char horario[8];
    char data[8];
    char compromisso[50];
};


int main(){
    int stop = 1;
    
    while(stop == 1){
        printf("Deseja agendar um compromisso? (1) Sim\t0)Nao");
        scanf("%d", &stop);
        
        char horario[8];
        char data[8];
        char compromisso[50];
        printf("Informe a data: ", data);
        scanf("%s", data);
        printf("Informe a hora: ");
        scanf("%s", horario);
        printf("Informe o compromisso: ");
        scanf("%s", compromisso);

        struct agenda ag = {horario, data, compromisso};

        FILE *farq;
        int i;
        char tam[75];
        strcat(tam, data);
        strcat(tam, "; ");
        strcat(tam, horario);
        strcat(tam, "; ");
        strcat(tam, compromisso);

        if((farq = fopen("agenda.txt","w")) == NULL){
            printf( "Erro na abertura do arquivo");
            exit(1);
        }

        for (i=0; i < strlen(tam); i++){
            fputc(tam[i],farq);
        }

        fclose(farq); 
    }
    
    system("pause");
    return 0;
}