package exceptions;

public class TryCatch {

	public static void main(String[] args) {

		int a = 20;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("the expection is " +e);
		}
		
		
		
		System.out.println(10/5);

	}

}
