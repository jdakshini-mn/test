package encapsulation;

public class Bank {
	
	/*
	 * Encapsulation - data binding	/ wrapping data and methods in a single unit
	 * data hiding - hiding the data from outside world (other classes-They are not directly access)
	 * abstraction - force calling those variables using method
	 * 
	 */

	private int accountNo=123456;
	private int pinNo = 1234;
	public double balanceamount = 1004000;
	
	public double getBalanceamount() {
		return balanceamount;
	}

	public void setBalanceamount(double balanceamount) {
		this.balanceamount = balanceamount;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}

	public void withdrawAmount (int accNo, int pin, int amount) {
		if(accNo==accountNo && pin==pinNo) {
		
			if(amount<=balanceamount) {
				
				balanceamount = balanceamount-amount;
				
				System.out.println("Amount Withdrwal is "+amount);
			}else {
				
				System.out.println("Insuffient Balance");
			}
		
	}else { 
		
		System.out.println("Invalid credential");
	}
	
	}
	
	public void updatePin(int accNo, int oldPin, int newPin) {
		
		if(accNo==accountNo && oldPin==pinNo) {
			
			pinNo=newPin;
			System.out.println("Pin Updated sucessfully");
			
		}else {
			
			System.out.println("Invalid credentials");
			
		}
	}
	
	public double depositAmount (int accNo, int pinNo, double amount) {
		if(accNo==accountNo && pinNo==1234) {
			balanceamount = balanceamount+amount;
					return balanceamount;
		}else {
			System.out.println("Invalid credentials");
			return balanceamount;
		}
	}
	
}

