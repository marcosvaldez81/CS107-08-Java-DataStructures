
public class MyDate extends Date {
	private int hour;
	private String timePeriod;
	
	public MyDate(String month, int day, int year, int hour, String timePeriod) {
		super(month,day,year);
		this.hour = hour;
		this.timePeriod = timePeriod;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}
	
	public int getHour() {
		return hour;
	}
	
	public String getTimePeriod() {
		return timePeriod;
	}
	
	public String toString() {
		return getMonth() + " " + getDay() + ", " + getYear() + " " +  hour + " "+ timePeriod;
	}
	
	public static void main(String[] args) {
		MyDate date = new MyDate("January", 11, 1900, 6, "a.m." );
		
		System.out.print(date.toString());
	}
	
	
}
