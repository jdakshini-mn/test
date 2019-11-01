
public class finally_block {

	public static void main(String[] args) {
		// 
		
		final int j=100; //Final will not allow to change value
			
		
		try {
			//DB Connection
			//Execution some query
			//Validating the data with Web-site.
			//Closing Connection
			int i[] = new int[4];
			
			i[5] = 100;
			System.out.println("Close DB Connection");
			
		}
		catch (Throwable e){
			
			System.out.println("Execption Occurred");
		}
		finally {//finally Block will always executed. Finally is used in try and Catch blocked.
			
			System.out.println("Closing DB connection");
		}

	}

}
//Difference between Final and Finally, final will not allow to change value for variable and Finally block will always executed.
