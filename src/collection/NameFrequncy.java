package collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameFrequncy {

	public static void main(String[] args) {

		List<Character> ch = Arrays.asList('s', 'a', 'i', 'v', 'i', 'n', 'e', 'e', 't', 'h');
		Map<Character, Integer> hM = new HashMap<>();
		for (Character c : ch) {
			hM.put(c, hM.getOrDefault(c, 0) + 1);
		}

		System.out.println("In my name frquency is : " + hM);

		for (char a = 'a'; a <= 'z'; a++) {

			hM.put(a, hM.getOrDefault(a, 0));
		}
		System.out.println("In all : " + hM);
	}

}
