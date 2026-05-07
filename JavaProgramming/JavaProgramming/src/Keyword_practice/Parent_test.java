package Keyword_practice;

//class Parent{
//	int x=0;
//	void pa() {
//		System.out.println("Parent value of x : "+x);
//	}
//}
//class Child extends Parent{
//	int x=10;
//	void show() {
//		super.pa();// super keyword is used to access the varibles and methods of parent and for printing both parent and child class together.
//		System.out.println("Child value of x : "+x);
//		System.out.println("Parent value of x using super : "+super.x);
//	}
//}

class Parent{
	int x=0;
	void pa() {
		System.out.println("Parent value of x : "+x);
	}
	Parent(){
		
	}
}
class Child extends Parent{
	int x=10;
	Child(){
		super();
	}
	void show() {
		super.pa();// super keyword is used to access the varibles and methods of parent and for printing both parent and child class together.
		System.out.println("Child value of x : "+x);
		System.out.println("Parent value of x using super : "+super.x);
	}
}


public class Parent_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch=new Child();
		ch.show();

	}

}
