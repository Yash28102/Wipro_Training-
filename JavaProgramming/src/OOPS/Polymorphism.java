package OOPS;
// method overriding 
class vehicle{
	void nooftyres() {
		System.out.println("4");
	}
	void v_type() {
		System.out.println("Type of vehicle : Diesel");
	}
}
class Scooter extends vehicle{
	void nooftyres() {
		System.out.println("2");
	}
	void v_type() {
		System.out.println("Type of vehicle : Petrol");
	}
}

class car extends vehicle{
	void nooftyres() {
		System.out.println("4");
	}
	void v_type() {
		System.out.println("Type of vehicle : electric");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		Scooter sc=new Scooter();
		sc.nooftyres();
		sc.v_type();
		System.out.println("**********************");
		car c=new car();
		c.nooftyres();
		c.v_type();
		

	}

}
