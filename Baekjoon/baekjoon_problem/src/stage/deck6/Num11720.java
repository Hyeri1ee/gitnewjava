package stage.deck6;

import java.util.Scanner;

public class Num11720 {

	public static void main(String[] args) {
		/*
		 * 백준 번호 : 11720
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		String t = sc.nextLine();
		String s = sc.nextLine();
		String[] arr = s.split("");
		int[] a = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			a[i] = Integer.parseInt(arr[i]);
			sum += a[i];
		}
		System.out.println(sum);
		
	}

}
