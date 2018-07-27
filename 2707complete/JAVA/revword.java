import java.util.*;
class revword
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		String[] word = str.split(" ");
		int len = word.length;
		for(int i=0;i<len;i++)
		{
			StringBuffer s = new StringBuffer(word[i]);
			System.out.print(s.reverse()+" ");
		}
		
	}
}