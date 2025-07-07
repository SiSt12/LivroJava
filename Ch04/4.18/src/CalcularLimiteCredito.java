import java.util.Scanner;
public class CalcularLimiteCredito {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numConta;
		int saldoInicio;
		int totalItemsCobrados;
		int totalCreditosAplicados;
		int limiteDeCredito;
		int novoSaldo;
		
		System.out.print("Insira o numero da conta: ");
		numConta = input.nextInt();
		
		System.out.print("Insira o saldo do inicio do mes: ");
		saldoInicio = input.nextInt();
		
		System.out.print("Insira o total de items cobrados: ");
		totalItemsCobrados = input.nextInt();
		
		System.out.print("Insira o total de creditos aplicados: ");
		totalCreditosAplicados = input.nextInt();
		
		System.out.print("Insira o limite de credito: ");
		limiteDeCredito = input.nextInt();
		
		novoSaldo = saldoInicio + totalItemsCobrados - totalCreditosAplicados;
		
		System.out.print("Seu novo saldo e: " + novoSaldo);
		
		if (novoSaldo > limiteDeCredito) {
			System.out.println("Limite de credito excedido");
		}
	}
}
