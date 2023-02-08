package stage.deck4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 백준 번호 : 2562
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int max = 0;
		//9개의 자연수 입력받기 & max 값 결정
		for (int i = 0; i<9;i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			if (max <= arr[i])
				max = arr[i];
		}
		
		//x값 결정
		int x = 0;
		for (int i = 0; i<9;i++) {
			if (max == arr[i])
				x = i+1;
		}
		
		//결과 출력
		System.out.println(max+"\n"+x);
	}

}
