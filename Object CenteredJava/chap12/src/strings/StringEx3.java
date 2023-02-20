package strings;

import java.util.Arrays;

public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1 = "AAA";
//		String str2 ="BBB";
//		String str3 = str1 + str2; //더하기가 바로 결합
//		String str4 = str1.concat(str2);
//		System.out.println(str3);
//		System.out.println(str4);
		
//		String str = "abcde";
//		char ch0 = str.charAt(2);
//		System.out.println(ch0);
		
//		String str = "ABCDE";
//		int idx1 = str.indexOf("BCD");
//		System.out.println(idx1);
		
//		String str ="ABCDEFG";
//		String sub1 = str.substring(2);
//		System.out.println(sub1);
//		String sub2 = str.substring(3,5);
//		System.out.println(sub2);
		
//		String str1 = String.valueOf(10); //기본 자료형을 문자열로 변경
//		System.out.println(str1);
		
		//String : char[] 혹은 byte[] 로 변경 가능
		String str ="한글은";
		char[] arr1 = str.toCharArray();
		byte[] arr2 = str.getBytes();
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
				
	}

}
