package inheritance_recap;

public class CommissionEmployee extends Employee {

	protected float sales;
	protected float commission;
	
	public CommissionEmployee(String name, float salary, float commission, float sales) {
		super(name, salary);
		this.commission = commission;
		this.sales = sales;
	}
	
	@Override
	public float calculateMonthlySalary()	{
		return super.calculateMonthlySalary() + (this.sales * (this.commission / 100));
	}
}
