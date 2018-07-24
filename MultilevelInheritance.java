class P{
	P() {
		System.out.println("P");
	}
}

class Q extends P{
	Q() {
		System.out.println("Q");
	}
}
class R extends Q{
	R() {
		System.out.println("R");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		R r = new R();

	}

}
