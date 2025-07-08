
public class InvoiceTest {
	public static void main(String[] args) {
		
		Invoice testeinvoice1 = new Invoice("2", "teclado", 32, 40.0);
		
		System.out.println(testeinvoice1.getNum());
		System.out.println(testeinvoice1.getDescricao());
		System.out.println(testeinvoice1.getQuantidade());
		System.out.println(testeinvoice1.getPreco());
		System.out.println(testeinvoice1.getInvoiceAmount());
		
		Invoice testeinvoice2 = new Invoice("4", "monitor", 20, 500.0);
		
		System.out.println(testeinvoice2.getNum());
		System.out.println(testeinvoice2.getDescricao());
		System.out.println(testeinvoice2.getQuantidade());
		System.out.println(testeinvoice2.getPreco());
		System.out.println(testeinvoice2.getInvoiceAmount());
	}
}
