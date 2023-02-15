package makecClass;

public class EmployeeDAO {
	//<가공된 재료 보관>
	//EmployeeDAO 객체 : 데이터를 보관하는 객체
	private Employee[] arr = new Employee[100];
	private int index = 0;
	public boolean addNewEmployee(Employee newEmp) {
		//배열에 모든 데이터가 차면 99번까지 데이터가 꽉 찬 상태 , 들어갈 수 없으면 false를 반환
		boolean result = false;
		if (index >= arr.length - 1) {
			return false;
		}
		arr[index] = newEmp;
		index++;
		result = true;
		System.out.println("디버그 : DAO 처리 결과"+result);
		return result;
	}

}
