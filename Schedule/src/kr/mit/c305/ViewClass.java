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
		int menuNum = 0;
		do {
			try {
				System.out.print("1.��ü ���� ����\n2.���� �Է�\n3.���� �Ϸ��ϱ�\n4.��¥ ����ϱ�\n5.����\nmenu�Է�: ");
				menuNum=sc.nextInt();
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("*�޴��� ���ڸ� �Է����ּ���.*");
			}
		}while(menuNum!=1&&menuNum!=2&&menuNum!=3&&menuNum!=4&&menuNum!=5);
	return menuNum;
	}

	@Override
	public void end() {
		System.out.println("�����մϴ�.");
		
	}

	
}
