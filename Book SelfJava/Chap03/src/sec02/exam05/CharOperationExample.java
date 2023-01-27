package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 ='A'+1;
		char c2 = 'A';
		//char c3 = c2 +1; char 변수가 산술 연산에 사용되면 int 타입으로 변환되므로 연산 결과는 int타입이 됨
		int c3 = c1 + 1;
		System.out.println("c1: "+c1);
		System.out.println("c2: "+c2);
		System.out.println("c3: "+(char) c3);

	}

}
