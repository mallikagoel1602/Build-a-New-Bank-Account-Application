package bankaccountapp;

public class Savings extends Account {
	//List properties specific to a Savings Account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	//Constructor to initialize settings for the Savings Account
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		
		setSafetyDepositBox();
		
		
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID  = (int)(Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,  4));
	}
	
	
	//List any methods specific to Savings Account
	public void showInfo() {
		super.showInfo();
		System.out.println("YOUR SAVINGS ACCOUNT FEATURES: "
				+ "\nSAFETY DEPOSIT BOX ID: "+ safetyDepositBoxID 
				+ "\nSAFETY DEPOSIT BOX KEY: "+ safetyDepositBoxKey);
	}
	

}
