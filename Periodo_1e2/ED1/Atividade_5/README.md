    ### Atividade 5
    • O algoritmo lê 9 valores inteiros e os guarda em uma fila;
    • O primeiro valor será direcionado para um dos trilhos (filas) de espera;
    • Caso ele seja o menor valor já pode ser direcionado diretamente para o trilho de saída;
    • Em seguida verificamos o próximo valor, caso ele seja menor que o primeiro direcionamos ele para o outro trilho de espera. Caso contrário, direcionamos para o mesmo trilho de espera;
    • Se o próximo valor for menor que o último valor de ambos os trilhos de espera, e for também o menor valor atual, direcionamos ele diretamente para o trilho de saída;
    • Se o próximo valor for menor que o último valor de ambos os trilhos de espera, mas não for o menor valor atual, encaminhamos para o trilho de saída os vagões que já estão em ordem.
    • Se o próximo valor for maior que o último valor de ambos os trilhos de espera direcionamos ele para o trilho de espera que possuí o maior valor  na última posição.
    • Os trilhos de espera (T1 e T2) só devem guardar vagões que ainda não podem sair;
    • Quando ordenado, o vagão deve ser inserido no trilho de saída (T3);
    • No final imprimimos T3. Espera-se que T3 esteja em ordem crescente em relação aos 9 valores lidos no início do algorítmo.