package stage.deck4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num10871 {

	public static void main(String[] args) throws IOException {
		/*
		 * 백준 번호 : 10871
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//첫째줄 입력
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken()); //x보다 작은 수
		
		//둘째줄 입력
		String k = bf.readLine();
		String arr[] = k.split(" ");
		
		//x보다 작은 수 판별
		String result="";
		for (int i = 0; i<n;i++) {
			if (Integer.parseInt(arr[i]) < x) {
				result += Integer.parseInt(arr[i]);
				result += " ";
			}
		}
		
		//출력
		System.out.println(result);
	}

}
