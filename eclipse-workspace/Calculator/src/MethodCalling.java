
public class MethodCalling {

	public static void main(String[] args) {
		MethodCalling m = new MethodCalling();
		System.out.println("before calling go1 method");
		m.go1();
		System.out.println("After calling go1 method");
		
	}
		public void go() {
			System.out.println("Inside go method");
			go2();
			System.out.println("After calling go2 method");
			
		}
		
		public void go1() {
			System.out.println("Inside go1 method");
			go();
			System.out.println("After calling go method");
			
		}
		
		public void go2() {
			System.out.println("Inside go2 method");
		}

	

}
