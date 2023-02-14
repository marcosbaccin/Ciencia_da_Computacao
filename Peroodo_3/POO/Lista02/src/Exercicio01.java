import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int qtdVeiculos;
		System.out.print("Quantidades de veículos: ");
		qtdVeiculos = scanner.nextInt();
		Veiculo veiculos[] = new Veiculo[qtdVeiculos];
		Veiculo v = new Veiculo();
		v.registrar(veiculos);
		
		int qtdClientes;
		System.out.print("\nQuantidade de clientes: ");
		qtdClientes = scanner.nextInt();
		Cliente clientes[] = new Cliente[qtdClientes];
		Cliente c = new Cliente();
		c.registrar(clientes);
		
		int escolha = 1;
		while(escolha != 0) {
			System.out.println("\nEscolha o cliente (Digite 0 para sair):");
			c.exibirClientes(clientes);
			escolha = scanner.nextInt();
			if(escolha != 0) {
				c.alugar(clientes[escolha-1], veiculos, v);
			}
		}

		scanner.close();
	}
}