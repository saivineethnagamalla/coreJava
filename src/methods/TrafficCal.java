package methods;

public class TrafficCal {

	public static void main(String[] args) {

		Traffic test1 = new Traffic(false, false, false, false);
		System.out.println("the chalan without discount : " + test1.calChallan(false, false, false, false));
		Traffic test2 = new Traffic(true, false, false, false);
		System.out.println("the chalan without discount : " + test2.calChallan(true, false, false, false));
		Traffic test3 = new Traffic(false, true, false, false);
		System.out.println("the chalan without discount : " + test3.calChallan(false, true, false, false));
		Traffic test4 = new Traffic(false, false, true, false);
		System.out.println("the chalan without discount : " + test4.calChallan(false, false, true, false));
		Traffic test5 = new Traffic(false, false, false, true);
		System.out.println("the chalan without discount : " + test5.calChallan(false, false, false, true));
		Traffic test6 = new Traffic(true, false, false, true);
		System.out.println("the chalan without discount : " + test6.calChallan(true, false, false, true));

		
	}

}
