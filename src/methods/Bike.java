package methods;

import java.util.Scanner;

public class Bike {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the bike number: ");
		String bikeNumber = sc.next();
		System.out.println("Enter the bike owner name: ");
		String bikeOwnerName = sc.next();

		System.out.print("The bike number is " + bikeNumber + " and the owner name is " + bikeOwnerName);

		TrafficChallan cust1 = new TrafficChallan(0, 0, 0, 0);

		System.out.print("The bike number is " + bikeNumber + " and the owner name is " + bikeOwnerName
				+ " the challan is " + cust1.calChallan(1, 1, 1, 1));

		sc.close();
	}

}
