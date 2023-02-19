package chap11;

public class Phone3G1 implements VoiceCall, VisualCall{

	@Override
	public void sendVisualMsg() {
		// TODO Auto-generated method stub
		System.out.println("영상 보기");
	}

	@Override
	public void getVisualMsg() {
		// TODO Auto-generated method stub
		System.out.println("영상 보내기");
	}

	@Override
	public void sendVoiceMsg() {
		// TODO Auto-generated method stub
		System.out.println("음성 메시지 보내기");
	}

	@Override
	public void getVoiceMsg() {
		// TODO Auto-generated method stub
		System.out.println("음성 메시지 듣기");
	}
	//PhoneTest
	public static void main(String[] args) {
		Phone3G1 phone = new Phone3G1(); //시스템이 유연해짐.
		VisualCall v1 = new Phone3G1();
		VoiceCall v2 = new Phone3G1();
	}

}
