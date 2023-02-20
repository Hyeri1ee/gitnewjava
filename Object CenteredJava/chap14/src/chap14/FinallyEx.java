package chap14;

import java.util.Scanner;

public class FinallyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int value = 0;
		try {
			value = s.nextInt();
		}catch (Exception e){
			value = -1;
			e.printStackTrace();
		}finally {
			System.out.println("VALUE : "+value);
			
		}
	}

}
