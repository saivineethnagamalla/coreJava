package abstractExample;

public class KFC extends OrderManagement {

	private int noOfItems;
	private double costPerIteam;

	public KFC(String companyName, String locationName) {
		super(companyName, locationName);
	}

	public KFC(String companyName, String locationName, int noOfItems, double costPerIteam) {
		super(companyName, locationName);
		this.costPerIteam = costPerIteam;
		this.noOfItems = noOfItems;
	}

	@Override
	public double gstCal() {
		return (noOfItems * costPerIteam) * 0.24;
	}

	@Override
	public double totalBill() {
		return (noOfItems * costPerIteam) + gstCal();
	}

}
