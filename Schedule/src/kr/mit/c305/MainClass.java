package kr.mit.c305;

import java.text.ParseException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
			int menuNum;
			Scanner sc = new Scanner(System.in);
			InterViewClass viewClass = new ViewClass();
			
			InterTodoClass todoClass = new TodoClass();
			
			
			//Ÿ��Ʋ ���
			viewClass.title();
			do {
				menuNum = viewClass.menu();
				//��ȣ�� �´� ���� ����(1,2,3,4,5)
				if(menuNum==1) {
					//��ü��������
					todoClass.todoList();
				}else if(menuNum==2) {
					String yesOrNo;
					//�����Է�
					do {
						 yesOrNo = todoClass.todoInput();
						}while(yesOrNo.equals("y"));
	
				}else if(menuNum==3) {
					int useNum;
					do {
						//�̿Ϸ�� ���� �����ֱ� 
						useNum = todoClass.incompleteList();
						//�����Ϸ��ϱ�
						todoClass.complete(useNum);
					}while(useNum!=0);
				} else if(menuNum==4) {
					//����� ��¥�� �Է� ������ ���� ��¥�� �������.
					try {
						todoClass.dateCal();
					} catch (ParseException e) {
						e.printStackTrace();
					}
				}
			} while(menuNum!=5);// �޴����� 4�Է½� ����
			viewClass.end();
			//�޴� ���
			sc.close();
			
	}

}
