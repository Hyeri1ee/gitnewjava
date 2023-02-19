package payable;

public class PartTimer implements IPayable{
	private int days;
	private float pay;
	public float getMonthPay() {
		return days * pay;
	}
}
