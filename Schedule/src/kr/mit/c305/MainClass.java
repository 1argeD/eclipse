package kr.mit.c305;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
			int menuNum;
			Scanner sc = new Scanner(System.in);
			InterViewClass viewClass = new ViewClass();
			
			InterTodoClass todoClass = new TodoClass();
			
			
			//타이틀 출력
			viewClass.title();
			do {
				menuNum = viewClass.menu();
				//번호에 맞는 내용 실행(1,2,3,4)
				if(menuNum==1) {
					//전체일정보기
					todoClass.todoList();
				}else if(menuNum==2) {
					String yesOrNo;
					//일정입력
					do {
						 yesOrNo = todoClass.todoInput();
						}while(yesOrNo.equals("y"));
	
				}else if(menuNum==3) {
					int useNum;
					do {
						//미완료된 일정 보여주기 
						useNum = todoClass.incompleteList();
					}while(useNum!=0);
						//일정완료하기
						todoClass.complete(useNum);
				}
			} while(menuNum!=4);// 메뉴에서 4입력시 종료
			viewClass.end();
			//메뉴 출력
			sc.close();
			
	}

}
