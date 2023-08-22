package kr.mit.c305;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TodoClass implements InterTodoClass{
	Scanner sc = new Scanner(System.in);

	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	String date = format.format(new Date());
	String state="미완료";
	String work,yesOrNo;
	int no;
	
	int n;
	
	@Override
	public String toString() {
		return "TodoClass [date=" + date + ", state=" + state + ", work=" + work + ", no=" + no + ", comOrIncom=" + comOrIncom +"]";
	}


	boolean comOrIncom;
	
	List<TodoClass> todoList = new ArrayList<>();
	
	TodoClass(String date, String work, boolean comOrIncom) {
		this.date = date;
		this.work = work;
		this.comOrIncom = comOrIncom;
	}
	
	TodoClass() {
		
	}
	
	@Override
	public void todoList() {
		InterDBClass db = new DBClass();
		List<TodoClass> list = db.list();
		
		if(list.size()==0) {
			System.out.println("*일정이 비어있습니다. 일정을 입력해주세요.*");
		}
		for(TodoClass todo : list) {
			state = todo.comOrIncom ? "완료" : "미완료"; 
			System.out.println(todo.no+", "+todo.date+", " + todo.work+" -" +state);
			
		}
	
	}

	@Override
	public String todoInput() {
		System.out.println("날짜입력: "+date);
		System.out.print("내용 입력: ");
		work = sc.nextLine();
		if(work.equals("")) {
			work = sc.nextLine();
			}
		System.out.print("계속입력하시겠습니까?(y/n)");
		yesOrNo=sc.nextLine();
		if(!yesOrNo.equals("y")&&!yesOrNo.equals("n")) {
			do{	
				System.out.println("*'y'와 'n' 중 하나만 입력해주세요.*");
				System.out.print("계속입력하시겠습니까?(y/n)");
				yesOrNo=sc.nextLine();
			}while(!yesOrNo.equals("y")&&!yesOrNo.equals("n"));
		}
		comOrIncom=false;
//		todoList.add(new TodoClass(date, work,comOrIncom));
		InterDBClass db = new DBClass();
		db.input(new TodoClass(date, work,comOrIncom));
		
		return yesOrNo;
		
	}

	@Override
	public int incompleteList() {
		InterDBClass db = new DBClass();
		List<TodoClass> list = db.incompleteList();
		
		if(list.size()==0) {
				System.out.println("*일정이 비어있습니다. 일정을 입력해주세요.*");
				System.out.print("몇번 일정을 완료하시겠습니까or종료(0) ?");
				try{
					n = sc.nextInt();
				} catch(Exception e) {
					sc.nextLine();
					System.out.println("0번 혹 일정의 번호를 입력해주세요.");
				}
				return n;
			}
			
			
			for(TodoClass todo : list) {
				if(todo.comOrIncom!=true) {
					state = todo.comOrIncom ? "완료" : "미완료";
					System.out.println(todo.no+"."+todo.date+ " "  + todo.work+ " " + "-"+state);
				} 
			}
			

			
				try{
					System.out.print("몇번 일정을 완료하시겠습니까or종료(0) ?");
					n = sc.nextInt();
				} catch(Exception e) {
					sc.nextLine();
					System.out.println("0번 혹 일정의 번호를 입력해주세요.");
				}
			
			if(n<0||n>list.size()) {
				System.out.println("*올바른 숫자를 입력해주세요.*");
			}

		return n;
			
	}

	@Override
	public void complete(int num){
		try {
			try {
				todoList.get(num-1).comOrIncom = true;	
			} catch(Exception e) {
				System.out.println("*일정이 비어있습니다. 일정을 입력해주세요.*");
				e.getMessage();
			}
			if(num==0) {
				return;
			}
			if(todoList.get(num-1).comOrIncom == true) {
				System.out.println("*입력하신"+num+"번째 일정은 완료된 일정입니다.*");
			}
		} catch(Exception e) {
			System.out.println("해당 번호의 일정이 없습니다.");
		}
		
		
	}
	

	@Override
	public void dateCal() {
		long daysBetween=0;
		System.out.print("계산할 날짜를 입력해 주세요(형식 : yyyy/MM/dd):");
		Date now = new Date();
		String cal = sc.nextLine();
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		
		if(cal.equals("")) cal=f.format(now);
		
		try {
			daysBetween = f.parse(cal).getTime() - now.getTime();
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		int Ddays = (int) (daysBetween/(24*60*60*1000));
		System.out.println("남은 날짜는 "+Ddays+"일 입니다.");		
	};
	

}
