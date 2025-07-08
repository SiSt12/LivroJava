
public class Invoice {
	private String num;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public Invoice(String num, String descricao, int quantidade, double preco) {
		this.num = num;
		this.descricao = descricao;
		setQuantidade(quantidade);
		setPreco(preco);
	}
	
	public void setNum(String num){
		this.num = num;
	}
	
	public String getNum() {
		return num;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setQuantidade(int quantidade) {
		if (quantidade > 0 ) {
			this.quantidade = quantidade;
		}
		else {
			this.quantidade = 0;
		}
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setPreco(double preco) {
		if (preco > 0.0) {
			this.preco = preco;
		}
		else {
			this.preco = 0.0;
		}
	}
	
	public double getPreco() {
		return preco;
	}
	
	public double getInvoiceAmount() {
		return quantidade * preco;
	}
}



	