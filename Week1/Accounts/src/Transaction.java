import java.util.Date;

public class Transaction {
	private int id;
	private Date date;
	private float amount;
	private String type;
	public Transaction(int id, Date date, float amount, String type)	{
		this.id = id;
		this.date = date;
		this.amount = amount;
		this.type = type;
	}
	// getters
	public int getId()	{
		return this.id;
	}
	public Date getDate()	{
		return this.date;
	}
	public float getAmount()	{
		return this.amount;
	}
	public String getType()	{
		return type;
	}
}
