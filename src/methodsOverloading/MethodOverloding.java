package methodsOverloading;

public class MethodOverloding {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		int c = findArea(a, b);
		double d = findArea(a, b, 0.5);
		
		System.out.println("The area of rectangle " +c);
		System.out.println("The area of triangle " +d);

	}

	private static int findArea(int a, int b) {
		return a * b;
	}
	
	public static double findArea(double a, double b) {
		return a * b;
	}

	private static double findArea(int a, int b, double c) {
		return a * b * c;
	}

}
