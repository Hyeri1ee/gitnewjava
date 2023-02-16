package extending;

public class SeoulZaZangRu extends ZaZangRu {
	public void makeZamBong() {
		System.out.println("짬뽕을 만들 수 있습니다.");
	}
	public void makeZaZang() {
		System.out.println("돼지고기와 식물성 기름을 사용합니다.");
		System.out.println("현대식 자장면을 만듭니다.");
	}
	public void makeOldZaZang() {
		super.makeZaZang();
	}
	public static void main(String[] args) {
		SeoulZaZangRu sz = new SeoulZaZangRu();
		sz.makeZaZang();
		sz.makeOldZaZang();
		//sz.makeZamBong();
	}

}
