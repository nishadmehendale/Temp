import java.util.*;
class palindrome
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int copy = num,sum=0,d;
		while(num>0)
		{
			d = num%10;
			sum = (sum * 10) + d;
			num = num/10;
		}
		if(copy == sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
			System.out.println("Reverse of the number is "+sum);
		}
	}
}