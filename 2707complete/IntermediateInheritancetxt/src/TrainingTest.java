//Class Training holds Training id,subject and fees
abstract class Training{
	int id;
	protected String subject;
	double fees;
	abstract double getOrderValue();
}

//Class PublicTraining which is dependent on number of participants
class PublicTraining extends Training{
	int participants;
	//Constructor as per requirement
	PublicTraining(String subject,double fees, int participants){
		super.subject = subject;
		super.fees = fees;
		this.participants = participants;
	}
	//Method to get training cost
	double getOrderValue() {
		return fees * participants;
	}
}

//Class CorporateTraining which is dependent on number of days
class CorporateTraining extends Training{
	int days;
	//Constructor as per requirement
	CorporateTraining(String subject,double fees, int days){
		super.subject = subject;
		super.fees = fees;
		this.days = days;
	}
	//Method to get training cost 
	double getOrderValue() {
		return fees * days;
	}
}
public class TrainingTest {

	public static void main(String[] args) {
		//Creating object of public training using upcasting
		Training publicTraining = new PublicTraining("Java",5000,50);
		
		//Getting public training cost
		double order = publicTraining.getOrderValue();
		System.out.println("Cost of Public Training is "+order);
		
		//Creating object of corporate training using upcasting
		Training corporateTraining = new CorporateTraining("Big Data",35000,4);
		
		//Getting corporate training cost
		order = corporateTraining.getOrderValue();
		System.out.println("Cost of Corporate Training is "+order);
	}

}
