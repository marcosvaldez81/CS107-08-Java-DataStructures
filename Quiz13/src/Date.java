
public class Date {
	private String Month;
	private int day;
	private int year;
	
	public Date(String month, int day, int year) {
		this.Month = month;
		this.day = day;
		this.year = year;
	}
	
	public Date(String month, int day) {
		this.Month = month;
		this.day = day;
		this.year = 2020;
	}
	
	public void setMonth(String month) {
		this.Month = month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getMonth() {
		return Month;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getYear() {
		return year;
	}
	
	public String toString() {
		return Month + " " + day + ", " + year;
	}
	
	
	public boolean equals(Object obj) {
		Date d = (Date) obj;
		return this.Month.equals(d.Month) && this.day == d.day && this.year == d.year;
	}
	
	public void increaseYear() {
		year = year + 1;
	}
	
	public static void main(String[] args) {
		Date date = new Date("January", 11, 1900);
		
		System.out.println(date.toString());
		
		date.increaseYear();
		
		System.out.println(date.toString());
	}
	
	
}
