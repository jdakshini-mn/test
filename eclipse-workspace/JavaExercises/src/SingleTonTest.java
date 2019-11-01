import java.util.Stack;

public class SingleTonTest {
	
	private static SingleTonTest instance = new SingleTonTest();
	
	private SingleTonTest() {
		
		System.out.println("Creating Object");
		
	}
	
	public static SingleTonTest getInstance() {
		return instance;
		
	}

}
