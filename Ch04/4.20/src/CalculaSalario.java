import java.util.Scanner;
public class CalculaSalario {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int item1, item2, item3, item4;
		double totalDeVendas;
		double salarioFinal;
		
		System.out.println("quant de item1: ");
		item1 = input.nextInt();
		
		System.out.println("quant de item2: ");
		item2 = input.nextInt();
		
		System.out.println("quant de item3: ");
		item3 = input.nextInt();
		
		System.out.println("quant de item4: ");
		item4 = input.nextInt();
		
		totalDeVendas = (item1 * 239.99) + (item2 * 129.75) + (item3 * 99.95) + (item4 * 350.89);
		
		salarioFinal = (totalDeVendas * 0.09) + 200;
		
		System.out.println("Rendimentos do vendedor: " + salarioFinal);
	}

}
