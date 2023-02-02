package stage.deck2;

import java.util.Scanner;

public class Num14681 {

	public static void main(String[] args) {
		/*
		 * 백준 번호 : 14681
		 */
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result;
		if (x*y > 0)
			if (y > 0)
				result = 1;
			else
				result = 3;
		else
			if (y > 0)
				result = 2;
			else
				result = 4;
		
		System.out.println(result);
	}

}
