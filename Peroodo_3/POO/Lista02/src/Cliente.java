import java.util.Scanner;

public class Cliente {

	String nome;
	String cpf;
	String cartaoCredito;
	boolean aluguel;
	
	Cliente[] registrar(Cliente clientes[]) {
		Scanner scanner = new Scanner(System.in);
			
		for(int i = 0; i < clientes.length; i++) {	
			clientes[i] = new Cliente();
			System.out.println("\nCliente " + (i+1));
			System.out.print("Nome: ");
			clientes[i].nome = scanner.nextLine();
			System.out.print("CPF: ");
			clientes[i].cpf = scanner.nextLine();
			System.out.print("Cartão de crédito: ");
			clientes[i].cartaoCredito = scanner.nextLine();
			clientes[i].aluguel = false;
		}
		scanner.close();
		return clientes;
	}
	
	void exibirClientes(Cliente clientes[]) {
		for(int i = 0; i < clientes.length; i++) {
			System.out.println("Cliente " + (i+1) + ": " + clientes[i].nome);
		}
	}
	
	void alugar(Cliente cliente, Veiculo veiculos[], Veiculo v){
		if(!cliente.aluguel) {	
			Scanner scanner = new Scanner(System.in);
			int escolha;
			
			System.out.println("Escolha o veículo (Digite 0 para sair):");
			v.exibirVeiculos(veiculos);
			escolha = scanner.nextInt();
			if(!veiculos[escolha-1].alugado) {
				int dias;
				int confirm;
				System.out.print("Por quantos dias deseja alugar o veículo: ");
				dias = scanner.nextInt();
				v.calcularAluguel(dias, veiculos[escolha-1]);
				System.out.println("\nConfirmar aluguel:\n1) Sim\n0) Não");
				confirm = scanner.nextInt();
				if(confirm == 1) {
					v.alugar(veiculos[escolha-1]);
					cliente.aluguel = true;
				}
			} else {
				System.out.println("Este veículo não pode ser alugado!!");
			}
			scanner.close();
		} else {
			System.out.println(cliente.nome + " já alugou um veículo!!");
		}
	}
}