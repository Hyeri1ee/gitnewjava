package stage.deck4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 백준 번호 : 10818
		 */
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String s = bf.readLine();
		String arr[] = s.split(" ");
		
		int max = Integer.parseInt(arr[0]);
		int min = Integer.parseInt(arr[0]);
		
		//max 판별
		for (int i = 0; i<n;i++) {
			if (Integer.parseInt(arr[i]) >= max)
				max = Integer.parseInt(arr[i]);
			else if (Integer.parseInt(arr[i]) <= min)
				min = Integer.parseInt(arr[i]);
		}
		System.out.print(min+" "+max);
	}

}
