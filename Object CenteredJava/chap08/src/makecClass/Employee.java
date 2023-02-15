package makecClass;

public class Employee {
	//<재료>
	//Employee 객체 : 데이터가 주가 되는 객체
	private String sabun;
	private String name;
	private String ssn;
	public Employee(String sabun, String name) {
		this (sabun,name,"unknown");
	}
	public Employee(String sabun, String name, String ssn) {
		this.sabun = sabun;
		this.name = name;
		this.ssn = ssn;
	}
	public String getSabun() {
		return sabun;
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	
	
}
