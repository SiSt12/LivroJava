
public class Employee {
	private String name;
	private String surname;
	private double salario;
	
	public Employee(String name, String surname, double salario){
		this.name = name;
		this.surname = surname;
		setSalario(salario);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSalario(double salario) {
		if(salario > 0.0) {
			this.salario = salario;
		}
	}
	
	public double getSalario() {
		return salario;
	}
	
	public double getSalarioAnual() {
		return salario * 12;
	}
	
	public void setAumento(double porcentagem) {
		if (porcentagem > 0) {
			salario += salario * (porcentagem / 100);
		}
	}
}
