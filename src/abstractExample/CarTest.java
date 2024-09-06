package abstractExample;

public class CarTest {

	public static void main(String[] args) {
		
		XSU xsu = new XSU("3x0", "5");
		System.out.println(xsu.test());
		System.out.println(xsu.test1());
		System.out.println(xsu.testFromCar());
		System.out.println(xsu.testFromCarDisplay());
		System.out.println(xsu.testHowItWorks());
		System.out.println(xsu.add());
	}
}
