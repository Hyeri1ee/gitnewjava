package object;

public class BokBulBokTest {

	public static void main(String[] args) {
		/*
		 * 복불복의 테스트를 위한 main메소드
		 */
		BokBulBok bok = new BokBulBok();
		//복불복 기계 안에 준비작업
		bok.ready();
		
		//결과 확인
		for (int i = 0 ; i<10; i++) {
			char result = bok.selectOne();
			System.out.println(i+"번째 :"+result);
		}
	}

}
