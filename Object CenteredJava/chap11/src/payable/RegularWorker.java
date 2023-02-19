package payable;

public class RegularWorker implements IPayable{
	private float yearSalary;
	public float getMonthSal() {
		return yearSalary/12;
	}
	@Override
	public float getMonthPay() {
		// TODO Auto-generated method stub
		return getMonthSal();
	}
}
