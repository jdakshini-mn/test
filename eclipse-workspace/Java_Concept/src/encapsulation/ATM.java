package encapsulation;

public class ATM {

	public static void main(String[] args) {
		// 
		
		Bank obj = new Bank();
		//obj.pinNo=1234;
		//obj.accountNo=654321;
		//obj.withdrawAmount(123456, 1234, 2000);
		//obj.updatePin(123456, 1234, 4321);
		
		//obj.withdrawAmount(123456, 1234, 2000);
		obj.depositAmount(123456, 1234, 50000);
		

	}

}
