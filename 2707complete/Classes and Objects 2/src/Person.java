import java.time.LocalDate;

public class Person {
	private String name;
	private Date dob;
	
	public Person(String n, int d, int m, int y)
	{
		name = n;
		dob = new Date(d,m,y); 
	}
	public void display()
	{
		int [] difference = new int[3];
		System.out.println("Name: " + name);
		System.out.println("Date of Birth: " + dob);
		difference = dob.age();
		System.out.println("Age: " + difference[2] + " Years, " + difference[1] + " Months, " + difference[0] + " Days ");
	}
	public void olderOne(Person p) {
		int [] difference = new int[3];
		if(dob.isSmaller(p.dob))
		{
			difference = dob.diff(p.dob);
			System.out.println(p.name +"is older than " + this.name + " by " + + difference[2] + " Years, " + difference[1] + " Months, " + difference[0] + " Days ");
		}
		else
		{
			difference = p.dob.diff(dob);
			System.out.println(this.name +"is older than " + p.name + " by " + + difference[2] + " Years, " + difference[1] + " Months, " + difference[0] + " Days ");
		}
	}
	
	
}
