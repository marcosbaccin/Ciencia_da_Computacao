#include<iostream>
using namespace std;

struct No{
    int valor;
    No * proximo;
};

struct Fila{
    No * topo, * cauda;
    int itens;
};

struct Fila* criarFila(){
    struct Fila* f = new struct Fila();
    f->topo = f->cauda = NULL;
    f->itens = 0;
    return f;
}

void inserirFila(struct Fila* f, int valorDoNo){
    if(f->itens == 10){
        cout << "Fila cheia!" << endl;
        return;
    }
    struct No* novoNo = new struct No();
    novoNo->valor = valorDoNo;
    novoNo->proximo = NULL;
    f->itens++;
    if(f->cauda == NULL){
        f->topo = f->cauda = novoNo;
        return;
    }
    f->cauda->proximo = novoNo;
    f->cauda = novoNo;
}

void retirarFila(struct Fila* f){
    if(f->topo == NULL){
        cout << "Fila vazia!" << endl;
        return;
    }
    struct No* temp = f->topo;
    f->topo = f->topo->proximo;
    if(f->topo == NULL){
        f->cauda = NULL;
    }
    f->itens--;
    delete(temp);
}

void imprimir(struct No* no){
    if(no == NULL){
        cout << "NULL";
    } else {
        imprimir(no->proximo);
        cout << " <- " << no->valor;
    }
}

int main(){
    Fila* f = criarFila();
    inserirFila(f, 1);
    inserirFila(f, 2);
    inserirFila(f, 3);
    imprimir(f->topo);

    return 0;
}