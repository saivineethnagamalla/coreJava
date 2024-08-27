package methods;

public class Traffic {

	private boolean signalJumping;
	private boolean withoutHelmet;
	private boolean withoutLicence;
	private boolean drunkAndDrive;

	public boolean isSignalJumping() {
		return signalJumping;
	}

	public void setSignalJumping(boolean signalJumping) {
		this.signalJumping = signalJumping;
	}

	public boolean isWithoutHelmet() {
		return withoutHelmet;
	}

	public void setWithoutHelmet(boolean withoutHelmet) {
		this.withoutHelmet = withoutHelmet;
	}

	public boolean isWithoutLicence() {
		return withoutLicence;
	}

	public void setWithoutLicence(boolean withoutLicence) {
		this.withoutLicence = withoutLicence;
	}

	public boolean isDrunkAndDrive() {
		return drunkAndDrive;
	}

	public void setDrunkAndDrive(boolean drunkAndDrive) {
		this.drunkAndDrive = drunkAndDrive;
	}

	public Traffic(boolean signalJumping, boolean withoutHelmet, boolean withoutLicence, boolean drunkAndDrive) {
		super();
		this.signalJumping = signalJumping;
		this.withoutHelmet = withoutHelmet;
		this.withoutLicence = withoutLicence;
		this.drunkAndDrive = drunkAndDrive;
	}

	public double calChallan(boolean signalJumping, boolean withoutHelmet, boolean withoutLicence,
			boolean drunkAndDrive) {
		double challan = 0.0;
		if (signalJumping)
			challan = challan+200;
		if (withoutHelmet)
			challan = challan+500;
		if (withoutLicence)
			challan = challan+5000;
		if (drunkAndDrive)
			challan = challan+10000;
		return challan;

	}
}
