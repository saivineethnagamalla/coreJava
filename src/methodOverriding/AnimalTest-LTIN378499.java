package methodOverriding;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal("Mamals", "OnEarth");
		System.out.println(animal.con());
		
		AnimalMethod animalMethod = new AnimalMethod("Mamals", "OnEarth");
		System.out.println(animalMethod.con());
	}

}
