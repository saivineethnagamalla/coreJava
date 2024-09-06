package interfaceExample;

public interface Crowd {
	
	public String howMany();
	
	public String location();
	
	default void Test() {
		System.out.println("Testing from default");
	}
	
	default void Test1() {
		System.out.println("Testing from default method 2");
	}
	
	public static void inter() {
		System.out.println("Testing from static method");
	}
	

}
