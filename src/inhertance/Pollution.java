package inhertance;

public class Pollution extends Bike {

	public Pollution(int aQI) {
		super();
		this.aQI = aQI;
	}

	public Pollution(String name, String model, String mode, int aQI) {
		super(name, model, mode);
		this.aQI = aQI;
	}

	private int aQI;

	public int getaQI() {
		return aQI;
	}

	public void setaQI(int aQI) {
		this.aQI = aQI;
	}

}
