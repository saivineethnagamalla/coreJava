package interfaceExample;

public interface Mobile {

	public String modelYear();

	default void test() {
		System.out.println("testing");
	}

	default void test1() {
		System.out.println("testing for default method 2");
	}
	
	static void test2() {
		System.out.println("testing from static ");
	}

}
