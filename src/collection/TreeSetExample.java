package collection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(50);
		ts.add(30);
		ts.add(50);
		ts.add(30);
		ts.add(40);
		ts.add(90);
		ts.remove(50);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.floor(60));
		System.out.println(ts.size());
		System.out.println(ts.higher(50));
		System.out.println(ts);
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
		
		
	}

}
