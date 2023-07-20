package 반복문;

import java.util.Scanner;

public class DoWhileQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int a = sc.nextInt();
		
		do {
			if(a==0) {
				break;
			}else {
				System.out.println("a가 0이 아님.");
				System.out.print("숫자를 다시 입력하시오 : ");
				a = sc.nextInt();
			}
		} while(a!=0);
		
		System.out.println("끝");
		
	}
}
