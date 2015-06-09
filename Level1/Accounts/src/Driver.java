
public class Driver {

	public static void main(String[] args) {
		Account a = new Account("Gerry Kavanagh", 1000000000);
		System.out.printf("Number of accounts on file: %d%n", Account.getNumberOfAccounts());
		System.out.printf("A/C %5d - %s Balance: €%10.2f Created: %s%n", 
				           a.getId(), 
				           a.getAccountOwner(), 
				           a.getBalance(), 
				           a.getCreationDate());
		System.out.println("Depositing 1300");
		a.deposit(1300);
		System.out.printf("Transactions: %d%n",Transaction.getNumberOfTransactions());
		System.out.printf("A/C %5d - %s Balance: €%10.2f Created: %s%n", 
				           a.getId(), 
				           a.getAccountOwner(), 
				           a.getBalance(), 
				           a.getCreationDate());
		System.out.println("Withdrawing 1300");
		a.withdraw(1300);
		System.out.printf("Transactions: %d%n",Transaction.getNumberOfTransactions());
		System.out.printf("A/C %5d - %s Balance: €%10.2f Created: %s%n", 
				           a.getId(), 
				           a.getAccountOwner(), 
				           a.getBalance(), 
				           a.getCreationDate());
		a.printTransactions();
	}

}
