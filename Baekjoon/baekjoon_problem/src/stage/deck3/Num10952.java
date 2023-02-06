package stage.deck3;

import java.util.Scanner;

public class Num10952 {

	public static void main(String[] args) {
		/*
		 * 백준 번호 :  10952
		 */
		Scanner sc = new Scanner(System.in);
		String s;
		int[] a = new int[2];
		int[] b = new int[100];
		a[0] = 1;
		int i = 0;
		while (a[0]+a[1] != 0) {
			s = sc.nextLine();
			//a = Integer.parseUnsignedInt(s.split(" "));
			b[i] = a[0]+a[1];
			i++;
		}
		for (int j = 0;j < i ;j++) {
			System.out.println(b[j]);
		}
		
	}

}
