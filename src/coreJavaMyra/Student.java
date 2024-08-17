package coreJavaMyra;

public class Student {
	
	
	private String name;
	private String collegeName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student(String name, String collegeName) {
		super();
		this.name = name;
		this.collegeName = collegeName;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", collegeName=" + collegeName + "]";
	}
	public static void main(String[] args) {
		
		Student stud = new Student("sai", "HITS");
		Student stud1 = new Student("Manoj", "JNTU");
		
		
		stud1.setCollegeName("JNTUK");
		
		System.out.println(stud);
		System.out.println(stud1);
		
	}
	

}
