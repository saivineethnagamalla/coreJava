package collection;

import java.util.HashMap;

public class MapCollection {

	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<>();
		map.put("one", "1");
		map.put("one", "1");
		map.put("one", "11");
		map.put("two", "2");
		map.put("two", "22");
		map.remove("two");
		
		System.out.println(map);
		System.out.println(map.get("one"));
	

	}

}
