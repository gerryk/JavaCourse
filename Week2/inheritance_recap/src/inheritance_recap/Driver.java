package inheritance_recap;

public class Driver {

	public static void main(String[] args) {
		Employee[] employee = new Employee[3];
		employee[0] = new Employee("Gerry Kavanagh", 10000);
		employee[1] = new Employee("Patrick Bateman", 2000);
		employee[2] = new CommissionEmployee("John Smith", 2000, 500, 20);
		listEmployees(employee);
	}

	public static void listEmployees(Employee[] e)	{
		for(int i = 0; i < e.length; ++i)	{
			System.out.printf("%s", e[i].toString());
		}
	}
}
