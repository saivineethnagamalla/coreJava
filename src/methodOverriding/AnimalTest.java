package methodOverriding;

public class AnimalTest extends AnimalMethod {

	public AnimalTest(String category, String livesOn) {
		super(category, livesOn);
	}

	public String con() {
		return super.livesOn + super.category;
	}

}
