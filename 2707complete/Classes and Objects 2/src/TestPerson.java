
public class TestPerson {

	public static void main(String[] args) {
		Person ram = new Person("Ram",5,6,1980);
		Person shyam = new Person("Shyam",2,3,1987);
		ram.display();
		shyam.display();
		shyam.olderOne(ram);
	}

}
