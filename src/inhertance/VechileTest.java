package inhertance;

public class VechileTest {

	

	private Vechile vechile;
	private VechileDetails VechileDetails;

	public Vechile getVechile() {
		return vechile;
	}

	public void setVechile(Vechile vechile) {
		this.vechile = vechile;
	}

	public VechileDetails getVechileDetails() {
		return VechileDetails;
	}

	public void setVechileDetails(VechileDetails vechileDetails) {
		VechileDetails = vechileDetails;
	}
	
	public VechileTest(Vechile vechile, inhertance.VechileDetails vechileDetails) {
		super();
		this.vechile = vechile;
		VechileDetails = vechileDetails;
	}

}
