package stage.deck2;

import java.util.Scanner;

public class Num2753 {

	public static void main(String[] args) {
		/*
		 * 백준 번호 2753번
		 */
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int result;
		if (year % 4 == 0 && year % 100 != 0 )
			result = 1;
		else if (year % 400 ==0)
			result = 1;
		else 
			result = 0;
		System.out.println(result);
	}

}
