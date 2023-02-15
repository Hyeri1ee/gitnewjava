package makecClass;

public class Calculator2 {
	/*
	 * P.324 : 계산기 클래스
	 */
	public double calculate(int a, int b, char oper) {
		double result = 0.0;
		if (oper == '+') {
			result = a + b;
		}else if (oper == '-') {
			result = a - b;
		}else if (oper == '*') {
			result = a*b;
		}else {
			result = a /b;
		}
		
		return result;
	}
}
