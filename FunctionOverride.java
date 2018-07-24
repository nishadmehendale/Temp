class Parent{
	void display() {
		System.out.println("In Parent");
	}
}
class Child extends Parent{
	void display() {
		System.out.println("In Child");
	}
}
public class FunctionOverride {
	public static void main(String args[]) {
		Child child = new Child();
		Parent parent = new Parent();
		parent.display();
		child.display();
		
	}
}
