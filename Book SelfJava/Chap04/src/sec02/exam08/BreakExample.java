package sec02.exam08;

public class BreakExample {

	public static void main(String[] args) {
		//break문은 가장 가까운 반복문만 종료함.
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if (num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
