package coreJavaMyra;

public class Employee {

	private String empName;
	private String empId;
	private String dept;

	public Employee(String empName, String empId, String dept) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.dept = dept;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpId() {
		return empId;
	}

	public String getDept() {
		return dept;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setDept(String dept) {
		this.dept = dept;

	}

	@Override
	public String toString() {
		return "Employee Dept is  " + dept + ", his name " + empName + " and his id is " + empId;

	}

	public static void main(String[] args) {

		Employee emp1 = new Employee("Chandu", "CHG-1234", "IT");

		System.out.println(emp1.getDept());
		System.out.println(emp1.empName);
		System.out.println(emp1);

	}

}
