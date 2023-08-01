package 문자열;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		//사용자로 부터 글자를 입력받아 몇글자인지 알려주는 프로그램.
		Scanner in = new Scanner(System.in);
		System.out.println("글자입력");
		String words = in.nextLine();
		System.out.print("\n입력한 문자열의 길이 : " +words.length());
		String[] arrays = words.split(",");//,, '' "" 등 null값도 문자로 취급해서 자른다.
		
		System.out.println("\n입력한 배열 : ");
		for(int i=0; i<arrays.length; i++) {
			System.out.print(arrays[i]+" ");	
		}

		System.out.println("\n(for-each문으로 출력)입력한 배열 : ");
		//for each 구문-상향된 for문
		for(String w : arrays) {
			System.out.print(w+" ");
		}
		
	}
}
