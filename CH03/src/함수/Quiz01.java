package �Լ�;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� �Է� : ");
		int start = sc.nextInt();
		System.out.print("������ ���� �Է� : ");
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
			
			System.out.println("���� ���ں��� ������ ���� ���ڵ��� �� ���� "+sum+"�Դϴ�.");
			System.out.println("����Ϸ��� 1�� �Է����ּ��� : ");
			
			System.out.print("����Ͻðڽ��ϱ�? : ");
			pass = sc.nextInt();
			
			if(pass!=1) break;
			
			sum = 0;
			
			System.out.print("���� ���� �Է� : ");
			start = sc.nextInt();
			
			System.out.print("������ ���� �Է� : ");
			end = sc.nextInt();
			
		} while(pass==1);
	}

}
