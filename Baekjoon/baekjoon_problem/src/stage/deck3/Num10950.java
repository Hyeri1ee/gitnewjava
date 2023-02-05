package stage.deck3;

import java.util.Scanner;

public class Num10950 {

	public static void main(String[] args) {
		/*
		 * 백준 번호 : 10950
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[2];
		int[] result = new int[n];
		for (int i = 0; i < n;i++) {
			a[0] = sc.nextInt();
			a[1] = sc.nextInt();
			result[i] = a[0]+a[1];
		}
		for (int intnum : result) {
			System.out.println(intnum);
		}
	}

}
