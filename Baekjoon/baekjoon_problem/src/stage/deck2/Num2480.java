package stage.deck2;

import java.util.Scanner;

public class Num2480 {

	public static void main(String[] args) {
		/*
		 * 백준 번호 : 2480
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] n = new int[6];
		int num;
		int result=0;
		for (int i=0; i<3;i++) {
			num = sc.nextInt();
			switch (num) {
			case 1:
				n[0]++;//1의 개수
				break;
			case 2:
				n[1]++;//2의 개수
				break;
			case 3:
				n[2]++;//3의 개수
				break;
			case 4:
				n[3]++;//4의 개수
				break;
			case 5:
				n[4]++;//5의 개수
				break;
			case 6:
				n[5]++;//6의 개수
				break;
			default:
				break;
			}
		}
		//최댓값 정하기
		int maxInt = makeresult(n);
		
		for (int i=0 ; i<6;i++) {
			if (n[i] == 3) {
				result = 10000+(i+1)*1000;
				break;
			}
			else if (n[i] == 2) {
				result = 1000+(i+1)*100;
				break;
			}
			//여기 수정해야함
			else if (n[i] !=0) {
				result = maxInt * 100;
				break;
			}
		}
		
		System.out.println(result);
		
		
	}

	//여기 수정해야함
	private static int makeresult(int[] n) {
		int max =0;
		int result;
		for (int i = 0; i<n.length;i++) {
			if (n[i] != 0) {
				max = n[i];
			}
		}
		return max;
	}

}
