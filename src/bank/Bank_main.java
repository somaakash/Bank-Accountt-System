package bank;

public class Bank_main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank_Account acc = new Bank_Account("akash", 21, "1546235263", "Hello#$hb", 800000);
		//System.out.println(acc.getName());
		//System.out.println(acc.getAge());
		//System.out.println(acc.getAccount_number());
		//System.out.println(acc.getPassword());
		acc.display_all_details();
		acc.deposit(5000);
		System.out.println(acc.getBalance());
		acc.withdraw(4000);
		System.out.println(acc.getBalance());
		
	}

}
