package OOPS;

/*abstract class Vehicle1{
	abstract void nooftyres();
	void v_type() {
		System.out.println("Type of vehicle : Diesel");
	}
}
class Scooter1 extends Vehicle1{
	void nooftyres() {
		System.out.println("2");
	}
	
}

class Car1 extends Vehicle1{
	void nooftyres() {
		System.out.println("4");
	}
	
}*/

abstract class Hospital{
	abstract void ID();
	void ot() {
		System.out.println("operation theater : accessible to doctor and nurse");
	}
	void Patient() {
		System.out.println("name of patient : yash");
	}
	abstract void operations();
}
class doctor extends Hospital{
	void ID() {
		System.out.println("dotor id : d1");
	}
	void operations() {
		System.out.println("operate");
	}
	
}

class nurse extends Hospital{
	void ID() {
		System.out.println("nurse id : n1");
	}
	void operations() {
		System.out.println("assist");
	}
	
}

public class Abstract_Method {

	public static void main(String[] args) {
		/*Scooter1 sc=new Scooter1();
		sc.nooftyres();
		sc.v_type();
		System.out.println("**********************");
		Car1 c=new Car1();
		c.nooftyres();
		c.v_type();*/
		doctor sc=new doctor();
		sc.ID();
		sc.operations();
		System.out.println("**********************");
		nurse c=new nurse();
		c.ID();
		c.operations();
	}

}
