package polymorpism;

public class OverloadingExample {

	public static void main(String[] args) {
		/*
		 * 
		 *  
		 */
		int a=10;
		int b=20;
		int c=30;
			
		OverloadingExample obj = new OverloadingExample();
		obj.add(10, 20);
		obj.add(a, b, c);
		obj.doLogin(567777, "12345");
		
		byte  b1=10;
		byte  b2=10;
		obj.add(b1, b2);

		System.out.println("OverloadingExample");
	}
	
	/*public void add(int a, double b) {
		
	}*/
	
	public void add(double a, int b) {
		
	}
	
	public void add(byte a, byte b) {
		
	}
	public void add(int a, int b, int c) {
		
	}
	
	public void doLogin(int mobile, String password)  {
		
	}
	
	public void doLogin(String username, String password)  {
		
	}
	

	

}
