//Tests Distance Class and adds two distances
public class testDistance {

	public static void main(String[] args) {
		Distance Distance1 = new Distance();
		Distance Distance2 = new Distance();
		Distance Distance3 = new Distance();
		
		Distance1.setFeet(45);
		Distance1.setInches(5.5f);
		System.out.println(Distance1);
		
		Distance2.setFeet(35);
		Distance2.setInches(6.5f);
		System.out.println(Distance2);
		
		Distance3= Distance1.addDistance(Distance1, Distance2);
		System.out.println(Distance3);

	}

}
