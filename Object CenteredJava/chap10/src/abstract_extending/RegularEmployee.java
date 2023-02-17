package abstract_extending;

public class RegularEmployee extends Employee {
	private int bonus;
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno,name,pay);
		this.bonus = bonus;
	}
	@Override
	public double getMonthPay() {
		
		return (pay/(double)12) + (bonus/(double)12);
	}

}
