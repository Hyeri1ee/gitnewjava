package sec02.exam03;

public class ForSumFromTo100Example2 {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0;
		for (i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("1~"+(i-1)+"합 : "+sum);

	}

}
