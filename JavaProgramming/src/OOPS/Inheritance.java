package OOPS;

class Animal{
	
	void eat(String eat) {
		System.out.println("Animal Eat : "+eat);
	}
	void sound(String sound) {
		System.out.println("Animal Sound : "+sound);
	}
	
}

class Dog extends Animal{
	void color() {
		System.out.println("Black");
	}
}

class cat extends Dog{
	void walk() {
		System.out.println("Cat walk");
	}
}

public class Inheritance {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Dog d=new Dog();
//		d.color();
//		d.eat("Royal Canin");
		
		cat c= new cat();
		c.walk();
		c.eat("Milk");
		c.sound("Meoowwww");
	}

}