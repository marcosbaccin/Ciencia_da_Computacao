#include<iostream>
#include<stack>
using namespace std;

void print(stack <int> s){
    cout << "\n";
    if(s.empty()){
        cout << "Pilha Vazia!!";
    }
    while(!s.empty()){
        cout << "\t" << s.top();
        s.pop();
    }
}

void top(stack <int> s){
    if(s.empty()){
        cout << "Pilha Vazia!!";
        return;
    }
    cout << s.top();
}

void soma(stack <int> s){
    int soma = 0;
    if(s.empty()){
        cout << "Pilha Vazia!!";
        return;
    }
    while(!s.empty()){
        soma += s.top();
        s.pop();
    }
    cout << soma;
}

int main(){
    stack <int> s;
    s.push(2);
    s.push(10);
    s.push(3);
    print(s);
    s.push(30);
    print(s);
    s.pop();
    print(s);
    cout << "\nQuantidade de elementos: " << s.size();
    cout << "\nElemento no topo: ";
    top(s);
    cout << "\nSoma dos elementos: ";
    soma(s);
    s.pop();
    s.pop();
    s.pop();
    print(s);
    
    return 0;
}