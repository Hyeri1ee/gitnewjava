package extending;

public class MouseTest {

	public static void main(String[] args) {
		Mouse m = new Mouse();
		m.clickLeft();
		m.clickRight();
		System.out.println("---------------------");
		WheelMouse wm = new WheelMouse();
		wm.clickLeft();
		wm.clickRight();
		wm.Scroll();
	}

}
