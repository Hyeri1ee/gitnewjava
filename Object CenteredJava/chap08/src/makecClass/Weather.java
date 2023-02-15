package makecClass;

public class Weather {
	/*
	 * P.320 :객체 만들기 예시 1
	 */
	private int year;
	private int month;
	private int date;
	private double min;
	private double max;
	public Weather(int year, int month, int date, double min, double max) {
		this.year = year;
		this.month = month;
		this.date = date;
		this.min = min;
		this.max = max;
	}
	public double getAvg() {
		return (min + max)/2;
	}
	
}
