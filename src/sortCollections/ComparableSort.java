package sortCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSort {

	public static void main(String[] args) {
		List<EmployeSort> emp = new ArrayList<>();
		emp.add(new EmployeSort("Alice", 30000.00));
		emp.add(new EmployeSort("Bob", 25000.00));
		emp.add(new EmployeSort("Charlie", 35000.50));

		Collections.sort(emp);
		for (EmployeSort em : emp) {
			System.out.println(em);
		}
	}

}
