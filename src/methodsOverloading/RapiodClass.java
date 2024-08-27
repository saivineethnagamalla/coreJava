package methodsOverloading;

public class RapiodClass {

	private double kms;

	public RapiodClass(double kms) {
		super();
		this.kms = kms;
	}

	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

	public double calBill(double noOfKms) {
		return noOfKms * 18;
	}

	public double calBill(double noOfKms, boolean premium) {

		if (premium) {
			double bill = 0.0;

			if (noOfKms <= 5) {
				bill = noOfKms * 10;
			} else {
				bill = noOfKms * 15;
			}
			return bill;
		} else
			return 0.0;

	}

}
