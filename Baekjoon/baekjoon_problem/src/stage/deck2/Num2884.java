package stage.deck2;

import java.util.Scanner;

public class Num2884 {

	public static void main(String[] args) {
		/*
		 * 백준 번호 : 2884
		 */
		Scanner sc = new Scanner(System.in);
		//시,분 값 입력
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		//최종 출력 시,분 값
		int finalHour;
		int finalMinute;
		int gap = 45-minute;
		//최종 출력 시,분 값 계산
		if (minute >= 45) {
			finalHour = hour;
			finalMinute = minute - 45;
		}
		else if (hour != 0){
			finalHour = hour - 1;
			finalMinute = 60 - gap;
		}
		else {
			//hour == 0 인 경우
			finalHour = 23;
			finalMinute = 60 - gap;
		}
			
		System.out.println(finalHour);
		System.out.println(finalMinute);
			
	}

}
