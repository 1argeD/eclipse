package kr.mit.c305;

import java.util.Scanner;

public class ViewClass implements InterViewClass{
	Scanner sc = new Scanner(System.in);
	@Override
	public void title() {
		System.out.println("-----------------------\n-------오늘의 할일---------\n-----------------------");
	}

	@Override
	public int menu() {
		int menuNum = 0;
		do {
			try {
				System.out.print("1.전체 일정 보기\n2.일정 입력\n3.일정 완료하기\n4.날짜 계산하기\n5.종료\nmenu입력: ");
				menuNum=sc.nextInt();
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("*메뉴의 숫자만 입력해주세요.*");
			}
		}while(menuNum!=1&&menuNum!=2&&menuNum!=3&&menuNum!=4&&menuNum!=5);
	return menuNum;
	}

	@Override
	public void end() {
		System.out.println("감사합니다.");
		
	}

	
}
