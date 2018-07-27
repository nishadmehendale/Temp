//Class Parent1
class Parent1{
	int num1 = 2;
}

//interface Parent2
interface Parent2{
	int num2 = 2;
}

//Class Child inherits Parent1 and functionally inherits Parent2
class Child extends Parent1 implements Parent2{
	void display() {
	System.out.println("Parent class Parent 1 number is "+num1);
	System.out.println("Interface Parent 2 number is "+num2);
	}
}

//Class that tests Child class
public class TestChild {

	public static void main(String[] args) {
		//Creating Child Object
		Child child = new Child();
		
		//Calling Child.display Function
		child.display();
	}

}
