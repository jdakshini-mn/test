package reflectionExample;

import java.lang.reflect.Method;

public class Home {

	public static void main(String[] args) {
		
		Test1 t = new Test1();
		Class clazz = t.getClass();
		System.out.println(clazz.getName());
		
		/*Method[] arrayOfMethods clazz.getDeclaredMethods()
		System.out.println(arrayOfMethods.length);
		
		System.out.println((arrayOfMethods.length));*/
	}

}
