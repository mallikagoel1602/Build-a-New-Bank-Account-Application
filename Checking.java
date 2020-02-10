package bankaccountapp;

public class Checking extends Account{
	//List properties specific to a Checking Account
	private int debitCardNumber;
	private int debitCardPIN;
	
	//Constructor to initialize checking account properties
	public Checking(String name,String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * 0.15;
	}
	private void setDebitCard() {
		debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
		debitCardPIN = (int)(Math.random() * Math.pow(10, 4));
		
	}
	//List any methods specific to a Checking Account
	public void showInfo() {
		super.showInfo();
		System.out.println("CHECKING ACCOUNT FEATURES : "
				+ "\nDEBIT CARD NUMBER: "+ debitCardNumber +
				"\nDEBIT CARD PIN: "+ debitCardPIN);
	}

}
