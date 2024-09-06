package exceptions;

public class TestExpception {

	public int divison(int a, int b) {
		int c = 0;
		try {
			c = a / b;
		} catch (Exception e) {
			System.out.println(e);
		} 
//		catch (ArithmeticException e) {
//			System.out.println(e);
//		}

		return c;
	}

}
