import java.util.*;

public class calculateDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item price");
		float newItem = sc.nextFloat();
		
		System.out.println("Calculating discount");
		float discount = (float)0.35 * newItem;
		System.out.println("Discount is "+discount);
		
		float newItemPrice = newItem - discount;
		System.out.println("New Item Price is " + newItemPrice);
	}

}
