package coreJavaMyra;

public class CalEbill {

	public static void main(String[] args) {

		EbillClass eb1 = new EbillClass(1450, 1290);
		double units = eb1.units();
		System.out.println("The units for current month is : " +units);
		double bill = calc(units);
		System.out.println("The ebill for this month is : " +bill);
		

	}

	private static Double calc(Double units) {

		if (units <= 100) {
			return 0.0;
		} else if (units <= 200) {
			return (units - 100) * 2;
		} else if (units > 200) {
			return (units - 100) * 3.5;
		}

		return 0.0;
	}

}
