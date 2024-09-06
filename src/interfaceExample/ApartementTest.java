package interfaceExample;

public class ApartementTest {

	public static void main(String[] args) {

		VijayHomes v1 = new VijayHomes(20000, 2000, 4, 3);

		System.out.println("total flats : " + v1.numberOfFlats());
		System.out.println("total rooms : " + v1.numberOfRooms());
		System.out.println("total windows : " + v1.numberOfWindows());

		VijayHomes v2 = new VijayHomes(40000, 2000, 4, 3, 5);

		System.out.println("total flats : " + v2.numberOfFlats());
		System.out.println("total rooms : " + v2.numberOfRooms());
		System.out.println("total windows : " + v2.numberOfWindows());

	}

}
