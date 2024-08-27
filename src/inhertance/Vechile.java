package inhertance;

public class Vechile {

	private String name;
	private String model;

	public String getName() {
		return name;
	}

	public void setNo(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Vechile(String name, String model) {
		super();
		this.name = name;
		this.model = model;
	}

	public Vechile(String name) {
		super();
		this.name = name;
	}

	public Vechile() {

	}

	public String vechicalCon() {
		return name + model;
	}

}
