package 배열;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.print((i+1)+"번째 숫자를 입력해주세요 : ");
			num[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum += num[i];
		}
		
		System.out.println("모두 더한 값은? : " + sum);
		
	}
}
