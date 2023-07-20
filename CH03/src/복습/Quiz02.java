package 복습;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학점수 : ");
		int korean = sc.nextInt(),english = sc.nextInt(),math = sc.nextInt();
		
		if(korean>=40&&english>=40&&math>=40&&(korean+english+math)/3>=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
	}
}
