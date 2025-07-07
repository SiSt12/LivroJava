import java.util.Scanner;
public class CalcularKmL {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int km;
		int litros;
		int totalKm = 0, totalLitros = 0;
		
		System.out.println("Insira a quantidade de km rodados:   ou -1 para sair");
		km = input.nextInt();
		
		while (km != -1) {
			System.out.println("Insira a quantidade de litros consumidos: ");
			litros = input.nextInt();
			
			double media = km / litros;
			System.out.println("A media de consumo e: " + media);
			
			totalKm += km;
			totalLitros += litros;
			
			System.out.println("total de kilometros rodados: " + totalKm);
			System.out.println("Total de litros consumidos: " + totalLitros);
			
			System.out.println("Insira a quantidade de km rodados:   ou -1 para sair");
			km = input.nextInt();
		}

	}

}
