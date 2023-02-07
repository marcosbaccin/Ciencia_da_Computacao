import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor[] = new int[10];
		float soma = 0;
		for(int i = 0; i < 10; i++) {
			System.out.print((i+1) + "º valor: ");
			valor[i] = scanner.nextInt();
			soma += valor[i];
		}
		scanner.close();
		System.out.println("================="+valor.length);
		System.out.println("Média dos valores: " + (soma / valor.length));
	}
}