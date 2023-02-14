package object;

public class SumMachine {

	public void makeSum() {
		int start = 0;
		int end = 100;
		int sum = 0;
		
		for (int i = 0; i<=end;i++) {
			sum = sum + i;
		}
		
		System.out.println("시작값 : "+start);
		System.out.println("종료값 : "+end);
		System.out.println("총 합 : "+sum);
	}
	
	public void makeSum(int startValue, int endValue) {
		int start = startValue;
		int end = endValue;
		int sum = 0;
		for (int i = start ; i <= end; i++) {
			sum = sum + i;
		}
		System.out.println("시작값 : "+start);
		System.out.println("종료값 : "+end);
		System.out.println("총 합 : "+sum);
	}
	public static void main(String[] args) {
		/*
		 * P.216 : SumMachine 구현
		 */
		SumMachine m = new SumMachine();
		m.makeSum(1,100);
		m.makeSum(20,200);
		m.makeSum(30,300);
		
	}

}
