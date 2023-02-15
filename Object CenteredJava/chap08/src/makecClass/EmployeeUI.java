package makecClass;

import java.util.Scanner;

public class EmployeeUI {
	//<화면>
	//EmployeeUI 객체 : 사용자가 볼 수 있는 화면 제공
	private Scanner scanner = new Scanner(System.in);
	private EmployeeService service = new EmployeeService(); //EmployeeUI 객체는 EmployeeService 객체의 리모컨이 필요
	 
	public void regist() {
		System.out.println("신규 인사정보를 등록합니다.");
		System.out.println("이름을 입력하세요.");
		String name = scanner.nextLine();
		System.out.println("사번을 입력하세요.");
		String sabun = scanner.nextLine();
		System.out.println("주민번호를 넣어주세요.");
		String ssn = scanner.nextLine();
		System.out.println("입력하신 정보는 다음과 같습니다.");
		System.out.println(name+" : "+sabun+" : "+ssn);
		
		Employee emp = new Employee(sabun,name,ssn);
		boolean addResult = service.add(emp);
		System.out.println("서비스에서 처리된 결과 : "+addResult);
	}
	public static void main(String[] args) {
		EmployeeUI ui = new EmployeeUI();
		ui.regist();
	}
}
