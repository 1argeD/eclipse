package ���ǹ�;
import java.util.Scanner;

public class ���ǹ� {
	public static void main(String[] args) {
		//������ ���� ��� ����, �ƴҽ� ���� �� ��.
		/*
		 ������ ���̸� �����ϰ� �ƴϸ� ���� �� ��. 
		 if(����) {
			���� ��� ������ ����
		}
		*/
		
		Scanner in = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int a = in.nextInt();
		
		if(a<10) {
			System.out.println("10���� ���� �� �̴�");
		}
		if(a>10) {
			System.out.println("10���� ū �� �̴�");
		}
		System.out.println("���α׷� ����");
		
		
		if(a>=10) {
			System.out.println("10���� ũ�ų� ���� �� �̴�");
		} else {
			System.out.println("10���� ���� ����");
		}
		
		
		if(a>10 || a<5) {
			System.out.print("1 : ");
			System.out.print("����");
		} else {
			System.out.print("1 : ");
			System.out.print("����");
		}
		
		
		if(5<a && a<10) {
			System.out.print(" 2 : ");
			System.out.print("����");
		} else {
			System.out.print(" 2 : ");
			System.out.print("����");
		}
		
		if(5<a) {
			if(a<10) {
				System.out.print(" 3 : ");
				System.out.print("����");
			} else {
				System.out.print(" 3 : ");
				System.out.print("����");
			}
		}
	}
}
