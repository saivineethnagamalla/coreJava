package interfaceExample;

public class EmployeeSalaryTest {

	public static void main(String[] args) {
		
		ContractEmployeeSalary c1 = new ContractEmployeeSalary(400, 8, 24);
		System.out.println("salary per month : " +c1.calcSalaryPerMonth());
		System.out.println("Tax per month : " +c1.calcTaxPerMonth());
		System.out.println("salary per year : " +c1.calcSalaryPerYear());
		System.out.println("Tax per year : " +c1.calcTaxPerYear());
		System.out.println("******************************");
		
		ContractEmployeeSalary c2 = new ContractEmployeeSalary(300, 8, 24);
		System.out.println("salary per month : " +c2.calcSalaryPerMonth());
		System.out.println("Tax per month : " +c2.calcTaxPerMonth());
		System.out.println("salary per year : " +c2.calcSalaryPerYear());
		System.out.println("Tax per year : " +c2.calcTaxPerYear());
		System.out.println("******************************");
		
		ContractEmployeeSalary c3 = new ContractEmployeeSalary(200, 8, 24);
		System.out.println("salary per month : " +c3.calcSalaryPerMonth());
		System.out.println("Tax per month : " +c3.calcTaxPerMonth());
		System.out.println("salary per year : " +c3.calcSalaryPerYear());
		System.out.println("Tax per year : " +c3.calcTaxPerYear());
		System.out.println("******************************");
		
		FullTimeEmployeeSalary f1 = new FullTimeEmployeeSalary(4000, 24);
		System.out.println("salary per month : " +f1.calcSalaryPerMonth());
		System.out.println("Tax per month : " +f1.calcTaxPerMonth());
		System.out.println("salary per year : " +f1.calcSalaryPerYear());
		System.out.println("Tax per year : " +f1.calcTaxPerYear());
		System.out.println("******************************");

	}

}
