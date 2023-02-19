package payable;

public class PayTest {

	public static void main(String[] args) { //인터페이스 타입으로 여러 종류의 객체를 한 번에 처리.
		// TODO Auto-generated method stub
		IPayable[] arr = new IPayable[4];
		arr[0] = new RegularWorker();
		arr[1] = new ContractWorker();
		arr[2] = new PartTimer();
		arr[3] = new RentalPay();
	}

}
