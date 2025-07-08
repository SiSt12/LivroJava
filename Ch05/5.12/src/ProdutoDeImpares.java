
public class ProdutoDeImpares {

	public static void main(String[] args) {
		int valor = 1;
		for (int i = 1; i <= 15; i++) {
			if (i % 2 != 0){
				valor *= i;
			}
		}
		System.out.println("Produto: " + valor);
	}
}
