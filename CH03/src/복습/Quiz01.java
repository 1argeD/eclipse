package ����;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		//ȭ�� ���� ��ȯ�� �����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��Fȭ���� �Է��� �ּ��� : ");
		int template = sc.nextInt();
		
		System.out.println("ȭ�� : "+template+"��F�� ���� : "+(template-32)*5/9+"��C �Դϴ�.");
	}
}
