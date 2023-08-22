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
	String state="�̿Ϸ�";
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
			System.out.println("*������ ����ֽ��ϴ�. ������ �Է����ּ���.*");
		}
		for(TodoClass todo : list) {
			state = todo.comOrIncom ? "�Ϸ�" : "�̿Ϸ�"; 
			System.out.println(todo.no+", "+todo.date+", " + todo.work+" -" +state);
			
		}
	
	}

	@Override
	public String todoInput() {
		System.out.println("��¥�Է�: "+date);
		System.out.print("���� �Է�: ");
		work = sc.nextLine();
		if(work.equals("")) {
			work = sc.nextLine();
			}
		System.out.print("����Է��Ͻðڽ��ϱ�?(y/n)");
		yesOrNo=sc.nextLine();
		if(!yesOrNo.equals("y")&&!yesOrNo.equals("n")) {
			do{	
				System.out.println("*'y'�� 'n' �� �ϳ��� �Է����ּ���.*");
				System.out.print("����Է��Ͻðڽ��ϱ�?(y/n)");
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
				System.out.println("*������ ����ֽ��ϴ�. ������ �Է����ּ���.*");
				System.out.print("��� ������ �Ϸ��Ͻðڽ��ϱ�or����(0) ?");
				try{
					n = sc.nextInt();
				} catch(Exception e) {
					sc.nextLine();
					System.out.println("0�� Ȥ ������ ��ȣ�� �Է����ּ���.");
				}
				return n;
			}
			
			
			for(TodoClass todo : list) {
				if(todo.comOrIncom!=true) {
					state = todo.comOrIncom ? "�Ϸ�" : "�̿Ϸ�";
					System.out.println(todo.no+"."+todo.date+ " "  + todo.work+ " " + "-"+state);
				} 
			}
			

			
				try{
					System.out.print("��� ������ �Ϸ��Ͻðڽ��ϱ�or����(0) ?");
					n = sc.nextInt();
				} catch(Exception e) {
					sc.nextLine();
					System.out.println("0�� Ȥ ������ ��ȣ�� �Է����ּ���.");
				}
			
			if(n<0||n>list.size()) {
				System.out.println("*�ùٸ� ���ڸ� �Է����ּ���.*");
			}

		return n;
			
	}

	@Override
	public void complete(int num){
		try {
			try {
				todoList.get(num-1).comOrIncom = true;	
			} catch(Exception e) {
				System.out.println("*������ ����ֽ��ϴ�. ������ �Է����ּ���.*");
				e.getMessage();
			}
			if(num==0) {
				return;
			}
			if(todoList.get(num-1).comOrIncom == true) {
				System.out.println("*�Է��Ͻ�"+num+"��° ������ �Ϸ�� �����Դϴ�.*");
			}
		} catch(Exception e) {
			System.out.println("�ش� ��ȣ�� ������ �����ϴ�.");
		}
		
		
	}
	

	@Override
	public void dateCal() {
		long daysBetween=0;
		System.out.print("����� ��¥�� �Է��� �ּ���(���� : yyyy/MM/dd):");
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
		System.out.println("���� ��¥�� "+Ddays+"�� �Դϴ�.");		
	};
	

}
