package makecClass;

public class WeatherTest {

	public static void main(String[] args) {
		//Weather class 테스트 main 메소드
		Weather wl = new Weather(2010,1,20,-12,-2);
		double wlavg = wl.getAvg();
		System.out.println(wlavg);
	}

}
