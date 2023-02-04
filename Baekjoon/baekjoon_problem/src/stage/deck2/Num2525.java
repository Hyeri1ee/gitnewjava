package stage.deck2;

import java.util.Scanner;

public class Num2525 {

	public static void main(String[] args) {
		/*
		 * 백준 번호 : 2525
		 * "오븐 시계"
		 */
		
		//next(),nextline() 차이
		//.split()
		//Integer.parseInt()
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		int a = Integer.parseInt(strArr[0]);
		int b = Integer.parseInt(strArr[1]);
		int c = sc.nextInt();
		
		int allMinute = a * 60 + b+c;
		int hour = allMinute / 60;
		int minute = allMinute % 60;
		if (hour >= 24) {
			hour -= 24;
		}
		System.out.println(hour + " " + minute);
	}

}
