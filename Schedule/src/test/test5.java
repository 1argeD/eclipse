package test;

import java.util.List;

import kr.mit.c305.DBClass;
import kr.mit.c305.TodoClass;

public class test5 {

	public static void main(String[] args) {
			DBClass db = new DBClass();
			List<TodoClass> aaa = db.search("¿·");
			
			for(TodoClass to : aaa) {
				System.out.println(to);
			}
	}

}
