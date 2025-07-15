import java.util.*;
public class forAprimorada {
	
	public static double somaValores(String numeros) {
		String[] partes = numeros.split(", ");
		double resultado = 0.00;
		for (String s : partes) {
			double valor = Double.parseDouble(s);
			resultado += valor;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escreva numeros separados por , : ");
		String linha = input.nextLine();
		
		System.out.println("Soma dos numeros é: " + somaValores(linha));
	}

}
