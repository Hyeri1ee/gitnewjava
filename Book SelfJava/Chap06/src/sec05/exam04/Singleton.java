package sec05.exam04;

public class Singleton {//싱글톤 설정
	private static Singleton singleton = new Singleton();
	private Singleton() {
		
	}
	static Singleton getInstance() {
		return singleton;
	}
}
