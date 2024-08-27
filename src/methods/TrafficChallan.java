package methods;

public class TrafficChallan {

	private int signalJumping;
	private int withoutHelmet;
	private int withoutLicence;
	private int drunkAndDrive;

	public TrafficChallan(int signalJumping, int withoutHelmet, int withoutLicence, int drunkAndDrive) {
		super();
		this.signalJumping = signalJumping;
		this.withoutHelmet = withoutHelmet;
		this.withoutLicence = withoutLicence;
		this.drunkAndDrive = drunkAndDrive;
	}

	public int getSignalJumping() {
		return signalJumping;
	}

	public void setSignalJumping(int signalJumping) {
		this.signalJumping = signalJumping;
	}

	public int getWithoutHelmet() {
		return withoutHelmet;
	}

	public void setWithoutHelmet(int withoutHelmet) {
		this.withoutHelmet = withoutHelmet;
	}

	public int getWithoutLicence() {
		return withoutLicence;
	}

	public void setWithoutLicence(int withoutLicence) {
		this.withoutLicence = withoutLicence;
	}

	public int getDrunkAndDrive() {
		return drunkAndDrive;
	}

	public void setDrunkAndDrive(int drunkAndDrive) {
		this.drunkAndDrive = drunkAndDrive;
	}

	public double calChallan(int signalJumping, int withoutHelmet, int withoutLicence, int drunkAndDrive) {
		double challan = 0.0;
		challan = signalJumping * 200 + withoutHelmet * 500 + withoutLicence * 5000 + drunkAndDrive * 10000;
		return challan;

	}

}
