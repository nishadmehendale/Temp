import java.util.*;
class numsearch
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of array");
		int arr[] = new int [15];
		int flag = 0;
		for(int i=0;i<15;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value to be searched");
		int num = sc.nextInt();
		for(int i=0;i<15;i++)
		{
			if(arr[i]==num)
			{
				System.out.println("Number found at loc "+(i+1));
				flag = 1;
			}
			
		}
		if(flag == 0)
		{
			System.out.println("Number not found");
		}
	}
}