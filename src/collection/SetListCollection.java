package collection;

import java.util.HashSet;

public class SetListCollection {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("one");
		set.add("two");
		set.add("one");
		set.add("two");
		set.add("three");
		
		System.out.println(set);
	

	}

}
