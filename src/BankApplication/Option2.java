package BankApplication;

public class Option2{

	int AccountNumber;
	String name;
	String address;
	int PanNo;
	int Amount;
	
	
	
	public int getAccountNumber() {
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
		
		
	}
	public static void main(String[] args) {
		
		Option2 op = new Option2();
		System.out.println("****By using ToString Method\n");
		op.AccountNumber = 12345678;
		op.name = "Rohini" ;
		op.address = "Nashik";
		op.PanNo = 98765;
		op.Amount = 20000;
		//System.out.println(op.toString());
		
		
		System.out.println(op);
		System.out.println("****By using Getter Setter Method\n");
		System.out.println(op.getAccountNumber());
		System.out.println(op.getName());
		System.out.println(op.getAddress());
		System.out.println(op.getPanNo());
		System.out.println(op.getAmount());
	

	}
	
	
}
