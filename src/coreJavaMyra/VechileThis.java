package coreJavaMyra;

public class VechileThis {

	public String name;
	public String model;

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

	public VechileThis(String name, String model) {
		super();
		this.name = name;
		this.model = model;
	}

	public VechileThis(String name) {
		super();
		this.name = name;
	}

	public VechileThis() {

	}

	public String vechicalCon() {
		return name + model;
	}

	public void test() {
		String model = this.model;
		this.vechicalCon();

	}

}
