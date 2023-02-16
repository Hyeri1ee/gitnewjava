package keyword;

public class OrderUtil {
	 //static이 붙으면 공유
	private static int count = 0;
	public void pressButton() {
		count++;
		System.out.println("고객님의 번호는"+count+"입니다.");
	}
	public static void main(String[] args) {
		 OrderUtil u1 = new OrderUtil();
		 OrderUtil u2 = new OrderUtil();
		 u1.pressButton();
		 u2.pressButton();
	}

}
