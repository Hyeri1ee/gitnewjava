package sec02.exam09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		System.arraycopy(oldStrArray, 0, newStrArray, 1, oldStrArray.length);
		for (int i=0; i<newStrArray.length;i++) {
			System.out.print(newStrArray[i]+",");
		}
		//System.out.println(oldStrArray[0] == newStrArray[1]); 
		/*
		 참조 타입 배열이 복사되면, 복사되는 값이 객체의 번지이므로, 새 배열의 항목은 이전 배열의 항목이 참조하는 객체와 동일
		 */
	}

}
