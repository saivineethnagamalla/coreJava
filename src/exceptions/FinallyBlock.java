package exceptions;

public class FinallyBlock {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("the expection is " + e);
		}finally {
			System.out.println("Hi, Good Morning");
		}

		

	}

}
