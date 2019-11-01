
public class LearningFuntions {

	
	public static int a = 30;
	public static int b = 10;
	
	public static void print() {
		
		System.out.println("Learning Funtions");
		
	}
	//1st way to add method (Input is provided in main class)
	
	public static void addNumbers() {
		
		int c =a+b;
		
		System.out.println("Additional of two numbers : "+c);
	}
	
	//2nd way to add method (Input is provided in main where the function is called)
	//Also know as funtion overloading
	public static void addNumbers(int r, int s) {
		
		int add =r+s;
		
		System.out.println("Additional of two numbers : "+add);
	}
	
	public static void subNumbers() {
		
		int d =a-b;
		
		System.out.println("Substraction of two numbers : "+d);
	}
	
	public static void multiNumbers() {
		
		int e =a*b;
		
		System.out.println("Multiplication of two numbers : "+e);
	}

	
	public static void divNumbers() {
		
		int f =a/b;
		
		System.out.println("Divistion of two numbers : "+f);
	}	
	
	public static void main(String[] args) {
		
		
		
		print();
		addNumbers();
		subNumbers();
		multiNumbers();
		divNumbers();
	
//2nd way to add method (Input is provided in main where the function is called)
		addNumbers(50,60);

	}

}
