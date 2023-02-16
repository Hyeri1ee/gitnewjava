package extending;

public class OpticalMouse extends WheelMouse {
	public void clickLeft() {
		System.out.println("광센서로 왼쪽 클릭");
	}
	public void clickRight() {
		System.out.println("광센서로 오른쪽 클릭");
	}
}
