class Top1{
	void disp1() {
		System.out.println("In Top1");
	}
}
class Bottom1 extends Top1{
	void disp1() {
		System.out.println("In Bottom1");
	}
}
class Bottom2 extends Top1{
	void disp1() {
		System.out.println("In Bottom2");
	}
}
class Bottom3 extends Top1{
	void disp1() {
		System.out.println("In Bottom3");
	}
}
public class TestTopBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bottom1 b1 = new Bottom1();
		Bottom2 b2 = new Bottom2();
		Bottom3 b3 = new Bottom3();
		b1.disp1();
		b2.disp1();
		b3.disp1();
	}

}
