package object;

public class ReturnEx {

	public void test(int a) {
		if (a == 10) {
			System.out.println("a는 10");
			return; //아래쪽은 실행하지 않고 종료합니다.
		}
		if (a == 20) {
			System.out.println("a는 20");
			return;
		}
	}
	public static void main(String[] args) {
		/*
		 * P.232 : return 이라는 키워드 = 실행을 끝낼 때 사용합니다.
		 */
		ReturnEx ex = new ReturnEx();
		ex.test(10);
	}

}
