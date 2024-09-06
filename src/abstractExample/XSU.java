package abstractExample;

public class XSU extends Car {

	public XSU(String speed, String seatCapicty) {
		super(speed, seatCapicty);
	}
	
	public String test1() {
		return "test done from XSU";
	}

	@Override
	public String testFromCar() {
		return "test for car but in xsu";
	}

	@Override
	public String testFromCarDisplay() {
		return "lets see how it works";
	}

	@Override
	public String testHowItWorks() {
		return "Hope it is working fine";
	}


}
