package interfaceExample;

public class MarketTest {

	public static void main(String[] args) {
		
		SuperMarket sM = new SuperMarket();
		System.out.println(sM.location());
		
		HyperMarket hM = new HyperMarket();
		System.out.println(hM.location());
		

	}

}
