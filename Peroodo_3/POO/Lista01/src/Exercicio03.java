import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		for(int i = 0; i < 7; i++) {
			System.out.print((i+1) + "º valor: ");
			valor = scanner.nextInt();
			if(valor > maior) {
				maior = valor;
			}
			if(valor < menor) {
				menor = valor;
			}
		}
		scanner.close();
		System.out.println("===============");
		System.out.println("Maior valor: " + maior + "\nMenor valor: " + menor);
	}
}