package object;

public class FoodPrice {
	/*
	 * P.308 : 사용자의 정의 생성자가 두 개인 FoodPrice 갳게
	 */
	private int menuPrice;
	private int quantity;
	
	public FoodPrice(int menuPrice) {
		this(menuPrice,1); //this() : 생성자 중에서 파라미터를 두 개 받는 생성자를 찾아서 행하라는 뜻
	}

	public FoodPrice(int menuPrice, int quantity) {
		this.menuPrice = menuPrice;
		this.quantity = quantity;
	}
	
	public int getTotalPrice() {
		return menuPrice * quantity;
	}
	
	

}
