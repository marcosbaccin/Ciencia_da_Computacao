import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float salarioFixo;
		float valorVendas;
		double comissao = 0.03;
		System.out.print("Salário: R$");
		salarioFixo = scanner.nextFloat();
		System.out.print("Valor das vendas: R$");
		valorVendas = scanner.nextFloat();
		scanner.close();
		if(valorVendas <= 1500) {
			comissao = comissao * valorVendas;
		}else {
			comissao = (comissao * 1500) + (valorVendas - 1500) * 0.05;
		}
		System.out.println("Salário total: R$" + (salarioFixo + comissao));
	}
}