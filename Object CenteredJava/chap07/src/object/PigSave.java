package object;

public class PigSave {
	
	private int total;
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void deposit(int amount) {
		System.out.println("저금통 입금");
		total = total + amount;
	}
	public void withdraw() {
		System.out.println("저금통 배 따기");
	}


}
