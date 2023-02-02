package stage.deck1;

import java.util.Scanner;

public class Num2588 {

	public static void main(String[] args) {
		/*
		 * 백준 문제 2588번
		 */
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		int a = number2 / 100;
		int b = (number2 % 100) / 10;
		int c = number2 % 10;
		
		int number3 = number1 * c;
		int number4 = number1 * b;
		int number5 = number1 * a;
		int number6 = number1 * number2;
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		System.out.println(number6);

	}

}
