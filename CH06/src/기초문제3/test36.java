package 기초문제3;

import java.util.Scanner;

public class test36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		double tall = sc.nextDouble(); 
		
		System.out.println("###인적사항###");
		System.out.println();
		System.out.println("이름 : "+name);
		System.out.println();
		System.out.println("나이 : "+age);
		System.out.println();
		System.out.println("신장 : "+ tall);
	}

}
