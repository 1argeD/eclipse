package kr.mit.c305;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBClass implements InterDBClass{
	Connection conn;
	PreparedStatement pr;
	ResultSet rs;
	
	//db 연결
	private void dbConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "aaa", "bbb");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//db 닫기
	private void dbClose() {
		if(rs!=null) try {rs.close();} catch (SQLException e) {}
		if(pr!=null) try {pr.close();} catch (SQLException e) {}
		if(conn!=null)try {conn.close();} catch (SQLException e) {};
	}
	
	@Override
	public List<TodoClass> list() {
		dbConn();
		List<TodoClass> list = new ArrayList<>();
		try {
			pr = conn.prepareCall("select * from todo order by todo_date");
			rs = pr.executeQuery();
			
			//rs객체를 list 객체로 옮겨 담기
			while(rs.next()) {
				TodoClass to = new TodoClass();
				to.no = rs.getInt("NO");
//				to.date = rs.getDate("todo_date");
				to.work = rs.getString("str");
				to.comOrIncom = rs.getBoolean("isComplete");
				list.add(to);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		dbClose();
		return list;
	}
	
	@Override
	public void input(TodoClass todo) {
		dbConn();
		try {
			pr = conn.prepareStatement("SELECT MAX(no) FROM todo");
			rs = pr.executeQuery();
			rs.next();
			int prMaxNum = rs.getInt(1); 
			
			pr = conn.prepareStatement("Insert into todo (no,str,todo_date) values (?,?,?)");
			
			
			pr.setInt(1, prMaxNum+1);
			pr.setString(2,todo.work);
			Date d = Date.valueOf(todo.date);
			pr.setDate(3,d);
			
			rs = pr.executeQuery();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		dbClose();
	}
	
	@Override
	public List<TodoClass> incompleteList() {
		dbConn();
		List<TodoClass> list = new ArrayList<>();
		
		try{
			pr=conn.prepareStatement("select * from todo order by todo_date");
			rs = pr.executeQuery();
			while(rs.next()) {
				TodoClass todo = new TodoClass();
				
				todo.work = rs.getString("str");
				todo.comOrIncom = rs.getBoolean("isComplete");
				
				if(!todo.comOrIncom) {
					list.add(todo);
				}
			}
			
		}catch(Exception e){}
		
		dbClose();
		return list;
	}
	@Override
	public void complete(int no) {
		// TODO Auto-generated method stub
		
	}
	
	public int countIncomplete() {
		dbConn();
		int answer = 0;
		try {
			pr=conn.prepareStatement("select count(*) from todo where ISCOMPLETE=0 order by todo_date");
			rs = pr.executeQuery();
			if(rs.next()) {
				answer = rs.getInt(1);
			}
		}catch(Exception e){}
		
		dbClose();
		return answer;
	}
	public java.util.Date lastDate() {
		dbConn();
		java.util.Date date= new java.util.Date();
		
		try {
			pr=conn.prepareStatement("select max(todo_date) from todo");
			rs = pr.executeQuery();
			if(rs.next()) {
				date = Date.valueOf(rs.getString("TODO_DATE"));
			}
		}catch(Exception e){}
		dbClose();
		return date;
	} 
	
	public TodoClass lastStr() {
		dbConn();
		TodoClass to = new TodoClass(); 
		try {
			pr=conn.prepareStatement("select no, str from todo where todo_date = (select max(todo_date) from TODO)");
			rs = pr.executeQuery();
			rs.next();
			
			to.no = rs.getInt("NO");
			to.work = rs.getString("STR");
		
				
		}catch(Exception e){}
		
		dbClose();
		
		return to;
	}
	
	public List<TodoClass> search(String word) {
		//word 내용이 포함되어 있는 모든 할일 목록을 돌려주는 메소드 
		dbConn();
		List<TodoClass> ser = new ArrayList<>();
		try {
			pr=conn.prepareStatement("select * from todo where str like ?");
			word = '%'+word+'%';
			pr.setString(1, word);
			
			rs = pr.executeQuery();
			while(rs.next()) {
				TodoClass to = new TodoClass();
				to.date = rs.getString("Todo_date");
				to.work = rs.getString("STR");
				to.comOrIncom = rs.getBoolean("ISCOMPLETE");
				ser.add(to);
			}
	
		}catch(Exception e){}
		dbClose();
		return ser;
	}
	
}
