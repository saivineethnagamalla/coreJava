package methodsOverloading;

public class FindArea {
	// find area of square
	public static double findArea(double sides) {
		return sides * sides;

	}

	// find area of rectangle
	public static double findArea(double length, double breath) {
		return length * breath;
	}

	// find area of circle
	public static double findArea(float radius) {
		return Math.PI * radius * radius;
	}

	// find area of cube
	public static double findArea(int sides) {
		return 6 * sides * sides;
	}

	// find are of cubiod
	public static double findArea(double length, double width, double heighth) {
		return 2 * (length * width + width * heighth + heighth * length);
	}

	// find area of pallagoram
	public static double findArea(float base, float height) {
		return base * height;

	}

	// find area of hexagon
	public static double findArea(long sides) {
		return sides * sides * Math.sqrt(3) * 3 / 2;

	}

	// find perimeter of square
	public static double findPerimeter(double sides) {
		return 4 * sides;

	}

	// find perimeter of rectangle
	public static double findPerimeter(double length, double breath) {
		return 2 * (length + breath);
	}

	// find perimeter of circle
	public static double findPerimeter(float radius) {
		return Math.PI * 2 * radius;
	}

	// find perimeter of cube
	public static double findPerimeter(int sides) {
		return 12 * sides;
	}

	// find perimeter of cubiod
	public static double findPerimeter(double length, double width, double heighth) {
		return 2 * (length + width + heighth);
	}

	// find perimeter of pallagoram
	public static double findPerimeter(float base, float height) {
		return 2 * (base + height);

	}

	// find perimeter of hexagon
	public static double findPerimeter(long sides) {
		return sides * 6;

	}

	public static void main(String[] args) {

		System.out.println("The area square " + findArea(10.12));
		System.out.println("The area rectangle " + findArea(10.12, 15.12));
		System.out.println("The area circle " + findArea(10f));
		System.out.println("The area cube " + findArea(10));
		System.out.println("The area cubiod " + findArea(10, 15, 20));
		System.out.println("The area pallagoram " + findArea(10f, 15f));
		System.out.println("The area hexagon " + findArea(10L));

		System.out.println("The perimeter square " + findPerimeter(10.12));
		System.out.println("The perimeter rectangle " + findPerimeter(10.12, 15.12));
		System.out.println("The perimeter circle " + findPerimeter(10f));
		System.out.println("The perimeter cube " + findPerimeter(10));
		System.out.println("The perimeter cubiod " + findPerimeter(10, 15, 20));
		System.out.println("The perimeter pallagoram " + findPerimeter(10f, 15f));
		System.out.println("The perimeter hexagon " + findPerimeter(10L));
	}

}
