import java.util.*;
public class ArrendodaNumeros {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double num;
		
		System.out.println("Escrevao numero para ser arredondado: ");
		num = input.nextDouble();
		
		double numArredondado = Math.floor(num + 0.5);
		
		System.out.println("Numero original: " + num);
		System.out.println("Numero arredondado: " + numArredondado);
	}
}
