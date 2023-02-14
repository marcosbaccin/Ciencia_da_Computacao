import java.util.Scanner;

public class Veiculo {
	
	String placa;
	String cor;
	String modelo;
	String ano;
	double preco;
	boolean alugado;
	
	Veiculo[] registrar(Veiculo veiculos[]) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < veiculos.length; i++) {	
			veiculos[i] = new Veiculo();
			System.out.println("\nVeículo " + (i+1));
			System.out.print("Placa: ");
			veiculos[i].placa = scanner.next();
			veiculos[i].placa = veiculos[i].placa.toUpperCase();
			System.out.print("Cor: ");
			veiculos[i].cor = scanner.next();
			veiculos[i].cor = veiculos[i].cor.toUpperCase();
			System.out.print("Modelo: ");
			veiculos[i].modelo = scanner.next();
			veiculos[i].modelo = veiculos[i].modelo.toUpperCase();
			System.out.print("Ano: ");
			veiculos[i].ano = scanner.next();
			System.out.print("Preço: R$");
			veiculos[i].preco = scanner.nextDouble();
			veiculos[i].alugado = false;
			scanner.nextLine();
		}
		scanner.close();
		return veiculos;
	}
	
	void exibirVeiculos(Veiculo veiculos[]) {
		for(int i = 0; i < veiculos.length; i++) {
			System.out.println("Veículo " + (i+1) + ": " + veiculos[i].modelo + " " + veiculos[i].cor + "  R$" + veiculos[i].preco);
		}
	}
	
	void alugar(Veiculo veiculo) {
		veiculo.alugado = true;
	}
	
	void calcularAluguel(int dias, Veiculo veiculo) {
		double valor = dias * veiculo.preco;
		System.out.printf("Valor do aluguel: R$%.2f", valor);
	}
}