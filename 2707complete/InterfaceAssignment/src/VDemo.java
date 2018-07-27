//Interface three wheeler with start method
interface Vehicle{
	void start();
}

//Class two wheeler implementing interface vehicle
class TwoWheeler implements Vehicle{

	@Override
	public void start() {
		System.out.println("TwoWheeler");
	}
	
}

//Class three wheeler implementing interface vehicle
class ThreeWheeler implements Vehicle{

	@Override
	public void start() {
		System.out.println("ThreeWheeler");
	}
	
}

//Class four wheeler implementing interface vehicle
class FourWheeler implements Vehicle{

	@Override
	public void start() {
		System.out.println("FourWheeler");
	}
	
}
public class VDemo {

	public static void main(String[] args) {
		//Creating Array of objects
		Vehicle[] vehicle = new Vehicle[3];
		
		//Creating individual object
		vehicle[0] = new TwoWheeler();
		vehicle[1] = new ThreeWheeler();
		vehicle[2] = new FourWheeler();
		
		
		//Traversing Array for ThreeWheeler Class
		for(int i=0;i<3;i++) {
			if(vehicle[i].getClass().getName().equals("ThreeWheeler"))
				vehicle[i].start();
		}
		
	}

}
