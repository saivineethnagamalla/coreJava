package abstractExample;

public class FullTimeEmployee extends EmployeeSalary {

	public FullTimeEmployee(String empName, int empId) {
		super(empName, empId);
	}

	public double perHoureWages;
	public double workingDays;
	public double numberOfWorkingHours;

	public FullTimeEmployee(String empName, int empId, double perHoureWages, double workingDays,
			double numberOfWorkingHours) {
		super(empName, empId);
		this.numberOfWorkingHours = numberOfWorkingHours;
		this.perHoureWages = perHoureWages;
		this.workingDays = workingDays;
	}

	@Override
	public double salarayCalacuation() {
		return perHoureWages * numberOfWorkingHours * workingDays;
	}

}
