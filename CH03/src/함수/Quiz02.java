package 함수;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("별의 갯수 입력 : ");
		int star = sc.nextInt();
		
		sprint(star);
		int max = max(1,2);
		System.out.println(max);
	}
	
	private static void sprint(int star) {
		for( ; star>0; star--) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	private static int max(int a,int b) {
		if(a>b) {
			return a;
			} else {
				return b;
			}
	}

}
