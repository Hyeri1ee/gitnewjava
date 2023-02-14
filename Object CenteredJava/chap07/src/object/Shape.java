package object;

public class Shape {
	private char type;
	private int width;
	private int height;
	
	public Shape(char t, int w, int h) {
		type = t;
		width = w;
		height = h;
	}
	
	public float getArea() {
		float area = 0F;
		if (type == 't') {
			area = (width * height) / (float)2;
		}
		return area;
	}
}
