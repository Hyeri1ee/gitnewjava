package classes;

import java.util.Random;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int value = rd.nextInt();
		int value2 = (int) (Math.random() * 10);
		System.out.println(value+" : "+value2);
	}

}
