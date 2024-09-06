package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0;

		System.out.println("Enter the 1st number :");
		try {
			a = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e);
		}

		System.out.println("Enter the 2nd number :");
		int b = sc.nextInt();

		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}

		sc.close();

	}

}
