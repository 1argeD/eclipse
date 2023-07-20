package quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("두 수를 입력해 주세요");
		int a = in.nextInt(), b = in.nextInt();

		System.out.println(
				" 두 수의 합 : " + (a+b) 
				+ ", 두 수의 곱 : "+ a*b 
				+ ", 두 수를 나눈 몫 : " + a/b 
				+ ", 두 수를 나눈 나머지 : " + a%b
				);
		
	}

}
