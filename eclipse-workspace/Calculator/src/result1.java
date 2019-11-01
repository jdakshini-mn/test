
public class result1 {
	public static void main(String[] args) {
		Calculator1 calc2 = new Calculator1();
		int f = calc2.getSum(2, 7);
		System.out.println("The sum is : "+f);
		int k = calc2.getSum(10, 4); 
		System.out.println("The sum is : "+k);
		System.out.println(calc2.getMult(10, 4));
		System.out.println(calc2.getDiv(10, 8));
		System.out.println(calc2.getSub(10, 4));

	}
}
