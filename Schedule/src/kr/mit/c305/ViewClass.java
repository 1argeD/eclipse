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
		System.out.print("1.전체 일정 보기\n2.일정 입력\n3.일정 완료하기\n4.종료\nmenu입력: ");
		return sc.nextInt();
	}

	@Override
	public void end() {
		System.out.println("감사합니다.");
		
	}

	
}
