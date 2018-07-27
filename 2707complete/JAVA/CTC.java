import java.util.*;
class CTC
{
	public static void main(String args [])
	{
		int i;
		float t=0.0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter inconme out");
		i = sc.nextInt();
		if(i<=180000)
		{
			t=0;
		}
		else if(i<=300000)
		{
			t =(float) 0.1 * i;
		}
		else if(i<=500000)
		{
			t =(float) 0.2 * i;
		}
		else if(i>500000)
		{
			t =(float) 0.3 * i;
		}
		System.out.println(t);
	
	}
}