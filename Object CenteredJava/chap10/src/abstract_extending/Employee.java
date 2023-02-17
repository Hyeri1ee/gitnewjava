package abstract_extending;

public abstract class Employee {
	protected String empno;
	protected String name;
	protected int pay;
	
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	public abstract double getMonthPay();
	public String toString() {
		return empno+" : "+name+" : "+" : "+pay;
	}
}
