package makecClass;

import java.util.Scanner;

public class Calculator2UI {
	/*
	 * Calculator UI
	 */
	//Calculator2UI 객체가 Calculator2 객체를 사용하기 위해 인스턴스변수로 객체 생성
	private Calculator2 cal = new Calculator2();
	
	public void getInput() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요.");
		int first = scanner.nextInt();
		
		System.out.println("연산 기호를 입력하세요.");
		char oper = scanner.next().charAt(0);
		
		System.out.println("두 번째 숫자를 입력하세요.");
		int second = scanner.nextInt();
		
		System.out.println("처음 입력: "+first);
		System.out.println("연산 기호: "+oper);
		System.out.println("두 번째 입력: "+second);
		
		//Calculator 객체에게 일을 의뢰한다.
		double result = cal.calculate(first, second, oper);
		
		System.out.println("계산된 결과는 : "+result+"입니다.");
		
	}
	public static void main(String[] args) {
		Calculator2UI ui = new Calculator2UI();
		ui.getInput();
	}
}
