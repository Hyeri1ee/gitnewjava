package extending2;

public class CatchToyMachine {
	private Toy[] toys;
	
	public CatchToyMachine() {
		toys = new Toy[10];
		for (int i = 0;i<toys.length;i++) {
			Toy toy = new Toy();
			toy.setName("인형"+i);
		}
	}
	public Toy catchToy() {
		Toy toy = null;
		//인형 뽑는 로직
		return toy;
	}
}
