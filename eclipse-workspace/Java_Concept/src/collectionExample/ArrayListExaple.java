package collectionExample;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExaple {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add("Jimmy");
		list.add("1002.34");
		list.add(20);
		list.add("Dakshini");
		list.add("452.34");		
		
		
		System.out.println(list);
		System.out.print(list.size()+"\t");
		System.out.print("\n");
		
		System.out.print(list.contains("Jimmy"));
		System.out.print("\n");
		
		for (int i=0; i<list.size();i++) {
			
			System.out.print(list.get(i));
			System.out.print("\n");
		}
		
		for (Object var:list) {
			System.out.print(var);
			System.out.print("\n");
			
		}
		
		Iterator itr = list.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}

	}

}
