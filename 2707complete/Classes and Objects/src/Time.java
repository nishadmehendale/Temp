//Time class with hours and minutes which adds two times and returns third object
public class Time {
	private int hours;
	private int minutes;
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		if(minutes<60)	
			this.minutes = minutes;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		if(hours<24)
			this.hours = hours;
	}
	public Time addTime(Time T1,Time T2) {
		Time T3 = new Time();
		T3.hours = T1.getHours() + T2.getHours();
		T3.minutes = T1.getMinutes() + T2.getMinutes();
		if(T3.minutes >= 60)
		{
			T3.hours += 1;
			T3.minutes -= 60;
		}
		return T3;
}
	@Override
	public String toString() {
		return "Time [hours=" + hours + ", minutes=" + minutes + "]";
	}
}