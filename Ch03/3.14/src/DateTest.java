
public class DateTest {

	public static void main(String[] args) {
		
		Date Data1 = new Date(10, 27, 2042);
		Date Data2 = new Date(13, 34, 2042);
		
		System.out.print("Data original: ");
		Data1.displayDate();
		
		Data1.setDia(22);
		Data1.setMes(1);
		Data1.setAno(2022);
		
		System.out.print("Data alterada: ");
		Data1.displayDate();
		
		System.out.print("Data original: ");
		Data2.displayDate();
		
		Data2.setDia(36);
		Data2.setMes(1);
		Data2.setAno(2022);
		
		System.out.print("Data alterada: ");
		Data2.displayDate();
		
		
		
		

	}

}
