package pckg4;

import pckg3.Test;

public class sample2 {

	public static void main(String[] args) {
		// inheritance - One class object will inherit other class properties
		//extents, implements
		
		
		Test obj = new Test();
		//System.out.println(obj.privateVariable); // Not accessible out side of Package
		System.out.println(obj.publicVariable);
		//System.out.println(obj.protectedVariable);// Not accessible out side of Package
		//System.out.println(obj.defaultVariable);// Not accessible out side of Package

	}

}
