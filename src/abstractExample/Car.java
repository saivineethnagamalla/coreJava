package abstractExample;

public abstract class Car {

	private String model;
	private String seatCapicty;
	
	
	public Car(String model, String seatCapicty) {
		super();
		this.model = model;
		this.seatCapicty = seatCapicty;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSeatCapicty() {
		return seatCapicty;
	}

	public void setSeatCapicty(String seatCapicty) {
		this.seatCapicty = seatCapicty;
	}

	public String test() {
		return "test done from car";
	}
	
	public int add() {
		return 100+500;
	}
	
	public abstract String testFromCar();
	
	public abstract String testFromCarDisplay();
	
	public abstract String testHowItWorks();
	
}
