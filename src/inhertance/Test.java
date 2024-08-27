package inhertance;

public class Test {

	public static void main(String[] args) {

		Vechile vechile = new Vechile("swift", "EV");
		System.out.println("Normal Class");
		System.out.println(vechile.getModel());
		System.out.println(vechile.getName());
		System.out.println(vechile.vechicalCon());

		// Single Inhertance -> parent - child
		Car car1 = new Car("BMW", "A4", 4);
		System.out.println("Single Inhertance");
		System.out.println(car1.getModel());// subclass
		System.out.println(car1.getName());// subclass
		System.out.println(car1.vechicalFullName());// parentclass
		System.out.println(car1.speedLimt());// parentclass
		System.out.println(car1.getSeatCapcity());// parentclass
		System.out.println(car1.getClass());

		// Mutli-level Inhertance -> parent - child - grand child
		System.out.println("Mutli-level Inhertance");
		SUV suv = new SUV("BMW", "x6", 6);
		System.out.println(suv.getModel());// 2nd subclass
		System.out.println(suv.getName());// 2nd subclass
		System.out.println(suv.vechicalFullName());// subclass
		System.out.println(suv.speedLimt());// subclass
		System.out.println(suv.getSeatCapcity());// subclass
		System.out.println(suv.getClass());

		// Hirearchieral Inhertance -> parent - child1 & child 2

		// child1
		Car car2 = new Car("Audi", "A4", 4);
		System.out.println("Hirearchieral Inhertance");
		System.out.println(car2.getModel());// subclass
		System.out.println(car2.getName());// subclass
		System.out.println(car2.getSeatCapcity());// parent
		System.out.println(car2.vechicalFullName());// parent
		System.out.println(car2.speedLimt());// parent

		// child2
		Bike bike1 = new Bike("Honda", "Activa6G", "Scooty");
		System.out.println(bike1.getModel());// subclass
		System.out.println(bike1.getName());// subclass

		// Hybrid Inhertance -> Mutli-level Inhertance + Hirearchieral Inhertance
		// Parent - child 1 & child 2 - grandchild1
		Pollution pollution1 = new Pollution("Bajaj", "FZ", "Bike", 40);
		System.out.println("Hybrid Inhertance");
		System.out.println(pollution1.getModel());// parent
		System.out.println(pollution1.getName());// praent
		System.out.println(pollution1.getMode());// child1
		System.out.println(pollution1.getaQI());// grandchild

	}
}
