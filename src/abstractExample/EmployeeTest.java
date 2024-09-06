package abstractExample;

public class EmployeeTest {

	public static void main(String[] args) {

		ContracterEmployee conEmp1 = new ContracterEmployee("ramakrishana", 123, 3000, 24);
		System.out.println(conEmp1.salarayCalacuation());

		FullTimeEmployee fullEmp1 = new FullTimeEmployee("chandirka", 456, 500, 24, 8);
		System.out.println(fullEmp1.salarayCalacuation());

		EmployeeSalary.testMain();

	}

}
