// Searches an element in 2D array
import java.util.*;
public class findNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dimensions of array");
		int dimension1 = sc.nextInt();
		int dimension2 = sc.nextInt();
		int[][] arr = new int [dimension1][dimension2];
		
		System.out.println("Enter elememts");
		for(int i= 0; i<dimension1; i++) {
			for (int j = 0; j<dimension2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter element to be searched");
		int number = sc.nextInt();
		
		int flag = 0;
		for(int i= 0; i<dimension1; i++) {
			for (int j = 0; j<dimension2; j++) {
				if(arr[i][j] == number)
				{
					System.out.println(number + " is found at dimesion " + dimension1 + " and " + dimension2);
					flag = 1;
				}
			}
		}
		
		if(flag == 0)
		{
			System.out.println("Number not found");
		}
	}

}
