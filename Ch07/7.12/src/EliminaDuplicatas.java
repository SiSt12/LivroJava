import java.util.*;
public class EliminaDuplicatas {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> lista = new ArrayList<>();
		
		int tentativas = 0;
        while (tentativas < 5) {
            System.out.print("Digite um número entre 10 e 100: ");
            int num = input.nextInt();
            
            if (num < 10 || num > 100) {
				System.out.println("Numero fora do intervalo, digite novamente.");
				continue;
            }
				
			if (!lista.contains(num)) {
				lista.add(num);
			} else {
				System.out.println("Numero é duplicado!");
			}
			
			System.out.println("Valores unicos até o momento: ");
			for (int valor : lista) {
	        	System.out.println(valor);
	        }
			
			tentativas++;
        }
        
	}

}
