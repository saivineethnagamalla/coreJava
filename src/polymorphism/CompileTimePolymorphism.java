package polymorphism;

public class CompileTimePolymorphism {

	public int mutli(int a, int b) {
		return a * b;
	}

	public int mutli(int a, int b, int c) {
		return a * b * c;
	}

	public double mutli(double a, double b) {
		return a * b;
	}

	public double mutli(double a, double b, double c) {
		return a * b * c;
	}

	public static void main(String[] args) {

		CompileTimePolymorphism cT = new CompileTimePolymorphism();

		System.out.println(cT.mutli(10, 20));

		System.out.println(cT.mutli(10, 20, 30));

		System.out.println(cT.mutli(10.50, 20.50));

		System.out.println(cT.mutli(10.25, 20.45, 30.06));

	}

}
