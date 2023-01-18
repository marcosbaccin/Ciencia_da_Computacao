#include<stdio.h>
#include<stdlib.h>

using namespace std;

struct TipoCelula{
    int item;
    TipoCelula *prox;
};

int pilha_contador;
int tamanho_max;
TipoCelula *topo;

bool pilha_Contrutor(){
    topo = NULL;
    pilha_contador = 0;
    printf("Qual sera o tamanho maximo da pilha? ");
    scanf("%d",&tamanho_max);
}

bool pilha_vazia(){
    if(topo == NULL){
        return true;
    } else {
        return false;
    }
}

bool pilha_cheia(){
    if(pilha_contador == tamanho_max){
        return true;
    } else {
        return false;
    }
}


bool pilha_Destrutor(){
    int aux;
    TipoCelula *temp;
    if(pilha_vazia()){
        return false;
    } else {
        while(topo != NULL){
            temp = topo;
            temp->prox = NULL;
            topo = topo->prox;
            free(temp);
        }
        pilha_contador = 0;
        return true;
    }
}

bool pilha_push(int valor){
    TipoCelula *nova_celula = (TipoCelula*)malloc(sizeof(TipoCelula));
    if(nova_celula == NULL){
        printf("O SO nao forneceu memoria");
        return false;
    } else {
        if(pilha_cheia()){
            printf("A pilha esta cheia! Nao foi possivel adicionar o valor\n");
            return false;
        } else {
            nova_celula->item = valor;
            nova_celula->prox = topo;
            topo = nova_celula;
            pilha_contador++;
            return true;
        }
    }
}

bool pilha_pop(){
    TipoCelula *temp;
    if(pilha_vazia()){
        printf("A pilha esta vazia!\n");
        return false;
    } else {
        temp = topo;
        topo = topo->prox;
        temp->prox = NULL; // Medida de segurança para desligar a célula removida da pilha
        free(temp);
        pilha_contador--;
        return true;
    }
}

bool pilha_topo(){
    if(pilha_vazia()){
        return false;
    } else {
        printf("Topo: %d\n", topo->item);
        return true;
    }
}

bool pilha_tamanho(){
    if(pilha_vazia()){
        printf("A pilha esta vazia!");
        return false;
    } else {
        printf("Qtd de itens : %d\n", pilha_contador);
        return true;
    }
}

bool pilha_estado(){
    if(pilha_vazia()){
        printf("A pilha esta vazia!\n");
    } else {
        if(pilha_cheia()){
            printf("A pilha esta cheia!\n");
        } else{
            printf("A pilha esta funcionando!\n");
        }
        pilha_topo();
        pilha_tamanho();
    }
}

bool pilha_imprimir(){
    if(pilha_vazia()){
        printf("A pilha esta vazia!\n");
    } else {
        TipoCelula *temp;
        temp = topo;
        printf("Pilha: ");
        while(temp != NULL){
            printf("%d ", temp->item);
            temp = temp->prox;
        }
        printf("\n");
    }
}

int main(){
    
    pilha_Contrutor();
    int opcao;

    do{
        printf("\n0 - Sair\n1 - Adicionar\n2 - Remover\n3 - Estado\n4 - Imprimir\n");
        scanf("%d", &opcao);

        switch (opcao){
        case 1:
            int valor;
            printf("Informe um valor: ");
            scanf("%d", &valor);
            pilha_push(valor);
            break;

        case 2:
            pilha_pop();
            break;
        
        case 3:
            pilha_estado();
            break;

        case 4:
            pilha_imprimir();
            break;
        
        default:
            if(opcao != 0)
            printf("\nOpcao invalida!!!\n");
        }

    } while(opcao != 0);

    pilha_Destrutor();
    
    return 0;
}