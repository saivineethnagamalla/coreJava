package interfaceExample;

public class VijayHomes implements Apartement {

	private int totalSqFt;
	private int sqFtPerFlat;
	private int numberOfFloors;
	private int numberOfRoomsPerFlat;
	private int numberOfWindowsPerFlat;

	public VijayHomes(int totalSqFt, int sqFtPerFlat, int numberOfRoomsPerFlat, int numberOfWindowsPerFlat) {
		super();
		this.totalSqFt = totalSqFt;
		this.sqFtPerFlat = sqFtPerFlat;
		this.numberOfRoomsPerFlat = numberOfRoomsPerFlat;
		this.numberOfWindowsPerFlat = numberOfWindowsPerFlat;
	}

	public VijayHomes(int totalSqFt, int sqFtPerFlat, int numberOfRoomsPerFlat, int numberOfWindowsPerFlat,
			int numberOfFloors) {
		super();
		this.totalSqFt = totalSqFt;
		this.sqFtPerFlat = sqFtPerFlat;
		this.numberOfRoomsPerFlat = numberOfRoomsPerFlat;
		this.numberOfWindowsPerFlat = numberOfWindowsPerFlat;
		this.numberOfFloors = numberOfFloors;
	}

	@Override
	public int numberOfFlats() {
		if (numberOfFloors == 0)
			return (totalSqFt / sqFtPerFlat);
		else
			return (totalSqFt / sqFtPerFlat) * numberOfFloors;
	}

	@Override
	public int numberOfRooms() {
		return numberOfFlats() * numberOfRoomsPerFlat;
	}

	@Override
	public int numberOfWindows() {
		return numberOfFlats() * numberOfWindowsPerFlat;
	}

	public int cost(int cost) {

		return cost;

	}

}
