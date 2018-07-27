import java.util.*;
class sort
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of array");
		int arr[] = new int [15];
		int temp = 0;
		for(int i=0;i<15;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Sorted Array is");
		for(int i=0;i<15;i++)
		{
			for(int j=0;j<14;j++)
			{
					if(arr[j]>arr[j+1])
					{
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
			}
		}
		for(int i=0;i<15;i++)
		{
			System.out.println(arr[i]);
		}
	}
}