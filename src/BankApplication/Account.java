
package BankApplication;

import java.util.Scanner;

public class Account implements Bank {
	
	String AccountNumber;
	String Name;
	String Address;
	int PanNo;
	long Balance = 50000;
	long Amount;

    Scanner sc = new Scanner(System.in); 
    
    public void Currentbalance(long Balance)
    {
        System.out.println("Current Balance : " + Balance);
        System.out.println();
    }
	
	//method to create new account

	public void Account() {
		
		System.out.println("Enter your Account number");
        AccountNumber = sc.next();

        System.out.println("Enter your name");
        String s = sc.next();

        System.out.println("Enter your address");
        String sh = sc.next();

        System.out.println("Enter your PanNo");
        int no1 = sc.nextInt();

        System.out.println("Enter Amount you want to deposite");
        int no2 = sc.nextInt();

        System.out.println("Account created successfully");
        
        System.out.println("Current Balance : " + Balance);
        System.out.println();

	}

	//method to view details
	
	public void view() {
	
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getPanNo() {
		return PanNo;
	}

	public void setPanNo(int panNo) {
		PanNo = panNo;
	}

	public long getAmount() {
		return Amount;
	}

	public void setAmount(long amount) {
		Amount = amount;
	}

	
	@Override
	public String toString() {
		return "Account [AccountNumber=" + AccountNumber + ", Name=" + Name + ", Address=" + Address + ", PanNo="
				+ PanNo + ", Amount=" + Amount + "]";
	}

	public void withdraw() {
		
		
		System.out.println("\nCurrent Balance : " + Balance);
        System.out.println();
		
		System.out.println("Enter the amount you want to withdraw: ");  
        
        Amount = sc.nextLong();
        
        if (Balance >= Amount) { 
       
        	Balance = Balance - Amount; 
        
            System.out.println("Please collect your Money: " + Amount);  
            
            System.out.println("\nCurrent Balance : " + Balance);
            System.out.println();

            
        } else 
        {
           System.out.println("Your Balance is less than " + Amount + "\tTransaction failed...!!\n" );  
        }   
    }  

	
	public void deposit() {
		
		System.out.println("Enter Account number");
		String AccountNumber = sc.next();
		System.out.println("Enter the amount you want to deposit: ");  
        long Amount = sc.nextLong();  
        Balance = Balance+Amount;
		System.out.println("Your Amount deposited successfully\n");
		Currentbalance(Balance);
		//System.out.println("\nCurrent Balance : " + Balance);
        //System.out.println();

	}
	
	public void update() {
		
		System.out.println("press 1 to update Name\n");
		System.out.println("press 2 to update Address\n");
		System.out.println("press 3 to update PanNo\n");
		System.out.println("Enter your choice");

		int ch1 = sc.nextInt();
		
		switch(ch1) {
		
		case 1:System.out.println("Enter a new Name");
		       String name = sc.next();
		       System.out.println("\nName update successfully \n" +name);
		       break;
		       
		case 2:System.out.println("Enter new Address");
	           String address = sc.next();
	           System.out.println("Address update successfully " +address);
	           break;
	           
		case 3:System.out.println("Enter a new Name");
	           int PanNo = sc.nextInt();
	           System.out.println("PanNo update successfully " +PanNo);
		}
		
	}

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);   
		int ch=0;
        
        do {  
        	System.out.println("\n********Welcome to Bank********\n");
    		
    		System.out.println("Press 1 for Account Creation");
    		
    		System.out.println("Press 2 for view Account");
    		
    		System.out.println("Press 3 for withdraw Money");
    		
    		System.out.println("Press 4 for Deposite Money");
    		
    		System.out.println("Press 5 for update Account");
    		
    		System.out.println("Press 6 for EXIT");
    		
    		System.out.println("\nEnter your choice");
    	
    		 ch = sc.nextInt();
    		  
    		 //ch = 0;
    		 
    		 switch (ch) {
    		 
    		 case 1: Account ac = new Account();
    		         ac.Account();
    		         break;
    			 
    		 case 2: //Account ac2 = new Account();
    			     System.out.println("\n***By using ToString Method***\n");
    			     ac.setAccountNumber(AccountNumber); //= "AccountNumber - 12345678";
    			     ac2.Name= "Name - Rohini" ;
    			     ac2.Address= "Address -Nashik";
    			     ac2.PanNo= 98765;
    			     ac2.Amount= 20000;
    			     //System.out.println(ac);
//    			*+/															/
    			
    			     System.out.println(ac2);
    			     System.out.println("\n***By using Getter Setter Method***\n");
    			     System.out.println(no.getAccountNumber());
    			     System.out.println(ac2.getName());
    			     System.out.println(ac2.getAddress());
    			     System.out.println(ac2.getPanNo());
    			     System.out.println(ac2.getAmount());
    		
    			     break;
    			     
    		 case 3: Account ac3 = new Account();
    		         ac3.withdraw();
    		         break;
    		        
    			 
    		 case 4: Account ac4 = new Account();
    		         ac4.deposit();
    		         break;
    			 
    		 case 5: Account ac5 = new Account();
    		         ac5.update();
    		         break;
    			 
    		 case 6: System.out.println("Exit");
    		         break;
    			 
    		 //default :System.out.println("Invalide input");
    		
        }
    		 //.
     }while(ch!=6);    ./
  }}
 