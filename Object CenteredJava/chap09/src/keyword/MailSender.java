package keyword;

public class MailSender {
	//P.380 : 인스턴스 변수와 객체의 메소드를 이용한 방식
	private String destination = "aaa@aaa.co.kr";
	
	private boolean sendFlag =false;
	
	public void sendMail() {
		if (sendFlag == false) {
			System.out.println("메일을 전송합니다.");
			System.out.println("목적지 : "+destination);
			sendFlag = true;
		}else {
			System.out.println("메일을 이미 보냈습니다.");
		}
	}
}
