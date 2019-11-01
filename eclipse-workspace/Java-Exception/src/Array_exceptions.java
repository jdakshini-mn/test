
public class Array_exceptions {

	public static void main(String[] args) {
		// 
		
		try{ //try should be blocked where there can be exception
			System.out.println("Before Exception");
		int i[] = new int[4];
		
		i[5] = 100;
		}
		catch (Exception e) {  
			System.out.println("Error Occurred");
			e.printStackTrace();
		}

	}

}
