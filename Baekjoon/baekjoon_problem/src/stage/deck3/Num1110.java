package stage.deck3;

import java.util.Scanner;

public class Num1110 {

	public static void main(String[] args) {
		/*
		 * 백준 번호 : 1110
		 * <더하기 사이클>
		 * ex1) 26 / 2+6=8 : 68 / 6+8=14 : 84 / 8+4=12 : 42 / 4+2=6 : 26 =>사이클 4
		 */
		//수 입력 받기
		//십의 자릿수, 일의 자릿수 분리 후 더하기 (결과값이 10미만인 경우)
		//사이클 값 증가
		//십의 자릿수, 일의 자릿수 분리 후 더하기 (결과값이 10이상인 경우)
		//같아질때까지 사이클 값 증가
		Scanner sc = new Scanner(System.in);
		//수 입력받기
		int n = sc.nextInt();
		int s = n;
		int cycleNum = 0;
		n = splitandplus1(n); //새로운 수 만들기
		cycleNum++;
		
		while(true) {
			n = splitandplus1(n); //새로운 수 만들기
			cycleNum++; //사이클 값 증가
			if (s == n)
				break;
			
		}
		System.out.println(cycleNum);
		sc.close();
		
	}

	private static int splitandplus1(int n) {
		int tenplace = n/10;
		int oneplace = n%10;
		int result = tenplace + oneplace;
		return (result%10) + oneplace;
		
	}

}
