//Tests Time class for addition of time
public class TimeTest {

	public static void main(String[] args) {
		Time T1 = new Time();
		Time T2 = new Time();
		Time T3 = new Time();
		
		T1.setHours(23);
		T1.setMinutes(46);
		System.out.println(T1);
		
		T2.setHours(23);
		T2.setMinutes(23);
		System.out.println(T2);
		
		T3= T1.addTime(T1, T2);
		
		if(T3.getHours()>24)
		{
			System.out.println("Total " + ((T3.getHours())/24) + " Days " + ((T3.getHours())%24) + " Hours " + T3.getMinutes()+ " Minutes ");
		}
		else
		{
			System.out.println("Total "+ T3.getHours() + " Hours " + T3.getMinutes()+ " Minutes ");
		}
	}

}
