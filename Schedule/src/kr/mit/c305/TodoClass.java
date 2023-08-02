package kr.mit.c305;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TodoClass implements InterTodoClass{
	Scanner sc = new Scanner(System.in);
	
	SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
	String date = format.format(new Date());
	
	String work,yesOrNo;
	boolean comOrIncom;
	
	ArrayList<TodoClass> todoList = new ArrayList<>();
	
	TodoClass(String date, String work, boolean comOrIncom) {
		this.date = date;
		this.work = work;
		this.comOrIncom = comOrIncom;
	}
	
	TodoClass() {
		
	}
	
	@Override
	public void todoList() {
		String state="�̿Ϸ�";
		for(TodoClass todo : todoList) {
			if(todo.comOrIncom!=true) {
				state = "�̿Ϸ�";
			} else {
				state = "�Ϸ�";
			}
			System.out.println(todo.date  + todo.work + state);
		}
	
	}

	@Override
	public String todoInput() {
		System.out.println("��¥�Է�: "+date);
		System.out.print("���� �Է�: ");
		work = sc.nextLine();
		System.out.print("����Է��Ͻðڽ��ϱ�?(y/n)");
		yesOrNo=sc.nextLine();
		comOrIncom=false;
		todoList.add(new TodoClass(date, work,comOrIncom));
		return yesOrNo;
	}

	@Override
	public int incompleteList() {
		for(int i=0; i<todoList.size(); i++) {
			if(todoList.get(i).comOrIncom!=true) {
				System.out.println((i+1)+"."+todoList.get(i).date+ " "  + todoList.get(i).work+ " " + "-�̿Ϸ�");
			} 
		}
		System.out.print("��� ������ �Ϸ��Ͻðڽ��ϱ�or����(0) ?");
		return sc.nextInt();
	}

	@Override
	public void complete(int num) {
		todoList.get(num).comOrIncom = true;	
	}
	

}
