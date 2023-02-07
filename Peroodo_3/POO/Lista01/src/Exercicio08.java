import java.util.Scanner;

public class Exercicio08 {

	public static void calcularFibonacci(int termo) {
		int atual = 1;
		int anterior = 0;
		int resultado = 0;
		for(int i = 2; i < termo; i++) {
			resultado = anterior + atual;
			anterior = atual;
			atual = resultado;
		}
		System.out.println(termo + "º termo de Fibonacci é: " + resultado);
		System.out.println("==================================");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int termo = 0;
		do {
			System.out.print("Termo da sequência de Fibonacci(digite 0 para sair): ");
			termo = scanner.nextInt();
			switch(termo) {
				case 0:
					break;
				case 1:
					System.out.println(termo + "º termo de Fibonacci é: 0.");
					System.out.println("==================================");
					break;
				case 2:
					System.out.println(termo + "º termo de Fibonacci é: 1.");
					System.out.println("==================================");
					break;
				default:
					calcularFibonacci(termo);
			}
		}while(termo != 0);
		scanner.close();
	}
}