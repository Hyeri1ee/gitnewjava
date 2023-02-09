package stage.deck5;

import java.util.Scanner;

public class Num15596 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * 백준 번호 : 15596
		 */
		int n = sc.nextInt();
		int a[] = new int[n];
		long result = sum(a,n);
		System.out.println(result);
	}

	private static long sum(int[] a,int n) {
		int all = 0;
		for (int i = 0; i<n;i++) {
			a[i] = sc.nextInt();
			all += a[i];
		}
		return all;
	}

}
