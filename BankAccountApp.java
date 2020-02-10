package bankaccountapp;

import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		//Read a CSV file then create new accounts based on that data
		
		String file = "⁩NewBankAccounts.csv"; 
		/*Checking chkacc1 = new Checking("JOE WILSON", "321456789", 1500);
		
		Savings savacc1 = new Savings("Richie Rich", "456775789", 2500);
		chkacc1.showInfo();
		System.out.println("**********************");
		savacc1.showInfo();
		
		savacc1.compound();*/
				
		//Read a CSV File then create new accounts based on that data
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolders) {
					System.out.println("NEW ACCOUNT");
					System.out.println(accountHolder[0]);
					System.out.println(accountHolder[1]);
					System.out.println(accountHolder[2]);
					System.out.println(accountHolder[3]);
					
		}
	}

}
