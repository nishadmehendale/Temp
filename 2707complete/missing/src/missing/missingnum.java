package missing;

import java.util.Scanner;

public class missingnum {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int l = sc.nextInt();
		int temp = 0;
		int arr[] = new int [l];
		System.out.println("Enter elements");
		for(int i=0;i<l;i++)
		{
			arr[i] = sc.nextInt(); 
		}
		int min = arr[0];
		for(int i=0;i<l;i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
		{
			if(arr[j] < arr[i])
			{
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		}
		int copy [] = new int [l+1];
		for(int i=0;i<=l;i++)
		{
			copy[i]=min;
			min+=1;
		}
		int index=0;
		for(int j=0; j<l; j++)
		{
				if(arr[j] == copy[index])
				{
					index+=1;
					continue;
					
				}
				else
				{
					System.out.println("Missing number is "+copy[index]);
					break;
				}
		}
	}
}
