package BankApplication;

import java.util.Scanner;

public class Bank1 {
	
     String AccountNumber;
     String name;
     String address;
     int PanNo;
     long balance;
     long amount;
    
	Scanner sc = new Scanner(System.in); 
	
	//method to create new account
	
	public void CreateAcnt() {
		
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

      //method to display account details  
        public void showAccount() {  
              
            System.out.println("Account number: " + AccountNumber);  
            System.out.println("Account holder Name: " + name);  
            System.out.println("Account holder's Address.: " + address);
            System.out.println("Pan number: " + PanNo);
            System.out.println("Balance: " + balance);  
        }       
       //method to deposit money 
            
            public void deposit() {  
                
                System.out.println("Enter the amount you want to deposit: ");  
                long amount = sc.nextLong();  
                balance = balance + amount;  
            }  
       
        //method to withdraw money 
            
            public void withdrawal() {  
                 
                System.out.println("Enter the amount you want to withdrawl: ");  
                
                amount = sc.nextLong();
                
                if (balance >= amount) { 
               
                	balance = balance - amount; 
                	
                    System.out.println("Balance after withdrawal: " + balance);  
                    
                } else {
                	
                
                    System.out.println("Your balance is less than " + amount + "\tTransaction failed...!!" );  
                }  
            }  

        }
	


        