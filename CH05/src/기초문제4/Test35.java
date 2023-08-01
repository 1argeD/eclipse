package 기초문제4;

import java.util.Scanner;

public class Test35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		System.out.println("**** x,y,z에 값채우기***");
		System.out.println(a+" " +"을 넘겨받은 생성자");
		System.out.println();
		System.out.println(a+" " + b +"을 넘겨받은 생성자");
		System.out.println();
		System.out.println(a + " " + b + " "+ c +"을 넘겨받은 생성자");
		System.out.println();
		System.out.println(a + " " + b + " "+ c );
		System.out.println();
		System.out.println("합 : "+ (a+b+c));
	}
}
