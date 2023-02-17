package extending3;

public class Transportation {
	public void go() {
		System.out.println("알아서 값니다.");
	}
	public void goBusan(Transportation t) {
		t.go();
	}
	public static void main(String[] args) {
		Transportation s = new Transportation();
		s.goBusan(new Bus());
		s.goBusan(new Train());
	}
}
