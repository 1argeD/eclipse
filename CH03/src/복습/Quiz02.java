package ����;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����, ����, �������� : ");
		int korean = sc.nextInt(),english = sc.nextInt(),math = sc.nextInt();
		
		if(korean>=40&&english>=40&&math>=40&&(korean+english+math)/3>=60) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
		
	}
}
