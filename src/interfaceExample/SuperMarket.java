package interfaceExample;

public class SuperMarket implements Market {

	@Override
	public String location() {
		return "should be in city";
	}

}
