package stringBuffers;

public class SpeedCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String 이용 계산
//		String str = "A";
//		String target = "B";
//		//루프를 돌기 전에 현재 시각
//		long start = System.currentTimeMillis();
//		
//		for (int i = 0; i < 90000; i++) {
//			str = str +target;
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
		
		//StringBuilder 이용 계산
		StringBuilder str = new StringBuilder("A");
		String target = "B";
		//루프를 돌기 전에 현재 시각
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 90000; i++) {
			str.append(target);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
