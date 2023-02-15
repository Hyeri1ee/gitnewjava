package object;

public class Shape {
	private char type;
	private int width;
	private int height;
	
	public Shape(char t, int w, int h) {
		this.type = t; //this : 이 코드를 실행하는 객체의 인스턴스 변수로 삼겠다는 뜻
		this.width = w;
		this.height = h;
	}
	
	public float getArea() {
		float area = 0F;
		if (type == 't') {
			area = (width * height) / (float)2;
		}
		return area;
	}
}
