package test;

import kr.mit.c305.DBClass;

public class Test2 {

	public static void main(String[] args) {
		DBClass todo = new DBClass();
		System.out.println(todo.countIncomplete());
	}

}
