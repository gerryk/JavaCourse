import java.util.Date;


public class Transaction {
	private static int numberOfTransactions;
	private int id;
	private String date;
	private String type;
	private double amount;
	public Transaction(String type, double amount) {
		Date d = new Date();
		if (type == "D" || type == "W")	{
			this.id = ++Transaction.numberOfTransactions;
			this.type = type;
			this.amount = amount;
			this.date = d.toString();
		} else	{
			System.out.printf("Don't know what to do with type \"%s\"%n");
		}
	}
	public static int getNumberOfTransactions() {
		return numberOfTransactions;
	}
	public int getId() {
		return id;
	}
	public String getDate() {
		return date;
	}
	public String getType() {
		return type;
	}
	public double getAmount() {
		return amount;
	}
}
