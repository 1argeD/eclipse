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
		String state="미완료";
		for(TodoClass todo : todoList) {
			if(todo.comOrIncom!=true) {
				state = "미완료";
			} else {
				state = "완료";
			}
			System.out.println(todo.date  + todo.work + state);
		}
	
	}

	@Override
	public String todoInput() {
		System.out.println("날짜입력: "+date);
		System.out.print("내용 입력: ");
		work = sc.nextLine();
		System.out.print("계속입력하시겠습니까?(y/n)");
		yesOrNo=sc.nextLine();
		comOrIncom=false;
		todoList.add(new TodoClass(date, work,comOrIncom));
		return yesOrNo;
	}

	@Override
	public int incompleteList() {
		for(int i=0; i<todoList.size(); i++) {
			if(todoList.get(i).comOrIncom!=true) {
				System.out.println((i+1)+"."+todoList.get(i).date+ " "  + todoList.get(i).work+ " " + "-미완료");
			} 
		}
		System.out.print("몇번 일정을 완료하시겠습니까or종료(0) ?");
		return sc.nextInt();
	}

	@Override
	public void complete(int num) {
		todoList.get(num).comOrIncom = true;	
	}
	

}
