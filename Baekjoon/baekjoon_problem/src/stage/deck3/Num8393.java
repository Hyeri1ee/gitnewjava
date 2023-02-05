package stage.deck3;

import java.util.Scanner;

public class Num8393 {

	public static void main(String[] args) {
		/*
		 * 백준 번호 : 8393
		 */
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i<= n ; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
