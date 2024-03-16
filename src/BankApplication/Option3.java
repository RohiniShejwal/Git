package BankApplication;

import java.util.Scanner;

public class Option3 {

	long balance;
	int amount;
	
	public void withdraw() {
		
		Scanner sc = new Scanner(System.in);
		int ch1 = sc.nextInt();
		
		System.out.println("Enter Account number to withdarw money");
		int no3= sc.nextInt();
		
		System.out.println("Enter Amount you want to withdraw");
		int no4 = sc.nextInt();	
	}
	 
	if (balance>=amount) {
		
		balance = balance-amount;
		
		System.out.println("Balance after withdarwl: " + balance);
		} 
		else {
			
			System.out.println("Your balance is less than " + amount + "\t Transaction faild...!! ");
		}
		System.out.println("Withdraw successfull. \n Current balance is=");
      
		

	public static void main(String[] args) {
		
		Option3 op = new Option3();
		op.withdraw();
		
	}
}
}

