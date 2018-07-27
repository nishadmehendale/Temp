package remdupchar;

import java.util.Scanner;

class remdupchar {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = sc.nextLine();
		char [] string = new char[input.length()];
		string = input.toCharArray() ;
		for(int i = 0; i < string.length; i++)
		{
			char c = string[i];
			for(int j=i+1; j<string.length; j++)
			{
				if(c == string[j])
				{
					string[j]=' ';
				}
			}
		}
		
		String output = new String(string);
		output = output.replaceAll(" ", "");
		System.out.println(output);
	}
}