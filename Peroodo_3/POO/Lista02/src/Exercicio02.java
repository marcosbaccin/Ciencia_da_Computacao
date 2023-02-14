import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int qtdContas;
		System.out.print("Quantidade de contas: ");
		qtdContas = scanner.nextInt();
		
		Conta contas[] = new Conta[qtdContas];
		Conta c = new Conta();
		c.registrar(contas);
		
		int escolha = 1;
		while(escolha != 0) {
			System.out.println("\nEscolha a operação:\n1) Sacar\n2) Depositar\n3) Transferir\n0) Sair");
			System.out.print("Escolha a operação: ");
			escolha = scanner.nextInt();
			
			switch(escolha) {
				case 1:
					c.sacar(contas, c);
					break;
				case 2:
					c.depositar(contas, c);
					break;
				case 3:
					c.transferir(contas, c);
					break;
				default:
					break;
			}
		}
	}
}