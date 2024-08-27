package methodOverriding;

public class PersonReverse extends Person {

	public PersonReverse(String firstName, String lastName, String gender) {
		super(firstName, lastName, gender);
	}

	@Override
	public String con() {
		return lastName + firstName;
	}

	@Override
	public String toString() {
		return "PersonReverse [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
	}

	
	
}
