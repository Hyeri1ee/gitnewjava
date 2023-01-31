package sec02.exam07;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0]="JAVA";
		strArray[1]="JAVA";
		strArray[2]= new String("JAVA");
		
		System.out.println(strArray[0] == strArray[1]); //true
		System.out.println(strArray[0] == strArray[2]); //false
		System.out.println(strArray[0].equals(strArray[2])); //true

	}

}
