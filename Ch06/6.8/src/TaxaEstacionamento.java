import java.util.*;

public class TaxaEstacionamento {
	
	public static double calculateCharges(double horas) {
		double tarifa = 2.00;
		
		if (horas > 3) {
			double adicional = Math.ceil(horas - 3) * 0.5;
			tarifa += adicional;
		} 
		if(tarifa > 10) {
			tarifa = 10;
		}
		
		return tarifa;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numClientes;
		double tarifaTotal = 0.00;
		
		System.out.println("Quantas pessoas estacionaram? ");
		numClientes = input.nextInt();
		
		for (int i = 1; i <= numClientes; i++) {
			
			System.out.printf("Quantas horas ficou o cliente %d: ", i);
			double horas = input.nextInt();
			
			double tarifa = calculateCharges(horas);
			
			tarifaTotal += tarifa;
			
			System.out.printf("Cliente %d: R$ %.2f\n", i, tarifa);
			
		}
		
		System.out.println("Total arrecadado: " + tarifaTotal);
	
	}
}
