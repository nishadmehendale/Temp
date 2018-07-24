class M{
	M() {
		System.out.println("M");
	}
}

class O extends M{
	O() {
		System.out.println("O");
	}
}
class N extends M{
	N() {
		System.out.println("N");
	}
}
public class HierarchyInheritance {

	public static void main(String[] args) {
		N n = new N();
		O o = new O();

	}

}
