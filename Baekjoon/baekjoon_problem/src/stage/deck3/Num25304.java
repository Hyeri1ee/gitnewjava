package stage.deck3;

import java.util.Scanner;

public class Num25304 {

	public static void main(String[] args) {
		/*
		 * 백준 번호 : 25304
		 */
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int result = 0;
		int num = sc.nextInt();
		int[] a = new int[2*num];
		
		
		for (int i = 0; i<2*num; i++) {
			a[i] = sc.nextInt();
			//System.out.println("a["+i+"] : "+a[i]);
		}
		for (int i = 0; i<2*num;i+=2) {
			result += a[i] * a[i+1];
//			System.out.println(result);
		}
//		System.out.println(result);
		//결과 출력
		if (result == total)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
