import java.util.Date; 


public class Account {
	private int id;
	private String accountOwner;
	private double balance;
	private String creationDate;
	private static int numberOfAccounts;
	private Transaction [] transactions = new Transaction[10];
	private int transactionIndex = 0;
	public Account() {
		Date d = new Date();
		this.id = ++Account.numberOfAccounts;
		this.creationDate = d.toString();
	}
	public Account(String accountOwner, double balance)	{
		this();
		this.accountOwner = accountOwner;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public String getAccountOwner() {
		return accountOwner;
	}
	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	public void deposit(double amount)	{
		if (amount > 0)	{
			this.balance += amount;
			if (transactions.length >= 10)	{	
				for (int i = 0; i < transactions.length-1; ++i)	{
					transactions[i] = transactions[i+1];
				}
			}
			transactions[transactionIndex++] = new Transaction("D", amount);
		} else	{
			System.out.println("Can't deposit a negative amount");
		}
	}
	public void withdraw(double amount)	{
		if (amount > 0)	{
			this.balance -= amount;
			if (transactions.length >= 10)	{	
				for (int i = 0; i < transactions.length-1; ++i)	{
					transactions[i] = transactions[i+1];
				}
			}
			transactions[transactionIndex++] = new Transaction("W", amount);
		} else	{
			System.out.println("Can't withdraw a negative amount");
		}
	}
	public void printTransactions()	{
		for (int i = transactionIndex; i > 0; --i)	{
			if (transactions[i] != null)	{
				System.out.printf("%d %s %s %f%n", 
						transactions[i].getId(),
						transactions[i].getDate(),
						transactions[i].getType() == "D"?"Deposit":"Withdrawal",
						(float)transactions[i].getAmount());
			}
		}
	}
}
