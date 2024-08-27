package inhertanceExample;

public class Animal {

	private String name;
	private String category;

	public Animal() {
		super();

	}

	public Animal(String name, String category) {
		super();
		this.name = name;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String fullName(String category, String name) {
		return category + name;
	}

}
