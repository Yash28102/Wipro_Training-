package OOPS;

interface Hospital1
{
	void infra();
	void degree();
	
}

class Doctor implements Hospital1{
	public void infra() {
		System.out.println("ots,wards,doctor,cabin");
	}
	public void degree() {
		System.out.println("Md Endo");
	}
}
class Nurse1 implements Hospital1{
	public void infra() {
		System.out.println("ots,wards");
	}
	public void degree() {
		System.out.println("nursing");
	}
}

public class Interface {

	public static void main(String[] args) {
		Nurse1 n= new Nurse1();
		n.degree();
		
		Doctor d= new Doctor();

	}

}
