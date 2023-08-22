package test;

import kr.mit.c305.DBClass;
import kr.mit.c305.TodoClass;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBClass todo = new DBClass();
		TodoClass to = todo.lastStr();
		System.out.println(to);
	}

}
