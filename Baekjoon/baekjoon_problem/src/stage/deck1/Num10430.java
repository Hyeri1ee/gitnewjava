package stage.deck1;

import java.util.Scanner;

public class Num10430 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int q = (a+b)%c;
		int w = ((a%c)+(b%c)) %c;
		int e = (a*b)%c;
		int r = ((a%c)*(b%c)) %c;
		System.out.println(q);
		System.out.println(w);
		System.out.println(e);
		System.out.println(r);
		
		sc.close();
	}

}
