package chap14;

import java.util.Scanner;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		try {
			//숫자를 입력하는 부분
			System.out.println("x 값을 입력하세요.");
			x = sc.nextInt();
			System.out.println("y 값을 입력하세요.");
			y = sc.nextInt();
		}catch(Exception e) {
			String s = e.getMessage();
			System.out.println("예외가 발생하였습니다.");
			System.out.println(s);
		}
		//데이터를 처리하는 부분
		System.out.println("두 수의 합은 "+ (x+y));
	}

}
