package coreJavaMyra;

public class BikeSuper extends VechileThis {

	private String mode;

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public BikeSuper() {
		super();
	}

	public BikeSuper(String name, String model, String mode) {
		super(name, model);
		this.mode = mode;
		super.vechicalCon();
		String modelNew = super.model;
	}

}
