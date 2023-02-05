package stage.deck3;

import java.util.Scanner;

public class Num2739 {

	public static void main(String[] args) {
		/*
		 * 백준 번호 : 2739
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1;i < 10;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}

}
