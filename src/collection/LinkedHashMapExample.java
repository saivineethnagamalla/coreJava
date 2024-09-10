package collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> lH = new LinkedHashMap<>();
		lH.put("Book", 10);
		lH.put("Pen", 20);
		lH.put("Tables", 2);
		lH.put("Chairs", 4);
		lH.putIfAbsent("Table", 3);
		lH.replace("Chairs", 5);
		System.out.println(lH.replace("Tables", 2, 3));

		for (String a : lH.keySet()) {
			System.out.println("The key is: " + a);
			System.out.println("The values is: " + lH.get(a));
		}
		
		for (Entry<String, Integer> a : lH.entrySet()) {
			System.out.println("The key and value is: " + a);
		}

		System.out.println("Print only values " +lH.values());
		
		System.out.println(lH);

	}

}
