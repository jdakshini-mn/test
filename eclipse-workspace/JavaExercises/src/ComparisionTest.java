
public class ComparisionTest {

	public static void main(String[] args) {
		// "==" Compare's Object Reference is same or not and address is same or not 
		// ".equal" contain is same or not	
		
		String name1 = "JImm";
		String name2 = "JImm";
		
		String name_1 = new String("jimmy");
		String name_2 = new String("jimmy");
		
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
		
		System.out.println(name_1==name_2);
		System.out.println(name_1.equals(name_2));
		
		System.out.println(name_1.hashCode());
		System.out.println(name_2.hashCode());
		
		
		SingleTonTest s1 = SingleTonTest.getInstance();
		SingleTonTest s2 = SingleTonTest.getInstance();
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
