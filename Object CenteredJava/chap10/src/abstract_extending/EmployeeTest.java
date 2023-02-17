package abstract_extending;

public class EmployeeTest {

	public static void printPay(Employee emp) {
		System.out.println("=====================");
		System.out.println(emp);
		System.out.println("---------------------");
		System.out.println(emp.getMonthPay());
		System.out.println("---------------------");
		
	}
	public static void main(String[] args) {
		Employee[] emps = new Employee[4];
		emps[0] = new RegularEmployee("E001","이길동",3000,500);
		emps[1] = new TempEmployee("E002","김기동",4000);
		emps[2] = new PartTimeEmployee("E003","황진이",5,10);
		emps[3] = new PartTimeEmployee("E004","미진이",10,7);
		
		for(int i = 0; i<emps.length;i++) {
			printPay(emps[i]);
		}
	}

}
