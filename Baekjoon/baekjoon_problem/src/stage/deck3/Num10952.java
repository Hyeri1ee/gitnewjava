package stage.deck3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num10952 {

	public static void main(String[] args) throws IOException {
		/*
		 * 백준 번호 :  10952
		 */
		String result = "";
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a == 0 && b == 0)
				break;
			result +=(a+b)+"\n"; //배열 대신 String에 첨가하기
		}
		System.out.println(result);
		
	}

}
