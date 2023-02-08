package stage.deck4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num5597 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 백준 번호 : 5597
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[28];
		int[] arr2 = new int[30];
		int a[] = new int[2];
		int num = 0;
		
		for (int i = 0; i<28;i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		for (int i = 0; i<30;i++) {
			arr2[i] = i+1;
		}
		//없는 2가지 값 찾아내기
		for (int i = 0;i<28;i++) {
			for (int j = 0; j<28;j++) {
				if (arr[i] == arr2[j])
					arr2[j] = 0;
			}
		}
		for (int i = 0; i<30; i++) {
			if (arr2[i] != 0 && arr2[i] != 29 && arr2[i] !=30) {
				System.out.print(arr2[i]); //결과 출력
				if (num == 0)
					System.out.println();
			}
				
		}
		
	}

}
