import java.util.*;
public class GraficoDeBarras {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] valores = new int[5];
		
 		for (int i = 0; i < 5; i++) {
			
			System.out.println("Escreva um numero de 1 a 30: ");
			valores[i] = input.nextInt();
			
			if (valores[i] < 1 || valores[i] > 30) {
				System.out.println("Valor inválido");
				return;
			}
 		}
		for (int v : valores) {
			for (int n = 0; n < v; n++) {
				System.out.print("*");
			}
		System.out.println();
		}
			
	}

}
