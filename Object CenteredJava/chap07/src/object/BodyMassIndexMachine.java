package object;

public class BodyMassIndexMachine {
	
	public char getResult(float indexValue) {
		if (indexValue > 30) {
			return 'A'; //비만
		}
		else if (indexValue > 24) {
			return 'B'; //과체중
		}
		else if (indexValue > 20) {
			return 'C'; //정상
		}
		else if (indexValue >15) {
			return 'D'; //저체중
		}
		else if (indexValue > 13) {
			return 'E'; //마름
		}
		else if (indexValue > 10) {
			return 'F'; //영양실조
		}
		else {
			return 'G'; //소모증
		}
	}
	
	public float Calculate(float height, float weight) {
		//키의 제곱
		float hData = height * height;
		//몸무게를 나눈다.
		float result = weight/hData;
		//System.out.println("비만 지수를 구합니다.");
		return result;
		
	}

	public static void main(String[] args) {
		/*
		 * P.236 : 카우프 지수 구하기
		 */
		BodyMassIndexMachine m = new BodyMassIndexMachine();
		float h = 1.65F;
		float w = 46f;
		float index = m.Calculate(h,w);
		System.out.println("비만 지수 : "+index);
		System.out.println("건강지수 : "+m.getResult(index));
	}

}
