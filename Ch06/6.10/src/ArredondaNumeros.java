import java.util.*;
public class ArredondaNumeros {
	
	public static double roundToInteger(double num) {
		double y = Math.floor(num + 0.5);
		return y;
	}
	
	public static double roundtoTenths(double num) {
		double y = Math.floor(num * 10 + 0.5) / 10;
		return y;
	}
	
	public static double roundtoHundredths(double num) {
		double y = Math.floor(num * 100 + 0.5) / 100;
		return y;
	}
	
	public static double roundtoThousandths(double num) {
		double y = Math.floor(num * 1000 + 0.5) / 1000;
		return y;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escreva um numero de 4 casas decimais para ser arrendodado: ");
		double num = input.nextDouble();
		
		double numInteger = roundToInteger(num);
		double numTenth = roundtoTenths(num);
		double numHundred = roundtoHundredths(num);
		double numThousand = roundtoThousandths(num);
		
		System.out.println("Original number: " + num);
		System.out.println("Int" + numInteger);
		System.out.println("Tenth" + numTenth);
		System.out.println("hundred" + numHundred);
		System.out.println("Thousand" + numThousand);
		
		
	}
	
}
