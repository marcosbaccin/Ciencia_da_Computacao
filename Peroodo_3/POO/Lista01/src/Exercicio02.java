import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float precoGasolina, precoEtanol;
		int cont = 0;
		do {
			System.out.print("Preço da gasolina: R$");
			precoGasolina = scanner.nextFloat();
			System.out.print("Preço do etanol: R$");
			precoEtanol = scanner.nextFloat();
			if((precoEtanol / precoGasolina) <= 0.7) {
				System.out.println("Abasteça com etanol.");
				System.out.println("====================");
			}else {
				System.out.println("Abasteça com gasolina.");
				System.out.println("====================");
			}
			System.out.println("Realizar cálculo novamente: [1]Sim\t[0]Não");
			cont = scanner.nextInt();
			System.out.println("===========================================");
		}while(cont > 0);
		scanner.close();
	}
}