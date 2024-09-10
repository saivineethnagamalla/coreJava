package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<Integer> hS = new HashSet<>();
		hS.add(10);
		hS.add(20);
		hS.add(30);
		hS.add(10);
		hS.add(20);
		hS.add(30);
		System.out.println(hS);
		
		Iterator<Integer> iT = hS.iterator();
		
		while(iT.hasNext()) {
			System.out.println(iT.next());
		}

	}

}
