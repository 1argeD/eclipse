package test;

import package3.MyMath1;

public class MyMath1Test {
	public static void main(String[] args) {
		MyMath1 m = new MyMath1(1,10);
		System.out.println(m.allsum());
		System.out.println(m.allsum(2, 10));
	}
}
