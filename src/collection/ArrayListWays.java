package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListWays {

	public static void main(String[] args) {

		// 1
		System.out.println("The 1st way");
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(1);
		a1.add(10);
		a1.add(null);
		a1.add(15);
		a1.add(null);

		a1.forEach(System.out::println);

		// 2
		System.out.println("The second way");
		Collection<Integer> c1 = new ArrayList<>();

		ArrayList<Integer> a2 = new ArrayList<>(c1);

		a2.add(20);
		a2.add(30);
		a2.add(30);

		Iterator<Integer> i = a2.iterator();

		while (i.hasNext()) {
			System.out.println("the next elemet is : " + i.next());
		}

		// 3
		System.out.println("The third way");
		ArrayList<Integer> a3 = new ArrayList<>(1);
		a3.add(100);
		a3.add(200);
		a3.add(300);
		a3.add(400);
		System.out.println(a3);
		
		//4 
		System.out.println("The forth way");
		List<Integer> a4 = Arrays.asList(1,2,3,4);
		System.out.println(a4);
		
		

	}

}
