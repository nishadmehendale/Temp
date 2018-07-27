import java.util.*;
class marksavg
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of 3 students");
		int [][]arr = new int [3][3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Marks of Student "+(i+1));
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter Marks of Subject "+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			System.out.println("Total Average marks of student"+(i+1)+" are as follows");
			System.out.println((float)(arr[i][0]+arr[i][1]+arr[i][2])/3);
		}
		for(int i=0;i<3;i++)
		{
			System.out.println("Average marks of subject"+(i+1)+"are as follows");
			System.out.println((float)(arr[0][i]+arr[1][i]+arr[2][i])/3);
		}
	}
}