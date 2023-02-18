package chap11;

public class TonyMp3 implements MyMp3{

	@Override
	public void playMp3() {
		// TODO Auto-generated method stub
		System.out.println("Tony 제품은 mp3 지원");
	}

	@Override
	public void listenFM() {
		// TODO Auto-generated method stub
		System.out.println("Tony 제품은 FM 수신 가능");	}

	@Override
	public void viewPhoto() {
		// TODO Auto-generated method stub
		System.out.println("Tony 제품은 이미지 뷰어 제공");
	}
	
}
