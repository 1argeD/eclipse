package 람다식문법;

import java.util.ArrayList;

public class ConsumerTest {
	public static void main(String[] ages) {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("1");
		ar.add("2");
		ar.add("3");
		ar.add("4");
		ar.add("5");
		
		for(String a : ar) System.out.print(a+", ");
		
		System.out.println();
		System.out.println("--------------람다식 이용--------------");
		
		ar.forEach(o -> System.out.print(o+", "));
		
		System.out.println();
		System.out.println("--------메소드 참조 (축약형)--------------");
		
		ar.forEach(System.out::print);
	}
}
