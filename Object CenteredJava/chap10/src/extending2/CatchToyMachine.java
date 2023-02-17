package extending2;

public class CatchToyMachine {
	private Toy[] toys;
	
	public CatchToyMachine() {
		toys = new Toy[10];
		for (int i = 0;i<toys.length;i++) {
			Toy toy = null;
			if (i%3 == 0) {
				toy = new Doll();
			}else if (i%3 == 1) {
				toy = new KeyHolder();
			}else if (i%3 == 2) {
				toy = new BubbleGum();
			}
			
			toys[i] = toy;
		}
	}
	public Toy catchToy() {
		Toy toy = null;
		//인형 뽑는 로직
		return toy;
	}
}
