import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		
		System.out.println("Escreva o primeiro inteiro");
		x = input.nextInt();
		System.out.println("Escreva o segundo inteiro");
		y = input.nextInt();
		
		int soma = x + y;
		int produto = x * y;
		int diferenca =  x - y;
		int quociente = x / y;
		
		System.out.printf("Soma: %d%n", soma);
		System.out.printf("produto: %d%n", produto);
		System.out.printf("diferenca: %d%n", diferenca);
		System.out.printf("quociente: %d%n", quociente);


	}

}
