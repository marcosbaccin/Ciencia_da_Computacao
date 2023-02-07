import java.util.Scanner;

public class Exercicio06 {

	public static int calcularFatorial(int valor) {
		if(valor == 0) {
			return 1;
		}
		return valor * calcularFatorial(valor-1);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor;
		int resultado;
		do {
			System.out.print("Calcular o fatorial de (digite 0 para sair): ");
			valor = scanner.nextInt();
			if(valor <= 0) {
				break;
			}
			resultado = calcularFatorial(valor);
			System.out.println(valor + "! = " + resultado);
			System.out.println("=========================");
		}while(valor > 0);
		scanner.close();
	}
}