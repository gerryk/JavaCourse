import java.util.Date;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		Account ac = new Account();
		Account ac2 = new Account(101, "Morgan Kavanagh", 100, today);
		ac.setId(100);
		ac.setAccountOwnerName("Gerry Kavanagh");
		ac.setBalance(10000000);
		ac.setCreatedOn(today);
		System.out.printf("Number of accounts: %d\n\n", Account.getNumberOfAccounts());
		System.out.printf("Account Details - \nID: %d\nName: %s\nBalance: €%.2f\nCreated On: %tc\n",
				ac.getId(), ac.getAccountOwnerName(), ac.getBalance(), ac.getCreatedOn());
		System.out.printf("Account Details - \nID: %d\nName: %s\nBalance: €%.2f\nCreated On: %tc\n",
				ac2.getId(), ac2.getAccountOwnerName(), ac2.getBalance(), ac2.getCreatedOn());
		ac.lodgement(125);
		ac2.withdrawal(5);
		System.out.printf("After Transactions\n");
		System.out.printf("Account Details - \nID: %d\nName: %s\nBalance: €%.2f\nCreated On: %tc\n",
				ac.getId(), ac.getAccountOwnerName(), ac.getBalance(), ac.getCreatedOn());
		System.out.printf("Account Details - \nID: %d\nName: %s\nBalance: €%.2f\nCreated On: %tc\n",
				ac2.getId(), ac2.getAccountOwnerName(), ac2.getBalance(), ac2.getCreatedOn());
		
	}

}
