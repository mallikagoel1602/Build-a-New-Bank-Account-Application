package bankaccountapp;

public interface IBaseRate {
	//Write a method that returns a Base Rate
	
	default double getBaseRate() {
		return 2.5;
	}

}
