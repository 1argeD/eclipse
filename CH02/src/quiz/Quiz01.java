package quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("숫자 a,b,c,를 입력하세요");
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
		
		System.out.println("a,b,c의 합을 계산합니다");
		System.out.println(a+b+c);
		//*,-,+, 사칙연산 /(몫을 계산. 단, 몫은 정수만 나온다) %(나머지를 계산)
	}
}
