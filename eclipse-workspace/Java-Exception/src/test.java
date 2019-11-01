	
public class test {

	public static void main(String[] args) {
		
		System.out.println("Before try block");
		try{ //try should be blocked where there can be exception
		System.out.println("Before Exception");
		
		System.out.println("Before Divide");
		int devide = 10/0;
		System.out.println("After Divide");
		
		}
		// Can be used Exception or Throwable (Throwable is super class for Exception and Error
		catch (Exception e) {  
		System.out.println("Error Occurred");
		System.out.println("Exception message is: "+e.getMessage());
		e.printStackTrace();
		System.out.println(e.getCause());
		System.out.println(e.getClass());
		System.out.println(e.hashCode());
		System.out.println(e.initCause(null));
		System.out.println(e.getSuppressed());
		System.out.println(e.getLocalizedMessage());
		System.out.println(e.fillInStackTrace());
		

	}System.out.println("End"); 
		}
	

}
