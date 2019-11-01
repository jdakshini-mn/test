package polymorpism;

public class RBI {
	
	/*
	 * Method name is same but different signature
	 *  "(String bankName, int amount)" is known as Signature
	 *  Change in sequence of Signature is allowed in overloading method
	 *   
	 *  
	 */

	
	public void getHomeLoanROI (String bankName, int amount) {
		
	}

	public void getHomeLoanROI (int amount, String bankName) {
		
	}
	
	public double getHomeLoanROI () {
		
		return 8.5;
		
	}
	
public double getCarLoanROI () {
		
		return 9.5;
		
	}

public RBI getObject() {
	
	RBI obj = new RBI();
	return obj;
}
	
}
