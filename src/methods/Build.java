package methods;

public class Build {

	private double length;
	private double breath;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreath() {
		return breath;
	}

	public void setBreath(double breath) {
		this.breath = breath;
	}

	public Build(double length, double breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

	public double findSqft(double length, double breath) {
		return length * breath;
	}

	public double workingDays(double sqft) {
		return sqft / 20;
	}

	public double costOfCons(double sqft) {
		return sqft * 3200;
	}

	public double costOfMat(double sqft) {
		return sqft * 2000;
	}

	public double totalCost(double costofConst, double costofMaterial) {
		return costofConst + costofMaterial;
	}

	public double findTotalCost(double sqft) {
		return (costOfCons(sqft) + costOfMat(sqft));
	}

}
