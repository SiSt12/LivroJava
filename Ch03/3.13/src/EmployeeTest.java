
public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Marcos", "Abreu", 2000.0);
		Employee employee2 = new Employee("Roberto", "Jota", 5500.0);
		
		System.out.println(employee1.getName());
		System.out.println(employee1.getSurname());
		System.out.println(employee1.getSalario());
		System.out.println(employee1.getSalarioAnual());
		employee1.setAumento(100.0);
		System.out.printf("Valor com aumento de 100%%: %.2f\n", employee1.getSalario());
		
		System.out.println(employee2.getName());
		System.out.println(employee2.getSurname());
		System.out.println(employee2.getSalario());
		System.out.println(employee2.getSalarioAnual());
		employee2.setAumento(52.0);
		System.out.printf("Valor com aumento de 52%%: %.2f\n", employee2.getSalario());
		
		
		
	}
}
