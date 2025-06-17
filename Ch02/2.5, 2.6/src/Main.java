import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Calcula o produto de três inteiros
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int z;
		int result;
		
		System.out.println("Insira o primeiro inteiro");
		x = input.nextInt();
		
		System.out.println("Insira o segundo inteiro");
		y = input.nextInt();
		
		
		System.out.println("Insira o terceiro inteiro");
		z = input.nextInt();
		
		result = x*y*z;
		System.out.printf("Product is %d%n", result);

		
		
		

	}

}
