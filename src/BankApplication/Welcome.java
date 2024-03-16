package BankApplication;

import java.util.Scanner;

public class Welcome {
	
	int AccountNumber;
	String name;
	String address;
	int PanNo;
	int Amount;
	
	public static void main(String[] args) {
		do {
        System.out.println("********Welcome to Bank********");
		
		System.out.println("Press 1 for Account Creation");
		
		System.out.println("Press 2 for view Account");
		
		System.out.println("Press 3 for withdraw Money");
		
		System.out.println("Press 4 for Deposite Money");
		
		System.out.println("Press 5 for update Account");
		
		System.out.println("Press 6 for EXIT");
		//System.out.println("\nEnter your choice");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1: System.out.println("Enter your Account number");
		        int no = sc.nextInt();
		
		        System.out.println("Enter your name");
		        String s = sc.next();
		
		        System.out.println("Enter your address");
		        String sh = sc.next();
		
		        System.out.println("Enter your PanNo");
		        int no1 = sc.nextInt();
		
		        System.out.println("Enter Amount you want to deposite");
		        int no2 = sc.nextInt();
		
		        System.out.println("Account created successfully");
	
		        break;
		
		 case 2: public int getAccountNumber() {
				return AccountNumber;
			}
			public void setAccountNumber(int accountNumber) {
				AccountNumber = accountNumber;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public int getPanNo() {
				return PanNo;
			}
			public void setPanNo(int panNo) {
				PanNo = panNo;
			}
			public int getAmount() {
				return Amount;
			}
			public void setAmount(int amount) {
				Amount = amount;
			}
			
			
			@Override
			public String toString() {
				return "Option2 [AccountNumber=" + AccountNumber + ", name=" + name + ", address=" + address + ", PanNo="
						+ PanNo + ", Amount=" + Amount + "]\n";
	
		
	} while(ch!= 2);
	
	}
	

}
