package lists;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list);
		list.add("aaa");
		list.add("bbb");
		list.add("ddd");
		list.add(0,"ggg"); //특정 인덱스 번호 자리에 문자열 add
		list.set(0, "kkkkk"); //set : 기존 데이터 대체
		System.out.println(list);
	}

}
