package object;

public class InternetData {

	/*
	 * P.310 : 객체가 생성되면서 어떤 메소듣를 호춫하게끔 하는 상황
	 */
	private String domain;

	public InternetData(String domain) {
		this.domain = domain;
		checkInternet();
	}
	
	private void checkInternet() {
		System.out.println("인터넷부터 확인합니다.");
	}
	
	//main
	public static void main(String[] args) {
		InternetData obj = new InternetData("http://www.google.com"); //객체 생성과 동시에 인터넷 연결 확인
		
	}
	
}

