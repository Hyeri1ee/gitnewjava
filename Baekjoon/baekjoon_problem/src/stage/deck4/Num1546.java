package stage.deck4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1546 {

	public static void main(String[] args) throws IOException {
		/*
		 * 백준 번호 : 1546
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String s = bf.readLine();
		String arr[] = s.split(" ");
		int arr2[] = new int[n]; 
		double arr3[] = new double[n];
		double max=0;
		double sum = 0;
		//최고점 찾기
		for (int i = 0; i<n;i++) {
			arr2[i] = Integer.parseInt(arr[i]);
			if (max <= arr2[i])
				max = arr2[i];
		}
		//과목 조정하기
		for (int i = 0; i< n;i++) {
			arr3[i] =(arr2[i]/(max*1.000))*100;
			sum += arr3[i];
		}
		System.out.println((double)Math.round(sum/n*1000)/1000);
		
		
	}

}
