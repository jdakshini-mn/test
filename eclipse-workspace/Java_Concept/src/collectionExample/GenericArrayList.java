package collectionExample;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(null);
		
		int i = list.get(0);
		System.out.println(i);
		

	}

}
