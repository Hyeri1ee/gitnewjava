package stage.deck4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10807 {

	public static void main(String[] args) throws IOException {
		/*
		 * 백준 번호 : 10807
		 * 순서 : 
		 * 정수의 개수 입력받기
		 * 정수 공백 기준으로 잘라서 배열에 저장
		 * 찾으려고 하는 정수 입력받기
		 * for문으로 정수 개수 세기
		 * 출력
		 */
		
		//BufferedReader 와 Scanner를 같이 사용하면 런타임 에러가 남
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int whatNumber;
		int num = 0;
		
		String s = bf.readLine();
		String array[] = s.split(" ");
		whatNumber = Integer.parseInt(bf.readLine());
		for (int i = 0; i < n; i++) {
			if (whatNumber == Integer.parseInt(array[i]))
				num++;
		}
		System.out.println(num);
	}

}
