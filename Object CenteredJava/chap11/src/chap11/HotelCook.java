package chap11;

public class HotelCook implements BurgerCook{

	@Override
	public void makeBurger() {
		// TODO Auto-generated method stub
		System.out.println("5성급 호텔 주방장의 햄버거");
	}

	@Override
	public void makeSalad() {
		// TODO Auto-generated method stub
		System.out.println("호텔급 샐러드");
	}

}
