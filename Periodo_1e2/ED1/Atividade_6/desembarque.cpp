#include<iostream>
using namespace std;

struct No{
    int valor;
    No * prox;
};

bool empty(struct No** topo){
    if(*topo == NULL){
        return true;
    }
    return false;
}

int size(struct No** topo){
    int qtd = 0;
    while(!empty(topo)){
        qtd += (*topo)->valor;
        (*topo) = (*topo)->prox;
    }
    return qtd;
}

int top(struct No** topo){
    if(empty(topo)){
        cout << "\nLista Vazia!!";
        return NULL;
    }
    return (*topo)->valor;
}

void print(struct No* n){
    cout << "\n";
    while(n != NULL){
        cout << n->valor << " -> ";
        n = n->prox;
    }
    cout << "NULL";
}

void push(struct No** topo, int valor){
    struct No* novoNo = new struct No();
    novoNo->valor = valor;
    novoNo->prox = (*topo);
    (*topo) = novoNo;
}

void pop(struct No** topo){
    if(empty(topo)){
        cout << "\nLista Vazia!!";
    }
    struct No* n = (*topo);
    *topo = n->prox;
    delete(n);
}

int main(){
    struct No* topo = NULL;
    push(&topo, 10);
    push(&topo, 20);
    push(&topo, 30);
    print(topo);
    pop(&topo);
    print(topo);

    return 0;
}