package 함수;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 입력 : ");
		int start = sc.nextInt();
		System.out.print("끝지점 숫자 입력 : ");
		int end = sc.nextInt();
		
		numAddNum(start, end);
	} 
	
	
	public static void numAddNum(int start, int end) {
			Scanner sc = new Scanner(System.in);
			
			int sum = 0;
			int pass = 1;
			
			do {
			
			for( ; start<=end; start++ ) {
				sum=sum+start;
			}
			
			System.out.println("시작 숫자부터 끝지점 까지 숫자들의 총 합은 "+sum+"입니다.");
			System.out.println("계속하려면 1을 입력해주세요 : ");
			
			System.out.print("계속하시겠습니까? : ");
			pass = sc.nextInt();
			
			if(pass!=1) break;
			
			sum = 0;
			
			System.out.print("시작 숫자 입력 : ");
			start = sc.nextInt();
			
			System.out.print("끝지점 숫자 입력 : ");
			end = sc.nextInt();
			
		} while(pass==1);
	}

}
