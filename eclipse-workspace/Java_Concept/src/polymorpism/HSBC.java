package polymorpism;

public class HSBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

HSBC obj = new HSBC();
		
		System.out.println(obj.getHomeLoanROI());
		

	}
	
public double getHomeLoanROI () {
		
		return 9.5;
		
	}


	public HSBC getObject() {
		
		HSBC obj = new HSBC();
		return obj;
	}
	
public AMEX getObject1() {
		
	AMEX obj = new AMEX();
		return obj;
	}

}
