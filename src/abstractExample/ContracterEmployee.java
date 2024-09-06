package abstractExample;

public class ContracterEmployee extends EmployeeSalary {

	public double perDayWages;
	public double workingDays;

	public ContracterEmployee(String empName, int empId) {
		super(empName, empId);
	}

	public ContracterEmployee(String empName, int empId, double perDayWages, double workingDays) {
		super(empName, empId);
		this.perDayWages = perDayWages;
		this.workingDays = workingDays;
	}

	@Override
	public double salarayCalacuation() {
		return perDayWages * workingDays;
	}
	
	

}
