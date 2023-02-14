package array;

import java.util.Arrays;

public class P204 {

	public static void main(String[] args) {
		/*
		 * P.204 : 간편한 배열 복사
		 */
		int[] arr = {1,2,3,4,5};
		int[] temp = {1,2,0,0,0};
		
		System.arraycopy(arr, 2, temp, 2, 3);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
	}

}
