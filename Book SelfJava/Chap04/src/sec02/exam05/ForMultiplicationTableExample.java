package sec02.exam05;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		//구구단을 출력하는 코드
		for (int m=2; m<=9; m++) {
			System.out.println("***"+m+"단***");
			for (int n=1; n<=9; n++) {
				System.out.println(m+"x"+n+" = "+(m*n));
			}
			System.out.println();
		}

	}

}
