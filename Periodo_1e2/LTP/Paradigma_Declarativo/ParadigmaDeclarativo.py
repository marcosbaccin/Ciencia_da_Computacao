# Declarando um vetor de 0 a 9.
num = [0,1,2,3,4,5,6,7,8,9]

# CALCULAREMOS:
# * a soma dos valores do vetor;
# * a quantidade de valores no vetor;
# * a quantidade de 9 no vetor;


# Forma IMPERATIVA:

# Os cálculos serão realizados atráves do 'for',
# que percorrerá o vetor posição por posição.

soma1 = 0
qntd_v = 0
qntd_9 = 0

for n in num:
    # A cada laço a variável 'soma1' recebe seu valor atual mais 'n',
    # e a variável 'qntd_v' recebe seu valor atual mais 1.
    # Já a variável 'qntd_9' recebe seu valor atual mais 1, se 'n' for 9.
    soma1 += n
    qntd_v += 1
    if n == 9:
        qntd_9 += 1

print('FORMA IMPERATIVA\n\nSoma = {}\nQntd. de valores = {}\nQntd. de 9 = {}'.format(soma1,qntd_v,qntd_9))
print('\n====================================================')

# Forma DECLARATIVA:

# Os cálculos serão feitos através das funções:
# sum(): pega um iterável(string,lista,dicionário) e retorna a soma de seus itens;
# len(): retorna o número de itens em um objeto(string, coleção);
# count(): retorna a contagem de quantas vezes um objeto ocorre na lista.

print('\nFORMA DECLARATIVA\n\nSoma = {}\nQntd. de valores = {}\nQntd. de 9 = {}'.format(sum(num),len(num),num.count(9)))

