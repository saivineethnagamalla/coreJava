package methods;

public class RapidoBill {

	public static void main(String[] args) {
		Rapido cust = new Rapido(false, 10);
		cust.calBill();
		Rapido cust1 = new Rapido(true, 5);
		cust1.calBill();
		Rapido cust2 = new Rapido(true, 10);
		cust2.calBill();

	}

}
