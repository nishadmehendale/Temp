class Vehicle{
	void start() {
		System.out.println("Starting Vehicle");
	}
}
class FourWheeler{
	void start() {
		System.out.println("Starting FourWheeler");
	}
}

public class VehicleOverride {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.start();
		FourWheeler f = new FourWheeler();
		f.start();
	}

}
