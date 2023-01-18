int main(){
    //alocação stack
    int valor = 5;
    int array[5];
    
    //alocação heap
    int *hvalor = new int;
    *hvalor = 5;
    int *harray = new int[5];

    return 0;
}