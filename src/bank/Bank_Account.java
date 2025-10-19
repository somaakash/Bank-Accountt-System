package bank;

public class Bank_Account {
	
	private String Name;
	private int Age;
	
	private String Account_number;
	private String password;
	private double balance;
	
	
	

	public Bank_Account(String name, int age, String account_number, String password, double balance) {
		
		this.Name = name;
		this.Age = age;
		this.Account_number = account_number;
		this.password = password;
		this.balance = balance;
	}
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		if(Age<0) {
			System.out.println("Age is invlaid.Please enter valid Age");
		}
		else {
			System.out.println(Age);
		}
	}
	
	public String getAccount_number() {
		return Account_number;
	}
	public void setAccount_number(String account_number) {
		Account_number = account_number;
		
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(int ammount) {
		if(balance<0) {
			System.out.println("Inalid input");
		}
		else {
			balance = balance+ammount;
			System.out.println("Money deposited successfully");
		}
		
	}
	
	
	public void withdraw(int ammount) {
		if(ammount>balance) {
			
			System.out.println("Money insufficient");	
		}
		else {
			balance = balance-ammount;	
			System.out.println("Money withdrawn");
		}
		
	}
	
	public void display_all_details() {
		System.out.println("Name is: "+ Name);
		System.out.println("Age is: " + Age);
		System.out.println("Account Number: "+ Account_number);
		System.out.println("Password is: "+password);
		
	}
	

}
