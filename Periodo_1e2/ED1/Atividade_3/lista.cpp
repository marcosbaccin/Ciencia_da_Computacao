#include<iostream>
using namespace std;

struct No{
    int valor;
    No * proximo;
    No * anterior;
};

void imprimirLista(struct No* n){
    cout << "NULL <- ";
    while(n != NULL){
        cout << n->valor;
        n = n->proximo;
        if(n != NULL){
            cout << " <-> ";
        }
    }
}

void inserirTopo(struct No** topo, int valorDoNo){
    struct No* novoNo = new struct No();
    novoNo->valor = valorDoNo;
    novoNo->proximo = (*topo);
    novoNo->anterior = NULL;
    if((*topo) != NULL)
        (*topo)->anterior = novoNo;
    (*topo) = novoNo;
}

void inserirDepois(struct No** topo, int anterior, int valor){
    struct No* n = (*topo);
    while(n->valor != anterior && n->proximo != NULL){
        n = n->proximo;
    }
    if(n->valor != anterior && n->proximo == NULL) return;

    struct No* novoNo = new struct No();
    novoNo->valor = valor;
    novoNo->proximo = n->proximo;
    novoNo->anterior = n;
    (n->proximo)->anterior = novoNo;
    n->proximo = novoNo;
}

void inserirFinal(struct No** topo, int valor){
    struct No* n = (*topo);
    while(n->proximo != NULL){
        n = n->proximo;
    }

    struct No* novoNo = new struct No();
    novoNo->valor = valor;
    n->proximo = novoNo;
    novoNo->anterior = n;
    novoNo->proximo = NULL;
}

void apagarNo(struct No** topo, int posicao){
    struct No* n = (*topo);
    //apaga no topo
    if(posicao == 0){
        (n->proximo)->anterior = NULL;
        (*topo) = n->proximo;
        delete(n);
    }
    //apaga no final
    else{
        while(n->proximo != NULL){
            n = n->proximo;
        }
        (n->anterior)->proximo = NULL;
        delete(n);       
    }
}

void imprimirInverso(struct No** topo){
    struct No* n = (*topo);
    while(n->proximo != NULL){
        n = n->proximo;
    }

    cout << "NULL <- ";
    while(n != NULL){
        cout << n->valor;
        n = n->anterior;
        if(n != NULL)
            cout << " <-> ";
    }
    cout << " -> NULL";
}

int main(){
    struct No* topo = NULL;
    inserirTopo(&topo, 10);
    inserirTopo(&topo, 20);
    inserirTopo(&topo, 30);
    inserirDepois(&topo, 20, 15);
    inserirFinal(&topo, 0);
    apagarNo(&topo, 1);
    imprimirInverso(&topo);
    imprimirLista(topo);

    return 0;
}