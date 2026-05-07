package OOPS;

public class Constructors {

	// default constructor.// compiler
	// no parameter constructor.// Constructor(){}
	//Parameterized Constructor.//Constructor(String name){}
	
	Constructors(int car_num){
		System.out.println("Car details");
		System.out.println("Vehicle number : "+car_num);
	}
	
	Constructors(String variance){
		System.out.println("Vehicle Variance : "+variance);
	}
	Constructors(String name,String Type){
		System.out.println("Car Name : "+name);
		System.out.println("Vehicle Type : "+Type);
	}
	
	
	
	public static void main(String[] args) {
		
		Constructors obj=new Constructors(9427);
		System.out.println("***********************");
		new Constructors("Petrol");
		new Constructors("Baleno","Hatchback");

	}

}
