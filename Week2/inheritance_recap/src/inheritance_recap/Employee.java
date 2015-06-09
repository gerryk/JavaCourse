package inheritance_recap;

public class Employee {
	protected String name;
	protected float salary;
	
	public Employee(String name, float salary)	{
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float calculateMonthlySalary()	{
		return this.getSalary();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + this.calculateMonthlySalary() + "]\n";
	}
}
