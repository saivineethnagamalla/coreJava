package methods;

public class Rapido {

	private boolean premium;
	private double noOfKms;

	public Rapido(boolean premium, double noOfkms) {
		super();
		this.premium = premium;
		this.noOfKms = noOfkms;
	}

	public boolean getPremium() {
		return premium;

	}

	public double getNoOfKms() {
		return noOfKms;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;

	}

	public void setNoOfKms(double noOfKms) {
		this.noOfKms = noOfKms;
	}

	public void calBill() {
		if (premium) {
			if (noOfKms <= 5) {
				System.out.println("The bill is" + noOfKms * 10);
			} else {
				System.out.println("The bill is" + noOfKms * 15);
			}
		} else {
			System.out.println("The bill is" + noOfKms * 18);

		}
	}

}
