package exceptions;

public class ThrowsCheck {

	public int division(int a, int b) {
		int c = 0;
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			System.err.println(e);
		}

		return c;
	}
}
