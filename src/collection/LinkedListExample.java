package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<Integer> lL = new LinkedList<>();
		lL.add(10);
		lL.add(20);
		lL.add(30);
		lL.addFirst(01);
		lL.addLast(40);
		System.out.println(lL.removeFirstOccurrence(10));
		lL.push(15);
		System.out.println(lL);
		lL.pop();
		System.out.println(lL.peek());
		System.out.println(lL.peekFirst());
		System.out.println(lL.peekLast());
		System.out.println(lL.poll());
		System.out.println(lL.pollFirst());
		System.out.println(lL.pollLast());
		System.out.println(lL);
		
		
		System.out.println("Final elemetes in list is :");
		Iterator<Integer> iT = lL.listIterator();
		
		while(iT.hasNext()) {
			System.out.println(iT.next());
		}
		
		
		
		

	}

}
