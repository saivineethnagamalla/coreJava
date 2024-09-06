package abstractExample;

public abstract class EmployeeSalary {

	private String empName;
	private int empId;

	public EmployeeSalary(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public abstract double salarayCalacuation();

	public static void testMain() {

		System.out.println("testing");

	}

}
