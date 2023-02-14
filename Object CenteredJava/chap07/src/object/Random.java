package object;

public class Random {

	public static void main(String[] args) {
		// Math.random()
		
		int n = (int) (Math.random()*10); //0~9 까지의 난수 발생 ex.7
		System.out.println(n);
		int k = (int) (Math.random()*45+1); //1~45까지의 난수 발생 ex.37
		System.out.println(k);
	}

}
