package BankApplication;

import java.util.Scanner;

public class BankApp extends Bank1{
	

	public static void main(String arg[]) { 
		
        Scanner sc = new Scanner(System.in);      
         
        do {  
        	System.out.println("********Welcome to Bank********");
    		
    		System.out.println("Press 1 for Account Creation");
    		
    		System.out.println("Press 2 for view Account");
    		
    		System.out.println("Press 3 for withdraw Money");
    		
    		System.out.println("Press 4 for Deposite Money");
    		
    		System.out.println("Press 5 for update Account");
    		
    		System.out.println("Press 6 for EXIT");
    		
    		System.out.println("\nEnter your choice");
    	
    		 int ch = sc.nextInt();
    		  
    		 ch = 0;
    		 switch (ch){  
                    
    		 case 1:  
    			 
    			 
    			@Override
    			public String toString() {
    				return "BankApp [AccountNumber=" + AccountNumber + ", name=" + name + ", address=" + address + ", PanNo="
    						+ PanNo + ", balance=" + balance + ", amount=" + amount + "]";
    			}
    			
                break;
    		 
    		 
    			       
             Case2:   System.out.print("Enter Account No : ");  
                      

					long AccountNumber = sc.nextLong(); 
                       
                       System.out.println("Enter the amount you want to withdrawl: ");  
                       
                       long amount = sc.next();
                       
                       if (balance >= amount) { 
                      
                       	  balance = balance - amount; 
                       	
                           System.out.println("Balance after withdrawal: " + balance);  
                           
                       } else {
                       	
                       
                           System.out.println("Your balance is less than " + amount + "\tTransaction failed...!!" );  
                       }  
 			}
 			
                     
    		            break;
        
              Case3 :  System.out.print("Enter Account number : ");  
                       
                       long AcnNo = sc.nextLong();  
                          
                       System.out.println("Enter the amount you want to deposit: ");  
                       long amount = sc.nextlong();  
                       balance = balance + amount; 
              
                       
                        break;  
                          
         
        }while(ch != 3);
         
    		 }


	


	        }
		

