package kr.mit.c305;

import java.util.Scanner;

public class ViewClass implements InterViewClass{
	Scanner sc = new Scanner(System.in);
	@Override
	public void title() {
		System.out.println("-----------------------\n-------������ ����---------\n-----------------------");
	}

	@Override
	public int menu() {
		System.out.print("1.��ü ���� ����\n2.���� �Է�\n3.���� �Ϸ��ϱ�\n4.����\nmenu�Է�: ");
		return sc.nextInt();
	}

	@Override
	public void end() {
		System.out.println("�����մϴ�.");
		
	}

	
}
