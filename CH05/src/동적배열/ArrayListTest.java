package 동적배열;

import java.util.ArrayList;
import java.util.LinkedList;

//1. list는 순서가 있는 요소의 집합. 


public class ArrayListTest {
	static ArrayList<String> list = new ArrayList<>();//<>제네릭 
	static LinkedList<String> list2 = new LinkedList<>();
	
	public static void main(String[] args) {
		//arrayList
		
		list.add("첫번째 문장");//값추가
		list.add("두번째 문자");
		list.add("세번째 문자");
		System.out.println(list.get(1));//index 값을 통해서 접근할 수 있다.
		list.remove(1);
		System.out.println(list.get(1));//두번째 문자가 remove에 삭제되어 세번째 문자가 출력된다.
		
		//linkedList
		
		list2.add("첫번째 문장");//값추가
		list2.add("두번째 문자");
		list2.add("세번째 문자");
		System.out.println(list.get(1));//index 값을 통해서 접근할 수 있다.
		list2.remove(1);
		System.out.println(list.get(1));//두번째 문자가 remove에 삭제되어 세번째 문자가 출력된다.
		
		
		
	}
}
