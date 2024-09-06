package polymorphism;

public class RuntimePolymorphismTest {

	public static void main(String[] args) {
		
		RuntimePolymorphism rP = new RuntimePolymorphism();
		rP.mobile();
		
		RuntimePolymorphismSubClass rPS = new RuntimePolymorphismSubClass();
		rPS.mobile();
		

	}

}
