package inhertanceExample;

public class TestMultiple {

	private Tiger tiger;
	private Loin loin;

	public Tiger getTiger() {
		return tiger;
	}

	public void setTiger(Tiger tiger) {
		this.tiger = tiger;
	}

	public Loin getLoin() {
		return loin;
	}

	public void setLoin(Loin loin) {
		this.loin = loin;
	}

	public TestMultiple(Tiger tiger, Loin loin) {
		super();
		this.tiger = tiger;
		this.loin = loin;
	}

	public TestMultiple() {

	}

}
