package collection;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("one");
		list.add("two");
		list.remove(0);
		list.remove("one");
		System.out.println(list.get(1));
		
		System.out.println(list);
	

	}

}
