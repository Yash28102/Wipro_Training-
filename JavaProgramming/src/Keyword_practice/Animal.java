package Keyword_practice;

class Animal_data{
	int x=100;
	String name,type;
	/*void eat(int x,String name,String type) {
//		this.x=x;// refer current class variable
//		this.type=type;
//		this.name=name;
		System.out.println("X using this : "+this.x);// point s to the instance of x outside the method 
		System.out.println("X : "+x);// point the x local variable 
	}
	void details(int x,String name,String type) {
		this.x=x;
		this.type=type;
		System.out.println("Eating");
	}*/
	
	void eat(int x,String name,String type) {
//	this.x=x;// refer current class variable
//	this.type=type;
//	this.name=name;
	System.out.println("X using this : "+this.x);// points to the instance of x outside the method 
	System.out.println("X : "+x);// point the x local variable 
	}
	
	void details(){
		this.eat(100, "Max", "Dog");
	}
	Animal_data(){
		this(10);
		System.out.println("Default Constructor");
	}
	
	Animal_data(int a){
		//this();
	}
	
}

public class Animal {

	public static void main(String[] args) {
		Animal_data a=new Animal_data();
		a.details();

	}

}
