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
		for (int i = 1; i< num + 1;i++) {
			for (int j = num; j > 0;j--) {
				if (i<j) {
					System.out.print(" ");
				}else {
					System.out.print(c);
				}
				
			}
			System.out.println("");
		}
		sc.close();
	}

}
