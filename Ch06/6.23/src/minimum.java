import java.util.*;
public class minimum {
	public static double minimum3(double num[]) { 
		double primeiroMin = Math.min(num[0], num[1]);
		double minFinal = Math.min(num[2], primeiroMin);
		return minFinal;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] num = new double[3];
		
		for (int i = 0; i <= 2; i++) {
			System.out.printf("Digite o %dº número: ", i + 1);
			num[i] = input.nextDouble();
		}
		
		double numMinimo = minimum3(num);
		System.out.println("O numero minimo é: " + numMinimo);
		
	}
	
}
