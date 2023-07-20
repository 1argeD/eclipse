package 조건문;
import java.util.Scanner;

public class 조건문 {
	public static void main(String[] args) {
		//조건이 참일 경우 실행, 아닐시 실행 안 함.
		/*
		 조건이 참이면 실행하고 아니면 실행 안 함. 
		 if(조건) {
			참일 경우 실행할 내용
		}
		*/
		
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int a = in.nextInt();
		
		if(a<10) {
			System.out.println("10보다 작은 수 이다");
		}
		if(a>10) {
			System.out.println("10보다 큰 수 이다");
		}
		System.out.println("프로그램 종료");
		
		
		if(a>=10) {
			System.out.println("10보다 크거나 같은 수 이다");
		} else {
			System.out.println("10보다 작은 수다");
		}
		
		
		if(a>10 || a<5) {
			System.out.print("1 : ");
			System.out.print("성공");
		} else {
			System.out.print("1 : ");
			System.out.print("실패");
		}
		
		
		if(5<a && a<10) {
			System.out.print(" 2 : ");
			System.out.print("성공");
		} else {
			System.out.print(" 2 : ");
			System.out.print("실패");
		}
		
		if(5<a) {
			if(a<10) {
				System.out.print(" 3 : ");
				System.out.print("성공");
			} else {
				System.out.print(" 3 : ");
				System.out.print("실패");
			}
		}
	}
}
