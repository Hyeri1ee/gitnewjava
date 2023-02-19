package chap11;

public class BurgerClerk {
	private BurgerCook cook = new HotelCook();
	
	public void orderBurger() {
		System.out.println("주방에 햄버거를 주문합니다.");
		cook.makeBurger();
	}
	public void orderSalad() {
		System.out.println("주방에 샐러드를 주문합니다.");
		cook.makeSalad();
	}
}
