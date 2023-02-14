package array;

import java.util.Arrays;

public class P203 {

	public static void main(String[] args) {
		/*
		 * P.203 : 루프를 이용한 2차원 배열 사용하기
		 */
		int[][] arr = new int[5][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[4];
		arr[4] = new int[5];
		
		int num = 0; //계속 증가하는 값
		
		for (int i = 0; i < arr.length;i++) {
			int[] tempArr = arr[i];
			for (int j = 0; j < tempArr.length;j++) {
				tempArr[j] = ++num;
			}
		}
		//for each 배열 안쪽의 내용물 확인
		for (int[] tempArr : arr) {
			System.out.println(Arrays.toString(tempArr));
		}
	}

}
