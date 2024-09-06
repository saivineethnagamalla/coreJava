package abstractExample;

public class OrderManagmentTest {

	public static void main(String[] args) {

		KFC kfc1 = new KFC("KFC", "chennai", 10, 400);
		System.out.println("The Name of the company is : " + kfc1.name());
		System.out.println("The Location of the company is : " + kfc1.location());
		System.out.println("The GST for the current bill is : " + kfc1.gstCal());
		System.out.println("The total is : " + kfc1.totalBill());

		StarBucks star1 = new StarBucks("star bucks", "mumbai", 10, 400);
		System.out.println("The Name of the company is : " + star1.name());
		System.out.println("The Location of the company is : " + star1.location());
		System.out.println("The GST for the current bill is : " + star1.gstCal());
		System.out.println("The total is : " + star1.totalBill());

		UpdiHotel updi1 = new UpdiHotel("updipi", "hyd", 10, 400);
		System.out.println("The Name of the company is : " + updi1.name());
		System.out.println("The Location of the company is : " + updi1.location());
		System.out.println("The GST for the current bill is : " + updi1.gstCal());
		System.out.println("The total is : " + updi1.totalBill());

	}

}
