package methodOverriding;

public class AnimalMethod extends Animal {

	public AnimalMethod(String category, String livesOn) {
		super(category, livesOn);
	}

	public String con() {
		return super.livesOn + super.category;
	}

}
