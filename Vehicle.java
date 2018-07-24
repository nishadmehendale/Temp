public class Vehicle {

	private int currentSpeed;
	private double currentDirection;
	private String ownerName;
	private static int identificationNumber = 999999;
	private int currentIdentificationNumber;
	static double direction;
	public Vehicle(){
		currentIdentificationNumber =identificationNumber;
		identificationNumber = identificationNumber + 1;
	}
	public Vehicle(String ownerName){                                     
		currentIdentificationNumber =identificationNumber;
		identificationNumber = identificationNumber + 1;
		this.ownerName= ownerName ;
	}
	public static int getHighestIdentificationNumber() {
		return identificationNumber-1;
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public void setStop(int currentSpeed) {
		this.currentSpeed = 0;
	}
	public double getCurrentDirection() {
		return currentDirection;
	}
	public void setCurrentDirection(double currentDirection) {
		this.currentDirection = currentDirection;
	}
	public void changeCurrentDirection(double changeDirection) {
		this.currentDirection += changeDirection;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	@Override
	public String toString() {
		return "Vehicle [currentSpeed=" + currentSpeed + ", currentDirection=" + currentDirection + ", ownerName="
				+ ownerName + ", currentIdentificationNumber=" + currentIdentificationNumber + "]";
	}
	
	
	}