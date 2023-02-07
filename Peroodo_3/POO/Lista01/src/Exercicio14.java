import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor = 0;
		int qtd = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		float media = 0;
		do {
			System.out.print((qtd+1) + "º valor (digite -1 para encerrar): ");
			valor = scanner.nextInt();
			if(valor != -1) {
				qtd++;
				if(valor > maior) {
					maior = valor;
				}
				if(valor < menor) {
					menor = valor;
				}
				media += valor;
			}
			
		}while(valor != -1);
		scanner.close();
		System.out.println("==============================");
		System.out.println("Quantidade de valores digitados: " + qtd);
		System.out.println("Maior valor: " + maior + "\nMenor valor: " + menor);
		System.out.println("Média dos valores: " + (media / qtd));
	}
}