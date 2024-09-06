package exceptions;

public class ThrowsTest {

	public int divisionOf3() {

		ThrowsCheck tw = new ThrowsCheck();
		tw.division(10, 0);

		return 1;

	}

}
