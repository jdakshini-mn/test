package pckg4;

import pckg3.Test;

public class sample3 extends Test{

	public static void main(String[] args) {
		// inheritance - One class object will inherit other class properties
		//extents, implements 
		// Class A wants to access property of Class B
		
		
		sample3 obj = new sample3(); //Test should be replaced with Smaple3 to get access to protectedVariable
		//System.out.println(obj.privateVariable); // Not accessible out side of Package
		System.out.println(obj.publicVariable);
		System.out.println(obj.protectedVariable);// able to accessible out side of Package using inheritance
		//System.out.println(obj.defaultVariable);// Not accessible out side of Package

	}

}
