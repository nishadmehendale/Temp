//Class GenerateEmployeeID which generates unique EmployeeIDs for each Object
public class GenerateEmployeeID {
	
	private int employeeID = 0;
	private static int lastEmployeeID = 100000;
	
	//Constructor Override
	public GenerateEmployeeID() {
		
		employeeID = lastEmployeeID + 1;
		lastEmployeeID = employeeID;
	}
	
	//Static Method to get Next EmployeeID
	public static int getNextEmployeeID() {
		return lastEmployeeID + 1;
	}
	
	//Non static method to get current EmployeeID
	public int getEmployeeID() {
		return employeeID;
	}
}
