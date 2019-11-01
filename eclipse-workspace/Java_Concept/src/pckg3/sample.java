package pckg3;

import pckg3.Test;

public class sample {
	public static  void main (String[] args) {
		
		Test obj = new Test();
		//System.out.println(obj.privateVariable); // Not accessible out side of class
		System.out.println(obj.publicVariable);
		System.out.println(obj.protectedVariable);
		System.out.println(obj.defaultVariable);
		
		
	}

}
