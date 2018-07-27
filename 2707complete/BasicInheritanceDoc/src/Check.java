
public class Check {
	private int number1 = 500;
	public int number2 = 8;
	protected int number3 = 29;
	int number4 = 72;
	int getNumber1() {
		return number1;
	}
	//Displaying private variable using getter as private instance members are not visible outside class
	public void disp() {
		System.out.println(getNumber1());
	}
}
