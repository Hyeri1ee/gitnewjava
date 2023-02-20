package classes;

import java.math.BigDecimal;

public class DecimalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double a = 10;
//		double b = 3;
//		System.out.println(a/b); //결과 : 3.3333333333333335
		
		BigDecimal ba = new BigDecimal(10);
		BigDecimal bb = new BigDecimal(3);
		BigDecimal result = ba.divide(bb,5,BigDecimal.ROUND_DOWN);
		System.out.println(result);
	}

}
