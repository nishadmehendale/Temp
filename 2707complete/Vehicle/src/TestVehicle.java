//import java.util.*;
public class TestVehicle 
{

	public static void main(String args[])
	{
		
		//Scanner scanner=new Scanner(System.in);
		Vehicle [] vehicle = new Vehicle[5];
		for(int i=0;i<3;i++) {
			vehicle[i] = new Vehicle();
		}
		vehicle[3] = new Vehicle("Amit");
		vehicle[4] = new Vehicle("Ajit");
		for(int i=0;i<5;i++)
			System.out.println(vehicle[i]);
		System.out.println(Vehicle.getHighestIdentificationNumber());
	}
}