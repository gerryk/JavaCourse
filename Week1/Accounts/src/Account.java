import java.util.Date;

public class Account {
	private int id;
	private String accountOwnerName;
	private float balance;
	private Date createdOn;
	private static int numberOfAccounts = 0;
	private Transaction [] transactions = new Transaction[10];
	private int transactionIndex = 0;
	
	// getters
	public int getId()	{
		return this.id;
	}
	public String getAccountOwnerName()	{
		return this.accountOwnerName;
	}
	public float getBalance()	{
		return this.balance;
	}
	public Date getCreatedOn()	{
		return this.createdOn;
	}
	public static int getNumberOfAccounts()	{
		return numberOfAccounts;
	}
	// setters
	public void setId(int id)	{
		this.id = id;
	}
	public void setAccountOwnerName(String accountOwnerName)	{
		this.accountOwnerName = accountOwnerName;
	}
	public void setBalance(float balance)	{
		this.balance = balance;
	}
	public void setCreatedOn(Date createdOn)	{
		this.createdOn = createdOn;
	}
	public static void setNumberOfAccounts(int num)	{
		numberOfAccounts = num;
	}
	public void incrementNumberOfAccounts()	{
		numberOfAccounts++;
	}
	public void decrementNumberOfAccounts()	{
		numberOfAccounts--;
	}
	
	// constructors
	public Account(int id, String accountOwnerName, float balance, Date createdOn)	{
		this.setId(id);
		this.setBalance(balance);
		this.setAccountOwnerName(accountOwnerName);
		this.setCreatedOn(createdOn);
		this.incrementNumberOfAccounts();
	}
	public Account()	{
		this.incrementNumberOfAccounts();
	}
	
	// balance alterations
	public void lodgement( float amount)	{
		Date date = new Date();
		if (amount >= 1)
			this.balance += amount;
		if (this.transactionIndex == 9)
			this.rotateTransactions();
		this.transactions[this.transactionIndex++] = new Transaction(this.transactionIndex, date, amount, "Lodgement" );
	}
	
	public void withdrawal( float amount)	{
		Date date = new Date();
		if (amount >= 1 && this.balance - amount >= 1)
			this.balance -= amount;
		if (this.transactionIndex == 9)
			this.rotateTransactions();
		this.transactions[this.transactionIndex++] = new Transaction(this.transactionIndex, date, amount, "Withdrawal" );
	}
	
	private void rotateTransactions()	{
		for (int i = 0; i < 9; i++)	
			this.transactions[i] = this.transactions[i+1];
		this.transactionIndex--;
	}
	
	public void printTransactions()	{
		for (int i = 0; i <=this.transactionIndex; i++ )	
			System.out.printf("%d - %tc - %s - %.2f", 
					this.transactions[i].getId(),
					this.transactions[i].getDate(),
					this.transactions[i].getType(), 
					this.transactions[i].getAmount());
	}
}
