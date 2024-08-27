package methods;

public class EbillClass {

	private double currentReading;
	private double pastReading;

	public EbillClass(double currentReadding, double pastReading) {
		super();
		this.currentReading = currentReadding;
		this.pastReading = pastReading;
	}

	public double getCurrentReading() {
		return currentReading;
	}

	public void setCurrentReading(double currentReading) {
		this.currentReading = currentReading;
	}

	public double getPastReading() {
		return pastReading;
	}

	public void setPastReading(double pastReading) {
		this.pastReading = pastReading;
	}

	public double units() {
		return currentReading - pastReading;
	}

}
