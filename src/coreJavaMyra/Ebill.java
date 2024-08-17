package coreJavaMyra;

import java.util.Scanner;

public class Ebill {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the current reading");
		Double currentReading = sc.nextDouble();
		System.out.println("Enter the past reading");
		Double pastReading = sc.nextDouble();

		Double units = findUnits(currentReading, pastReading);
		System.out.println("The total units " + units);

		Double eBill = calc(units);
		System.out.println("The ebill for this month is : " + eBill);

		sc.close();
	}

	private static Double calc(Double units) {

		if (units <= 100) {
			return 0.0;
		} else if (units <= 200) {
			return (units - 100) * 2;
		} else if (units > 200) {
			return (units - 100) * 3.5;
		}

		return 0.0;
	}

	private static Double findUnits(Double currentReading, Double pastReading) {
		return currentReading - pastReading;
	}

}
