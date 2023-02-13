package array;

import java.util.Arrays;
import java.util.Scanner;

public class P193 {

	public static void main(String[] args) {
		/*
		 * P.193 : 점수 계산을 위한 프로그램
		 */
		Scanner scanner = new Scanner(System.in);
		int[] grades = new int[5];
		
		for (int i = 0; i < grades.length; i++) {
			System.out.println(i+ "  성적 점수를 넣어주세요.");
			int userInput = scanner.nextInt();
			grades[i] = userInput;
		}
		//배열 안에 있는 내용을 확인하고 싶을 때
		System.out.println("처리할 점수들은 다음과 같습니다.");
		System.out.println(Arrays.toString(grades));
		//평균점수를 구한다.
		int sum = 0;
		for (int i = 0; i<grades.length;i++) {
			sum += grades[i];
		}
		System.out.println("평균 : "+sum/(float)grades.length);
		//최고점수를 구한다.
		int max = 0;
		for (int i=0; i<grades.length;i++) {
			if (grades[i]>max)
				max = grades[i];
		}
		System.out.println("최고 점수 : "+max);
		//최저점수를 구한다.
		int min = 1000;
		for (int i=0; i<grades.length;i++) {
			if (grades[i]<min)
				min = grades[i];
		}
		System.out.println("최저 점수 : "+min);
		
		
	}

}
