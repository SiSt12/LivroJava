import java.util.Scanner;
public class CalculadorSalarios {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int quantidadeEmpregados = 3;
		double horasTrabalhadas;
		double salarioHora;
		
		
		for (int i = 1; i <= quantidadeEmpregados; i++) {
			
			System.out.print("Escreva as horas trabalhadas: ");
			horasTrabalhadas = input.nextDouble();
			
			System.out.print("Escreva o salario/hora: ");
			salarioHora = input.nextDouble();
			
			double salarioBruto;
			
			if (horasTrabalhadas <= 40) {
				salarioBruto = horasTrabalhadas * salarioHora;
			} else {
				double horasNormais = 40;
				double horasExtras = horasTrabalhadas - 40;
				
				salarioBruto = (horasNormais * salarioHora) + (horasExtras * (salarioHora * 1.50));
			}
			
			System.out.printf("Salario bruto:  %.2f\n", salarioBruto);
		}
		
		

	}

}
