public class Account{

	private String name;
	private String acNumber;
	private double acBalance;

	Account(String userName, String accountNumber, double balance){
		name = userName;
		acNumber = accountNumber;
		acBalance = balance;
	}

	public String toString(){
		return String.format("Name is \t: %s\nAccount Number is \t\t: %s\nBalance is \t\t: $%.2f",name,acNumber,acBalance);
	}

	public String setName(String newName){
		name = newName;
		return name;
	}

	public void toCredit(Double depositAmount){
		acBalance = acBalance + depositAmount;
	}

	public void toDebit(Double withdrawalAmount){
		acBalance = acBalance - withdrawalAmount;
	}

}
