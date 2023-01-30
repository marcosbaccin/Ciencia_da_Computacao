#include<iostream>
using namespace std;

struct No{
    int valor;
    No * proximo;
};

struct Fila{
    No * topo, * cauda;
    int maximo;
    int itens;
};

struct Fila* criarFila(int maximo){
    struct Fila* f = new struct Fila();
    f->topo = f->cauda = NULL;
    f->maximo = maximo;
    f->itens = 0;
    return f;
}

void inserirFila(struct Fila* f, int valorDoNo){
    if(f->itens == f->maximo){
        std::cout << "Fila cheia!" << endl;
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
        std::cout << "Fila vazia!" << endl;
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
        std::cout << "\nNULL";
    } else {
        imprimir(no->proximo);
        std::cout << " <- " << no->valor;
    }
}

int encontrarMenor(struct No* fe, struct No* f1, struct No* f2){
    int menorValor;
    if(fe != NULL){
        menorValor = fe->valor;
    } else if(f1 != NULL){
        menorValor = f1->valor;
    } else {
        menorValor = f2->valor;
    }

    while(fe != NULL){
        if(fe->valor < menorValor){
            menorValor = fe->valor;
        }
        fe = fe->proximo;
    }
     while(f1 != NULL){
        if(f1->valor < menorValor){
            menorValor = f1->valor;
        }
        f1 = f1->proximo;
    }
    while(f2 != NULL){
        if(f2->valor < menorValor){
            menorValor = f2->valor;
        }
        f2 = f2->proximo;
    }
    std::cout << "\n" << "Menor valor -> " << menorValor << "\n";
    return menorValor;
}

void organizarVagoes(struct Fila* filaEntrada){
    std::cout << "\nOrganizando vagoes";
    Fila* filaEspera1 = criarFila(filaEntrada->maximo);
    Fila* filaEspera2 = criarFila(filaEntrada->maximo);
    Fila* filaSaida = criarFila(filaEntrada->maximo);

    int menorValor = 0;

    imprimir(filaEntrada->topo);
    imprimir(filaEspera1->topo);
    imprimir(filaEspera2->topo);
    imprimir(filaSaida->topo);

    while(filaSaida->itens != filaSaida->maximo){
        menorValor = encontrarMenor(filaEntrada->topo, filaEspera1->topo, filaEspera2->topo);
        //verifica se o topo da fila de entrada é o menor valor
        if(filaEntrada->topo != NULL && filaEntrada->topo->valor == menorValor){
            inserirFila(filaSaida, filaEntrada->topo->valor);
            retirarFila(filaEntrada);
        }
        //verifica se o topo da fila de espera 1 é o menor valor
        else if(filaEspera1->topo != NULL && filaEspera1->topo->valor == menorValor){
            inserirFila(filaSaida, filaEspera1->topo->valor);
            retirarFila(filaEspera1);
        }
        else if(filaEspera2->topo != NULL && filaEspera2->topo->valor == menorValor){
            inserirFila(filaSaida, filaEspera2->topo->valor);
            retirarFila(filaEspera2);
        }
        //manipulando vagões
        else{
            //caso ambas as filas de espera estiverem vazias
            if(filaEspera1->topo == NULL && filaEspera2->topo == NULL){
                inserirFila(filaEspera1, filaEntrada->topo->valor);
                retirarFila(filaEntrada);
            }
            //caso a fila de espera 1 não esteja vazia e a fila de espera 2 esteja vazia
            else if(filaEspera1->topo != NULL && filaEspera2->topo == NULL){
                //verifica se a entrada é maior que a cauda da fila de espera 1
                if(filaEntrada->topo->valor > filaEspera1->cauda->valor){
                    inserirFila(filaEspera1, filaEntrada->topo->valor);
                    retirarFila(filaEntrada);
                }
                //caso contrário adiciona na fila de espera 2
                else{
                    inserirFila(filaEspera2, filaEntrada->topo->valor);
                    retirarFila(filaEntrada);
                }
            }
            //caso a fila de espera 1 esteja vazia e a fila de espera 2 não esteja vazia
            else if(filaEspera1->topo == NULL && filaEspera2->topo != NULL){
                //verifica se a entrada é maior que a cauda da fila de espera 2
                if(filaEntrada->topo->valor > filaEspera2->cauda->valor){
                    inserirFila(filaEspera2, filaEntrada->topo->valor);
                    retirarFila(filaEntrada);
                }
                //caso contrário adiciona na fila de espera 1
                else{
                    inserirFila(filaEspera1, filaEntrada->topo->valor);
                    retirarFila(filaEntrada);
                }
            }
            //caso ambas as filas de espera não estiverem vazias
            else{
                //verifica se a entrada é maior que a cauda da fila de espera 1 e menor que a cauda da fila de espera 2
                if(filaEntrada->topo->valor > filaEspera1->cauda->valor && filaEntrada->topo->valor < filaEspera2->cauda->valor){
                    inserirFila(filaEspera1, filaEntrada->topo->valor);
                    retirarFila(filaEntrada);
                }
                //verifica se a entrada é maior que a cauda da fila de espera 2 e menor que a cauda da fila de espera 1
                else if(filaEntrada->topo->valor > filaEspera2->cauda->valor && filaEntrada->topo->valor < filaEspera1->cauda->valor){
                    inserirFila(filaEspera2, filaEntrada->topo->valor);
                    retirarFila(filaEntrada);
                }
                //verifica se a entrada é maior que a cauda de ambas as filas de espera
                else if(filaEntrada->topo->valor > filaEspera1->cauda->valor && filaEntrada->topo->valor > filaEspera2->cauda->valor){
                    //caso a cauda da fila de espera 1 for maior que a cauda da fila de espera 2
                    if(filaEspera1->cauda->valor > filaEspera2->cauda->valor){
                        inserirFila(filaEspera1, filaEntrada->topo->valor);
                        retirarFila(filaEntrada);
                    }
                    //caso contrário adiciona na fila de espera 2
                    else{
                        inserirFila(filaEspera2, filaEntrada->topo->valor);
                        retirarFila(filaEntrada);
                    }
                }
            }
        }
        std::cout << "==========================";
        imprimir(filaEntrada->topo);
        imprimir(filaEspera1->topo);
        imprimir(filaEspera2->topo);
        imprimir(filaSaida->topo);
        std::cout << "\n==========================";
    }
}

int main(){
    int maximo;
    std::cout << "Informe o numero maximo de vagoes: ";
    cin >> maximo;
    Fila* filaEntrada = criarFila(maximo);

    int cont = 1;
    while(filaEntrada->itens != maximo){
        int valor;
        std::cout << "Informe o valor do vagao " << cont << ": ";
        cin >> valor;
        inserirFila(filaEntrada, valor);
        cont++;
    }

    organizarVagoes(filaEntrada);

    return 0;
}