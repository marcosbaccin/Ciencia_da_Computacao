import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor;
		System.out.print("Digite um valor: ");
		valor = scanner.nextInt();
		scanner.close();
		System.out.println("================");
		for(int i = valor; i >= 1; i--) {
			System.out.println(i);
		}
	}
}