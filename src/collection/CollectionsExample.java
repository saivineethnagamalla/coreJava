package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {

		String name = "SaiVineeth";

		ArrayList<String> al = new ArrayList<>();
		al.add(name);
		al.add(name + " new");

		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);

		char[] a = name.toCharArray();

		List<Character> a1 = new ArrayList<>();
		for (char ch : a) {
			a1.add(ch);
		}
		System.out.println("Before : " + a1);

		Collections.reverse(a1);

		System.out.println("After : " + a1);

	}

}
