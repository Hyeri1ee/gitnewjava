package payable;

public class RentalPay implements IPayable{
	private float rentalFee;
	public float getMonthFee() {
		return rentalFee;
	}
	@Override
	public float getMonthPay() {
		// TODO Auto-generated method stub
		return 0;
	}
}
