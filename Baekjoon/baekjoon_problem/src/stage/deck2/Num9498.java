package stage.deck2;

import java.util.Scanner;

public class Num9498 {

	public static void main(String[] args) {
		/*
		 * 백준 문제 9498번
		 */
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char result;
		if (score >= 90)
			result = 'A';
		else if (score >=80 && score <90)
			result ='B';
		else if (score >=70 && score <80)
			result ='C';
		else if (score >=60 && score <70)
			result = 'D';
		else
			result = 'F';
		System.out.println(result);
	}

}
