package time;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time2 {
	public static void main(String[] args) {
		//방법 1
		Calendar call = Calendar.getInstance();
//		System.out.println(call);
		int year = call.get(Calendar.YEAR);
		System.out.println(year);
//		//방법 2
//		Calendar cal2 = new GregorianCalendar();
//		System.out.println(cal2);
		int day = call.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
	}
}
