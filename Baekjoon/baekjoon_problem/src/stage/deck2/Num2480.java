package stage.deck2;

import java.util.Scanner;

public class Num2480 {

	public static void main(String[] args) {
		/*
		 * 백준 번호 : 2480
		 */
		//scanner 이용
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result;
		
		if (a==b && b==c) {
			result = 10000 + a*1000;
		}else if ( (a==b && b!=c) || (a==c && b!=c) || (b==c && b!=a) ){
			if (a == b)
				result = 1000 + a*100;
			else if (b == c)
				result = 1000 + b*100;
			else //a == c
				result = 1000 + c*100;
		}else //세 수 모두 다른 눈이 나온 경우
		{
			result = whatismax(a,b,c)*100;
		}
		
		//결과 출력
		System.out.println(result);
	}

	private static int whatismax(int a, int b, int c) {
		//세 수 중 가장 큰 수를 리턴하는 함수
		int max = 0;
		
		if (a >= b)
			max = a;
		else
			max = b;
		
		if (max >= c)
			return max;
		else
			return c;
	}

}
