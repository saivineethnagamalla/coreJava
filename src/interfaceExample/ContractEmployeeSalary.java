package interfaceExample;

public class ContractEmployeeSalary implements EmployeeSalary {

	private double perHoursWages;
	private double noOfHours;
	private double noOfDays;

	public ContractEmployeeSalary(double perHoursWages, double noOfHours, double noOfDays) {
		super();
		this.perHoursWages = perHoursWages;
		this.noOfHours = noOfHours;
		this.noOfDays = noOfDays;
	}

	@Override
	public double calcSalaryPerMonth() {
		return perHoursWages * noOfHours * noOfDays;
	}

	@Override
	public double calcTaxPerMonth() {
		// TODO Auto-generated method stub
		return calcTaxPerYear() / 12;
	}

	@Override
	public double calcSalaryPerYear() {
		// TODO Auto-generated method stub
		return calcSalaryPerMonth() * 12;
	}

	@Override
	public double calcTaxPerYear() {

		double salaryPerYear = calcSalaryPerYear();
		double tax = 0;

		if (salaryPerYear >= 100000 ) {
			tax = salaryPerYear * 0.30;
		} else if (salaryPerYear >= 750000 ) {
			tax = salaryPerYear * 0.25;
		} else if (salaryPerYear >= 500000) {
			tax = salaryPerYear * 0.20;
		} else if (salaryPerYear >= 250000) {
			tax = salaryPerYear * 0.10;
		}
		return tax;
	}

}
