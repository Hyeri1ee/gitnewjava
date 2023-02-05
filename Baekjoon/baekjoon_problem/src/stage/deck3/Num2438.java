package stage.deck3;

import java.util.Scanner;

public class Num2438 {

	public static void main(String[] args) {
		/*
		 * 백준 번호 : 2438
		 */
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		char c = '*';
		for (int i = num;i>=0;i--) {
			for (int j = 0; j<i;j++) {
				System.out.print(" ");
				
			}
			System.out.println("");
		}
		sc.close();
	}

}
