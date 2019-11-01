
public class IfElseStatments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = (int)(Math.random()*20);
		System.out.println(num);
		if(num >=10) {
			System.out.println(num+" is greater or equal to 10");
		}
		else if(num<10 && num>=5) {
			System.out.println(num+" is betwen than 5 and 10");
		}
			
		else {
			System.out.println(num+" is Less than 5");
		}
		
	}

}
