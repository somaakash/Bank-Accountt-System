package bank;
import java.util.Scanner;
public class Bank_main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();

		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		sc.nextLine(); // consume leftover newline

		System.out.print("Enter your account number: ");
		String accountNumber = sc.nextLine();

		System.out.print("Enter your password: ");
		String password = sc.nextLine();

		System.out.print("Enter your balance: ");
		double balance = sc.nextDouble();

		//Bank_Account acc = new Bank_Account("akash", 21, "1546235263", "Hello#$hb", 800000);
		
		Bank_Account acc = new Bank_Account(name, age, accountNumber, password, balance);

        System.out.println("\n=== Account Created Successfully ===");
        acc.display_all_details();
		//System.out.println(acc.getName());
		//System.out.println(acc.getAge());
		//System.out.println(acc.getAccount_number());
		//System.out.println(acc.getPassword());
        
     // Deposit & Withdraw operations
        System.out.print("Enter amount to deposit: ");
        double depositamt = sc.nextDouble();
        acc.deposit((int) depositamt);

        System.out.println("Updated Balance: " + acc.getBalance());

        System.out.print("Enter amount to withdraw: ");
        double withdrawamt = sc.nextDouble();
        acc.withdraw((int) withdrawamt);
		
		//acc.deposit(5000);
		//System.out.println(acc.getBalance());
		//acc.withdraw(4000);
		System.out.println(acc.getBalance());
		
	}

}
