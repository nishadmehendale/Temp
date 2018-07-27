//import java.util.*;
public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
		Account nishad = new Account("Nishad",1000);
		System.out.println(nishad);
		int next = Account.getNextAccountNumber();
		System.out.println(next);
		Account name = new Account("name");
		System.out.println(name);
		next = Account.getNextAccountNumber();
		System.out.println(next);
		String result = nishad.transaction(name, 200);
		System.out.println(result);
		result = nishad.transaction(name, nishad.getBalance());
		System.out.println(result);
		System.out.println(nishad);
		System.out.println(name);
	}

}