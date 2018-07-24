class ParentClass{
	void display(String name) {
		System.out.println("Name is " + name);
	}
}
class ChildClass extends ParentClass{
	void display(int number) {
		System.out.println("Number is " + number);
	}
}
public class FuntionOverload {

	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		child.display(50);
		child.display("Nishad");

	}

}
