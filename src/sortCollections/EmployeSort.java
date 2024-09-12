package sortCollections;

public class EmployeSort implements Comparable<EmployeSort> {

	private String empName;
	private Double empSalary;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	public EmployeSort(String empName, Double empSalary) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
	}

//	@Override
//	public int compareTo(EmployeSort o) {
//		return this.empSalary.compareTo(o.empSalary);
//	}
	
	@Override
	public int compareTo(EmployeSort o) {
		return this.empName.compareTo(o.empName);
	}

	@Override
	public String toString() {
		return "EmployeSort [empName=" + empName + ", empSalary=" + empSalary + "]";
	}


	
}
