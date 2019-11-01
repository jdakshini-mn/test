package collectionExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExamaple {
	
	//Hashset gives vales in random sequence and only unique values will be given.

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Jimmy");
		set.add("Dakshini");
		set.add("Fun");
		set.add("money");
		set.add("Jimmy");
		
		System.out.println(set);

		for (String var:set) {
			System.out.println(var);
			
		}
		
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			
			String var = (String) itr.next();
			if(var.equals("Fun")) {
				System.out.println(var);
			}
				
			System.out.println(itr.next());
			
			
			
		}
		
	}

}
