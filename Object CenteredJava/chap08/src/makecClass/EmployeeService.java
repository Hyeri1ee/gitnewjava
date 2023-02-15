package makecClass;

public class EmployeeService {
	//<요리사>
	//EmployeeService 객체 : 데이터를 가지고 처리하는 객체(비즈니스 객체)
	private EmployeeDAO dao = new EmployeeDAO(); //EmployeeService 객체는 EmployeeDAO 객체의 리모컨이 필요
	public boolean add (Employee emp) {
		System.out.println("신규 인사정보를 추가하는 기능 테스트");
		System.out.println(emp.getName());
		System.out.println(emp.getSabun());
		System.out.println(emp.getSsn());
		System.out.println("디버그 : 서비스 객체에서 DAO 객체에게 처리를 위임");
		boolean daoResult = dao.addNewEmployee(emp);
		return daoResult;
	}
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		Employee newEmp = new Employee("123","이혜리","2023-111");
		service.add(newEmp);

	}
}
