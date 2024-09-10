package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<String, String> hM = new HashMap<>();
		hM.put("Book", "ten");
		hM.put("Pen", "twenty");
		hM.put("Tables", "two");
		hM.put("Chairs", "four");
		hM.putIfAbsent("Table", "two");
		System.out.println(hM.get("Book"));

		System.out.println(hM);

		HashMap<String, String> hM1 = new HashMap<>();
		hM1.putAll(hM);
		hM1.put("sketch", "two");
		System.out.println(hM1);

		for (String a : hM1.keySet()) {
			System.out.println("The key is: " + a);
			System.out.println("The values is: " + hM1.get(a));
		}

		for (Entry<String, String> e : hM1.entrySet()) {
			System.out.println("The key and value is: " + e);

		}
	}

}
