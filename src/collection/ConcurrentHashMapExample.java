package collection;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {

		ConcurrentHashMap<String, Integer> cH = new ConcurrentHashMap<>();
		cH.put("Book", 10);
		cH.put("Pen", 20);
		cH.put("Tables", 2);
		cH.put("Chairs", 4);
		cH.putIfAbsent("Table", 3);
		cH.replace("Chairs", 5);
		System.out.println(cH.replace("Tables", 2, 3));

		for (String a : cH.keySet()) {
			System.out.println("The key is: " + a);
			System.out.println("The values is: " + cH.get(a));
		}

		for (Entry<String, Integer> a : cH.entrySet()) {
			System.out.println("The key and value is: " + a);
		}

		System.out.println("Print only values " + cH.values());

		System.out.println(cH);

	}

}
