//Tests television class
public class TestTelevision {
	public static void main(String args[])
	{
		int channel,volume;
		Television television = new Television();
		
		//Turning ON TV
		System.out.println(television);
		television.setState(true);
		System.out.println("Turning ON TV");
		//System.out.println(television);
		
		//Changing volume
		//System.out.println("Changing the volume");
		volume = television.getCurrentVolume();
		System.out.println("Current Volume is "+volume);
		television.increaseVolume();
		volume = television.getCurrentVolume();
		System.out.println("Changing the volume");
		System.out.println("Current Volume is "+volume);
		//System.out.println(television);
		television.decreaseVolume();
		volume = television.getCurrentVolume();
		System.out.println("Changing the volume");
		System.out.println("Current Volume is "+volume);
		
		//Changing the channel
		channel = television.getCurrentChannel();
		System.out.println("Current Channel is "+channel);
		System.out.println("Changing Channel");
		television.setCurrentChannel(203);
		channel = television.getCurrentChannel();
		System.out.println("Current Channel is "+channel);
		//System.out.println(television);
		
		//Turning OFF TV 
		System.out.println("Turning OFF TV");
		television.setState(false);
		System.out.println(television);
	}
}
