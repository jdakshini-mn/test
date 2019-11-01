
public class BreakContinue {
	
	public void go() {
	 System.out.print("Before Break");
	 
	 //break;
	 
	 System.out.print(", After Break");
	}

	public static void main(String[] args) {
		
		//break statement will break the loop
		//continue will continue to next cycle (to skip iteration of loop)
		
		/*BreakContinue b = new BreakContinue();
		
		b.go();*/
		
	
		for(int i=0; i<10; i++) {
			if(i==5)
				break;
			
			System.out.println("Value of i is "+ i);
		}
			
		for(int k=0; k<10; k++) {
				if(k>=5 && k<=7)
					continue;
				
				System.out.println("Value of k is "+ k);
		
		}

	}

}
