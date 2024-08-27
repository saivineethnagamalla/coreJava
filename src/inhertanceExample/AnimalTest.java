package inhertanceExample;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal1 = new Animal();
		String name = animal1.fullName("Dog", "Mammals");
		System.out.println(name);

		Dog dog1 = new Dog();
		System.out.println(dog1.fullName("Dog", "Mammals"));
		System.out.println(dog1.barking());

	}

}
