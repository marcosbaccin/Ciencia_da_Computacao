import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor;
		int media = 0;
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + "º valor: ");
			valor = scanner.nextInt();
			media += valor;
		}
		scanner.close();
		System.out.println("===========");
		System.out.println("Média: " + (media / 5));
	}
}