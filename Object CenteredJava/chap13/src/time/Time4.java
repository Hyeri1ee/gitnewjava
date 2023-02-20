package time;

import java.util.Calendar;
import java.util.Date;

public class Time4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2023);
		cal.set(Calendar.MONTH, 1);//2월
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println("2023년 2월의 마지막 날 : "+lastDay);
		System.out.println();
		
		Date d1 = new Date();
		System.out.println(d1);
	}

}
