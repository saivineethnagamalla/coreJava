package methodOverriding;

public class TestingMethodOver {

	public static void main(String[] args) {
		AnimalMethod animalMethod = new AnimalMethod("Mamals", "OnEarth");
		System.out.println(animalMethod.con());
		
		AnimalTest animalTest = new AnimalTest("Mamals", "OnEarth");
		System.out.println(animalTest.con());
	}

}
