package inhertance;

public class Bike extends Vechile {

	private String mode;

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Bike() {
		super();
	}

	public Bike(String name, String model, String mode) {
		super(name, model);
		this.mode = mode;
	}

}
