package chap11;

public class InstantCook implements BurgerCook{

	@Override
	public void makeBurger() {
		// TODO Auto-generated method stub
		System.out.println("냉동 햄버거");
	}

	@Override
	public void makeSalad() {
		// TODO Auto-generated method stub
		System.out.println("냉동 샐러드");
	}
	public static void main(String[] args) {
		BurgerCook cook = new HotelCook();
		cook.makeBurger();
		cook.makeSalad();
	}
}
