package array;

public class P191 {

	public static void main(String[] args) {
		/*
		 * P.191 : 배열의 변수는 리모컨입니다.
		 */
		int[] arr = {100,82,73,64,55,10};
		int[] arr2 = arr;
		int[] arr3 = arr;
		
		
		System.out.println("arr : "+arr);
		System.out.println("arr2 : "+arr2);
		System.out.println("arr3 : "+arr3);

	}

}
