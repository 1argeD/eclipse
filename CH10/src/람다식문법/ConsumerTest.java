package ���ٽĹ���;

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
		System.out.println("--------------���ٽ� �̿�--------------");
		
		ar.forEach(o -> System.out.print(o+", "));
		
		System.out.println();
		System.out.println("--------�޼ҵ� ���� (�����)--------------");
		
		ar.forEach(System.out::print);
	}
}
