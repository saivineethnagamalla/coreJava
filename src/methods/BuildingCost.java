package methods;

import java.util.Scanner;

public class BuildingCost {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of plot : ");
		double length = sc.nextDouble();
		System.out.print("Enter the breath of plot : ");
		double breath = sc.nextDouble();

		Build build1 = new Build(length, breath);
		System.out.println("Sqft of the plot is " + build1.findSqft(length, breath));
		System.out.println("Number of days to construct " + build1.workingDays(build1.findSqft(length, breath)));
		System.out.println("Cost of cons " + build1.costOfCons(build1.findSqft(length, breath)));
		System.out.println("Cost of mat " + build1.costOfMat(build1.findSqft(length, breath)));
		System.out.println("Total cost " + build1.totalCost(build1.costOfCons(build1.findSqft(length, breath)),
				build1.costOfMat(build1.findSqft(length, breath))));
		sc.close();

		double len = 30;
		double bre = 20;
		Build build2 = new Build(len, bre);
		double sqft = build2.findSqft(length, breath);
		double workingDays = build2.workingDays(sqft);
		double costOfCost = build2.costOfCons(sqft);
		double costOfMat = build2.costOfMat(sqft);
		double totalCost = build2.totalCost(costOfCost, costOfMat);

		System.out.println("Sqft of the plots is " + sqft + " working days needed for const " + workingDays
				+ " total cost " + totalCost);

	}

}
