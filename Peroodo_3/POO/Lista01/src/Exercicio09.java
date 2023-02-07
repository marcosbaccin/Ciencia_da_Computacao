import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor1;
		int valor2;
		System.out.print("1º valor: ");
		valor1 = scanner.nextInt();
		System.out.print("2º valor: ");
		valor2 = scanner.nextInt();
		scanner.close();
		System.out.println(valor1 + " + " + valor2 + " = " + (valor1 + valor2));
		System.out.println((valor1 + valor2) + " * " + valor1 + " = " + ((valor1 + valor2) * valor1));
	}
}