package classes;

import java.text.DecimalFormat;
import java.util.Arrays;

public class NumberFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#000.00#");
		
		double[] arr = {1.23,3.33,44.456,178};
		String[] arr2 = new String[4];
		
		for (int i = 0; i < arr.length;i++) {
			arr2[i] = df.format(arr[i]);
		}
		System.out.println(Arrays.toString(arr2));
	}

}
