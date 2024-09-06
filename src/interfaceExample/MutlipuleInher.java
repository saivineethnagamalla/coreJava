package interfaceExample;

public class MutlipuleInher implements Crowd,Market {

	@Override
	public String howMany() {
		return "based on location";
	}

	@Override
	public String location() {
		return "depends on crowd";
	}


}
