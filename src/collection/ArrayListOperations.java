package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(15);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.remove(0);
		a1.add(0, 50);
		a1.set(1, 60);
		a1.add(5, 80);
		a1.add(70);
		if (a1.contains(80)) {
			System.out.println("it is found");

		}

		System.out.println(a1.hashCode());

		System.out.println(a1.indexOf(70));

		System.out.println(a1.size());

		System.out.println(a1.isEmpty());

		ArrayList<Integer> a2 = new ArrayList<>();

		a2.addAll(a1);
		System.out.println(a2);

		Iterator<Integer> iT = a2.iterator();

		while (iT.hasNext())
			System.out.println(iT.next() + 100);

		if (a2.contains(500))
			System.out.println("500 is present");

		a2.clear();
		System.out.println(a2);
		System.out.println(a2.size());
		System.out.println(a2.isEmpty());

		Integer a = null;
		int b = 0;
		System.out.println(a);
		System.out.println(b);

	}

}
