package classes;

import java.util.Scanner;

public class ScannerTest1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = s.nextInt();
		s.nextLine();//있어야함.
		System.out.println("문자를 입력하세요.");
		String str = s.nextLine();
		System.out.println("숫자 : "+num);
		System.out.println("문자 : "+str);
	}
}
