import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {

	public static void vetorPar(int qtdPar, int valor[]) {
		int par[] = new int[qtdPar];
		int aux = 0;
		for(int i = 0; i < valor.length; i++) {
			if(valor[i] % 2 == 0) {
				par[aux] = valor[i];
				aux++;
			}
		}
		System.out.println("Valores pares: " + Arrays.toString(par));
	}
	public static void vetorImpar(int qtdImpar, int valor[]) {
		int impar[] = new int[qtdImpar];
		int aux = 0;
		for(int i = 0; i < valor.length; i++) {
			if(valor[i] % 2 != 0) {
				impar[aux] = valor[i];
				aux++;
			}
		}
		System.out.println("Valores ímpares: " + Arrays.toString(impar));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor[] = new int[10];
		int qtdPar = 0;
		int qtdImpar = 0;
		for(int i = 0; i < 10; i++) {
			System.out.print((i+1) + "º valor: ");
			valor[i] = scanner.nextInt();
			if(valor[i] % 2 == 0) {
				qtdPar++;
			}else {
				qtdImpar++;
			}
		}
		scanner.close();
		System.out.println("============================");
		vetorPar(qtdPar, valor);
		vetorImpar(qtdImpar, valor);
	}
}