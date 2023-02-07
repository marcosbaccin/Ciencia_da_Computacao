import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		do {
			System.out.print("PAR OU ÍMPAR\nDigite um número (-1 para sair): ");
			numero = scanner.nextInt();
			if(numero < 0) {
				break;
			}
			if(numero % 2 == 0) {
				System.out.println(numero + " é par.");
				System.out.println("===============");
			}else {
				System.out.println(numero + " é ímpar.");
				System.out.println("===============");
			}
		} while(numero > 0);
		scanner.close();
	}
}