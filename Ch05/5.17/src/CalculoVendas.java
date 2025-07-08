import java.util.*;
public class CalculoVendas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double preco = 0.00;
		double totalVendas = 0.00;
		
		System.out.println("Quantos valores inserir? ");
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++ ) {
			System.out.println("Numero do produto(1 a 5): ");
			int produto = input.nextInt();
			
			System.out.println("Quantidade vendida: ");
			int quantidade = input.nextInt();
			
			switch(produto){
				case 1:
					preco = 2.98;
					break;
				case 2:
					preco = 4.50;
					break;
				case 3:
					preco = 9.98;
					break;
				case 4:
					preco = 4.49;
					break;
				case 5:
					preco = 6.87;
					break;
			}
			
			double valorCompra = quantidade * preco;
			totalVendas += valorCompra;
			System.out.println("Compra no valor de: " + valorCompra + " realizada!");
		}
		System.out.println("Total de vendas: " + totalVendas);
		
		

	}

}
