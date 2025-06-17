import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		int x;
		int y;
		
		System.out.println("Escreva o primeiro inteiro");
		x = input.nextInt();
		System.out.println("Escerva o segundo inteiro");
		y = input.nextInt();
		
		if (x > y)
			System.out.printf("%d is larger", x);
		if (x < y)
			System.out.printf("%d is larger", y);
		if (x == y)
			System.out.println("These numbers are equal");
			
	}

}
