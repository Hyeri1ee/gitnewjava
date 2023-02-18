package chap11;

public class BppleMp3 implements MyMp3{

	@Override
	public void playMp3() {
		// TODO Auto-generated method stub
		System.out.println("Bpple 제품은 mp3 가능");
	}

	@Override
	public void listenFM() {
		// TODO Auto-generated method stub
		System.out.println("Bpple 제품은 FM 일부 가능");
	}

	@Override
	public void viewPhoto() {
		// TODO Auto-generated method stub
		System.out.println("Bpple 제품은 사진 보기 가능");
	}
	public static void main(String[] args) {
		MyMp3 mp3 = new TonyMp3();
		mp3.listenFM();
		mp3.viewPhoto();
		mp3.playMp3();
	}

}
