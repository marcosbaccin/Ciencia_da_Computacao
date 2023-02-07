import java.util.Arrays;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor[] = new int[10];
		for(int i = 0; i < 10; i++) {
			System.out.print((i+1) + "º valor: ");
			valor[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("===============");
		Arrays.sort(valor);
		System.out.println("Maior valor: " + valor[9] + "\nMenor valor: " + valor[0]);
	}
}