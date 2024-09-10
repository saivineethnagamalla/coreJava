package collection;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		PriorityQueue<String> q = new PriorityQueue<>();
		q.add("Bike");
		q.add("car");
		q.add("bus");
		q.add("train");

		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println("After removing" + q);
		q.poll();
		System.out.println("After removing one more" + q);

		for (String a : q) {
			System.out.println(a);
		}

	}

}
