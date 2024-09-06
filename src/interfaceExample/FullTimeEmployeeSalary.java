package interfaceExample;

public class FullTimeEmployeeSalary implements EmployeeSalary {

	private double perDayWages;
	private double noOfDays;

	public FullTimeEmployeeSalary(double perDayWages, double noOfDays) {
		super();
		this.perDayWages = perDayWages;
		this.noOfDays = noOfDays;
	}

	@Override
	public double calcSalaryPerMonth() {
		return perDayWages * noOfDays;
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
