//Test class for GenerateEmployeeID
public class TestGenerateEmployeeID {

	public static void main(String[] args) {
		//Creating Object
		GenerateEmployeeID employee = new GenerateEmployeeID();
		
		//Getting current employeeID
		int employeeID = employee.getEmployeeID();
		System.out.println(employeeID);
		
		//Getting next employeeID
		employeeID = GenerateEmployeeID.getNextEmployeeID();
		System.out.println(employeeID);
	}

}
