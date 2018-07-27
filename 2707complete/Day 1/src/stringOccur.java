import java.util.*;
public class stringOccur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of names");
		int number = sc.nextInt();
		String [] strings = new String[number];
		
		System.out.println("Enter the names");
		for (int i=0;i<number;i++) {
			strings[i] = sc.nextLine();
		}
		
		System.out.println("Enter the name to be searched");
		String findName = sc.nextLine();
		
		int count = 0;
		for(int i=0;i<number;i++) {
			if(findName.equals(strings[i])) {
				count+=1;
			}
		}
		
		System.out.println("The " + findName + " occurred " + count +" times");
	}

}
