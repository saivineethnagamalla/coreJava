package inhertance;

public class Car extends Vechile {

	private int seatCapcity;
	

	public Car(String no, String model) {
		super(no, model);
	}

	public Car(String no, String model, int seatCapcity) {
		super(no, model);
		this.seatCapcity = seatCapcity;
	}

	public String vechicalFullName() {
		return vechicalCon();
	}

	public double speedLimt() {
		return 200;
	}

	public int getSeatCapcity() {
		return seatCapcity;
	}

	public void setSeatCapcity(int seatCapcity) {
		this.seatCapcity = seatCapcity;
	}

}
