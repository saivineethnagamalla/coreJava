package abstractExample;

public class UpdiHotel extends OrderManagement {

	private int noOfItems;
	private double costPerIteam;

	public UpdiHotel(String companyName, String locationName) {
		super(companyName, locationName);
	}

	public UpdiHotel(String companyName, String locationName, int noOfItems, double costPerIteam) {
		super(companyName, locationName);
		this.costPerIteam = costPerIteam;
		this.noOfItems = noOfItems;
	}

	@Override
	public double gstCal() {
		return (noOfItems * costPerIteam) * 0.12;
	}

	@Override
	public double totalBill() {
		return (noOfItems * costPerIteam) + gstCal();
	}

}
