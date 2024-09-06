package abstractExample;

public abstract class OrderManagement {

	private String companyName;
	private String locationName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public OrderManagement(String companyName, String locationName) {
		super();
		this.companyName = companyName;
		this.locationName = locationName;
	}

	public String name() {
		return companyName;
	}

	public String location() {
		return locationName;
	}
	
	public abstract double gstCal();
	
	public abstract double totalBill();

}
