import java.util.*;
public class MenorValor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.print("Quantos números você vai digitar? ");
		int numDeValores = input.nextInt();
		
		if (numDeValores <= 0) {
			System.out.println("Quantidade inválida!");
			return;
		}
		
		System.out.println("Escreva o 1 numero: ");
		int valorMenor = input.nextInt();
		
		for (int i = 2; i <= numDeValores; i++) {
			System.out.println("Digite o " + i + "numero: ");
			int valor = input.nextInt();
			
			if (valor < valorMenor) {
				valorMenor = valor;
			}
		}
		System.out.println("Menor valor é: " + valorMenor);
	}

}
