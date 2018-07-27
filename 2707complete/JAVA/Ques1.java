import java.util.*;
class Ques1
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int s = sqr(num);
		System.out.println(num+"*1="+num+",Square:"+s);
	}
	public static int sqr(int n)
	{
		return n*n;
	}
}