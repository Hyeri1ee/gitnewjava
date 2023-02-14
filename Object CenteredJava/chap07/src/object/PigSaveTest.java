package object;

public class PigSaveTest {

	public static void main(String[] args) {
		/*
		 * P.255 : PigSave 프로그램
		 */
		PigSave save = new PigSave();
		save.deposit(100);
		save.deposit(500);
		int totalMoney = save.getTotal(); //get 메소드를 통한 접근
		System.out.println("총액 : "+totalMoney);
		//강제로 변경
		totalMoney = 10000;
		//PigSave도 변했을까?
		int afterMoney = save.getTotal();
		System.out.println("변경되었나?"+afterMoney);
		//변경 안됨 : '=' 은 깂을 복사하기 때문
		
		
	}

}
