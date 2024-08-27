package methodOverriding;

import java.util.*;

public class PersonTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name : ");
		String firstName = sc.next();

		System.out.println("Enter the last name : ");
		String lastName = sc.next();

		System.out.println("Enter the gender : ");
		String gender = sc.next();

		Person p1 = new Person(firstName, lastName, gender);

		PersonReverse p2 = new PersonReverse(firstName, lastName, gender);

		System.out.println("The full name of the person is " + p1.con());
		System.out.println("The full name of the person is " + p2.con());

		System.out.println("The full deatils of the person is " + p2.toString());
		sc.close();
	}
}
