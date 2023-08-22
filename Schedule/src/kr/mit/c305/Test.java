package kr.mit.c305;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	

	public static void main(String[] args) {
	Connection conn=null;
		
	DBClass todo = new DBClass();
	
	
	int i = 0;
	//데이터 집어 넣기
	do {
		i++;
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String date = format.format(new Date());
 
		TodoClass testTodo = new TodoClass(date,String.valueOf(i),false);
		todo.input(testTodo);
			
		
	} while(i != 100);
		
	System.out.println(todo.incompleteList().size());
	
	TodoClass doit = new TodoClass();
	
	doit.incompleteList();
	
	}
}


