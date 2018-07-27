//interface Game
interface Game{
	void play();
}

//class cricket implementing game interface
class Cricket implements Game{
	//Implementing Abstract Methods
	public void play() {
		System.out.println("Cricket");
	}
	
}

//class football implementing game interface
class Football implements Game{
	//Implementing Abstract Methods
	public void play() {
		System.out.println("Football");
	}
	
}

//class tennis implementing game interface
class Tennis implements Game{
	//Implementing Abstract Methods
	public void play() {
		System.out.println("Tennis");
	}
	
}

//Class Demo
public class Demo {
	//Perform method to call objects play method
	public static void perform(Game game) {
		game.play();
	}

	public static void main(String[] args) {
		//Creating cricket object
		Game cricket = new Cricket();
		perform(cricket);
		
		//Creating football object
		Game football = new Football();
		perform(football);
		
		//Creating tennis object
		Game tennis = new Tennis();
		perform(tennis);
		
	}

}
