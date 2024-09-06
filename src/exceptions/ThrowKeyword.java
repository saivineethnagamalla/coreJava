package exceptions;

public class ThrowKeyword {

	public static void main(String[] args) {

		int a = 20;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			throw new ArithmeticException("the expection is " + e);
		}

	}

}
