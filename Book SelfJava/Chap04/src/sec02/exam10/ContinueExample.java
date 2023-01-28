package sec02.exam10;

public class ContinueExample {

	public static void main(String[] args) {
		//짝수만 출력하는 코드
		for (int i=1; i<=30; i++) {
			if (i%2 != 0) {
				continue;//조건식으로 돌아감
			}
			System.out.println(i);
		}

	}

}
