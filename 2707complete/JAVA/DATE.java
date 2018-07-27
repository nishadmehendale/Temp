import java.util.*;
class DATE
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date as DD,MM,YYYY");
		String str;
		str = sc.nextLine();
		String[] date = str.split(",");
		switch(date[1])
		{
			case "01": 
				System.out.println(date[0]+"/January/"+date[2]); 
			break;
			case "02": 
				System.out.println(date[0]+"/February/"+date[2]); 
			break;
			case "03": 
				System.out.println(date[0]+"/March/"+date[2]); 
			break;
			case "04": 
				System.out.println(date[0]+"/April/"+date[2]); 
			break;
			case "05": 
				System.out.println(date[0]+"/May/"+date[2]); 
			break;
			case "06": 
				System.out.println(date[0]+"/June/"+date[2]); 
			break;
			case "07": 
				System.out.println(date[0]+"/July/"+date[2]); 
			break;
			case "08": 
				System.out.println(date[0]+"/August/"+date[2]); 
			break;
			case "09": 
				System.out.println(date[0]+"/September/"+date[2]); 
			break;
			case "10": 
				System.out.println(date[0]+"/October/"+date[2]); 
			break;
			case "11": 
				System.out.println(date[0]+"/November/"+date[2]); 
			break;
			case "12": 
				System.out.println(date[0]+"/December/"+date[2]); 
			break;
			default:
				System.out.println("Invalid");
		}
		
	}
}