package sortCollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompareSort {

	public static void main(String[] args) {

		List<EmployeSort> emp = new ArrayList<>();
		emp.add(new EmployeSort("Alice", 30000.00));
		emp.add(new EmployeSort("Bob", 25000.00));
		emp.add(new EmployeSort("Charlie", 35000.50));
		

		// Sort by salary
		emp.sort(new Comparator<EmployeSort>() {
			@Override
			public int compare(EmployeSort e1, EmployeSort e2) {
				return e1.getEmpName().compareTo(e2.getEmpName());
			}
		});

		for (EmployeSort em : emp) {
			System.out.println(em);
		}

		// sort by lambda
		emp.sort(Comparator.comparing(EmployeSort::getEmpName).reversed());
		System.out.println("with lamda");
		for (EmployeSort em : emp) {
			System.out.println(em);
		}

		emp.sort(Comparator.comparing(EmployeSort::getEmpSalary));
		System.out.println("with lamda asc");
		for (EmployeSort em : emp) {
			System.out.println(em);
		}

	}

}
