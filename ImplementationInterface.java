//Root Interface
interface A{
	void disp1();
}

//interface B implementing A 
interface B extends A{
	void disp2();
}

//Class C implementing B
class C implements B{
	//Implementing Abstract Methods
	public void disp1() {
		System.out.println("Interface A");
	}
	public void disp2() {
		System.out.println("Interface B");
	}
}
public class ImplementationInterface {

	public static void main(String[] args) {
		//Creating c object
		C c = new C();
		
		//Calling disp methods
		c.disp1();
		c.disp2();
	}

}
