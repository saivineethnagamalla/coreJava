package methods;

public class ChallanCalc {

	public static void main(String[] args) {

		TrafficChallan test1 = new TrafficChallan(0, 0, 0, 0);
		System.out.println("the chalan without discount : " + test1.calChallan(0, 0, 0, 0));
		TrafficChallan test2 = new TrafficChallan(1, 0, 0, 0);
		System.out.println("the chalan without discount : " + test2.calChallan(1, 0, 0, 0));
		TrafficChallan test3 = new TrafficChallan(0, 1, 0, 0);
		System.out.println("the chalan without discount : " + test3.calChallan(0, 1, 0, 0));
		TrafficChallan test4 = new TrafficChallan(0, 0, 1, 0);
		System.out.println("the chalan without discount : " + test4.calChallan(0, 0, 1, 0));
		TrafficChallan test5 = new TrafficChallan(0, 0, 0, 1);
		System.out.println("the chalan without discount : " + test5.calChallan(0, 0, 0, 1));
		TrafficChallan test6 = new TrafficChallan(1, 2, 0, 0);
		System.out.println("the chalan without discount : " + test6.calChallan(1, 2, 0, 0));

		double challan = test6.calChallan(1, 2, 0, 0);

		double finalDiscount = discount("DEC", challan);
		System.out.println("If chalan pays in dec the discount is : " + finalDiscount);
		double finalDiscount1 = discount("AUG", challan);
		System.out.println("If chalan pays in other than dec the discount is : " + finalDiscount1);

	}

	public static double discount(String month, double challan) {
		double discount = 0.0;
		if ("DEC".equals(month))
			discount = challan * 0.9;
		return discount;
	}

}
