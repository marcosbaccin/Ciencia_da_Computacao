import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade;
		do {
			System.out.print("Idade do atleta (digite 0 para sair): ");
			idade = scanner.nextInt();
			if(idade < 5) {
				break;
			}
			switch(idade) {
				case 5: case 6: case 7:
					System.out.println("Categoria: Infantil A.");
					System.out.println("======================");
					break;
				case 8: case 9: case 10: case 11:
					System.out.println("Categoria: Infantil B.");
					System.out.println("======================");
					break;
				case 12: case 13: case 14:
					System.out.println("Categoria: Juvenil A.");
					System.out.println("======================");
					break;
				case 15: case 16: case 17:
					System.out.println("Categoria: Juvenil B.");
					System.out.println("======================");
					break;
				default:
					System.out.println("Categoria: Adulto.");
					System.out.println("======================");
					break;
			}
		}while(idade >= 5);
		scanner.close();
	}
}