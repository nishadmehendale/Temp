import java.time.*;
public class Date {
	private int d,m,y;
	
	
	public Date(int d, int m, int y)
	{
		this.d = d;
		this.m = m;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Date " + this.d + " / " + this.m +  " / " + this.y + "";
	}
	
	public boolean isSmaller(Date d) {
		boolean flag;
		if(this.y == d.y)
		{
			if(this.m == d.m)
			{
				if(this.d == d.d)
				{
					flag = true;
				}
				else if(this.d < d.d)
				{
					flag = false;
				}
				else
				{
					flag = true;
				}
			}
			else if(this.m < d.m)
			{
				flag = false;
			}
			else{
				flag = true;
			}
		}
		else if (this.y < d.y)
		{
			flag = false;
		}
		else
		{
			flag = true;
		}
		return flag;
		}
	public int[] diff(Date d) {
		int []date= new int[3];
		LocalDate d1,d2;
		Period p;
		d1 =LocalDate.of(this.y, this.m, this.d);
		d2 =LocalDate.of(d.y, d.m, d.d);
		if(d1.getYear() == d2.getYear()) {
			if(d1.getMonth() == d2.getMonth()) {
				if(d1.getDayOfYear() == d2.getDayOfYear()) {
					p = Period.between(d1,d2);
				}
				else if(d1.getDayOfYear() > d2.getDayOfYear()) {
					p = Period.between(d2,d1);
				}
				else {
					p = Period.between(d1,d2);
				}
			}
			else if(d1.getMonthValue() > d2.getMonthValue()) {
				p = Period.between(d2,d1);
			}
			else {
				p = Period.between(d1,d2);
			}
		}
		else if(d1.getYear() > d2.getYear()) {
			p = Period.between(d2,d1);
		}
		else {
			p = Period.between(d1,d2);
		}
		date[2] = p.getYears();
		date[1] = p.getMonths();
		date[0] = p.getDays();
		return date;
	}
	public int[] age(){
		int []date= new int[3];
		LocalDate d1,d2= LocalDate.now();
		d1 =LocalDate.of(this.y, this.m, this.d);
		Period p = Period.between(d1,d2);
		date[2] = p.getYears();
		date[1] = p.getMonths();
		date[0] = p.getDays();
		return date;
	}
	public int getD() {
		return d;
	}
	public int getM() {
		return m;
	}
	public int getY() {
		return y;
	}
	
}
