package exceptions;

public class ThrowsKeywords {

	public static int division(int a, int b) throws ArithmeticException {
		int c = a / b;
		return c;
	}
	
	public static void main(String[] args) {
		division(10, 0);
	}

}
