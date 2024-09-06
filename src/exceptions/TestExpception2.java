package exceptions;

public class TestExpception2 {

	public static void main(String[] args) {
		TestExpception tE = new TestExpception();
		try {
			tE.divison(10, 0);
		} catch (Exception a) {
			System.out.println("the test");
			System.out.println(a);

		}

	}

}
