package abstract_extending;

public class TempEmployee extends Employee {
	//고용기간
	private int hireYear;
	public TempEmployee(String empno, String name, int pay) {
		super(empno,name,pay);
		this.hireYear = hireYear;
	}
	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return pay/(double)12;
	}

}
