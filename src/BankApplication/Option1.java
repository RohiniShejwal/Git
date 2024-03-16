package BankApplication;

import java.util.Scanner;

public class Option1{

public void info() {
	     
		
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
		
	 
		
		System.out.println("Enter your Account number");
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
		
	  }
	

	public static void main(String[] args) {
		
		Option1 op = new Option1();
		op.info();
	
			}
}
