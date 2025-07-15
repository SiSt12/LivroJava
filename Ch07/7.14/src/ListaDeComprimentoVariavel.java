import java.util.*;
public class ListaDeComprimentoVariavel {

	public static int product(int... numeros) {
		int resultado = 1;
		
		for (int valor : numeros) {
			resultado *= valor;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		int[] lista = new int[5];
		
		for (int i = 0; i <=4; i++) {
			lista[i] = (i+1)*2;
		}
		
		System.out.println("Teste1: " + product(1,2,3,4,5));
		System.out.println("Teste2: " + product(10, 9, 3, 5));
		System.out.println("Teste3: " + product(lista));
	}

}
