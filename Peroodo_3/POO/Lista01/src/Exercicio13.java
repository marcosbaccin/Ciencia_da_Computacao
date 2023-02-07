import java.util.Arrays;
import java.util.Scanner;

public class Exercicio13 {

	public static void inverterVetor(int vetor[]) {
		int vetorInvertido[] = new int[10];
		int aux = 9;
		for(int i = 0; i < vetor.length; i++) {
			vetorInvertido[i] = vetor[aux];
			aux--;
		}
		System.out.println("Vetor: " + Arrays.toString(vetor) + "\nVetor invertido: " + Arrays.toString(vetorInvertido));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vetor[] = new int[10];
		for(int i = 0; i < 10; i++) {
			System.out.print((i+1) + "º valor: ");
			vetor[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("=============");
		inverterVetor(vetor);
	}
}