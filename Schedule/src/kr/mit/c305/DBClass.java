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
	
	//db ¿¬°á
	private void dbConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "aaa", "bbb");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//db ´Ý±â
	private void dbClose() {
		if(rs!=null) try {rs.close();} catch (SQLException e) {}
		if(pr!=null) try {pr.close();} catch (SQLException e) {}
		if(conn!=null)try {conn.close();} catch (SQLException e) {};
	}
	
	@Override
	public List<TodoClass> list() {
		dbConn();
		ArrayList<TodoClass> list = new ArrayList<>();
		try {
			pr = conn.prepareCall("select * from todo order by todo_date");
			rs = pr.executeQuery();
			
			//rs°´Ã¼¸¦ list °´Ã¼·Î ¿Å°Ü ´ã±â
			while(rs.next()) {
				TodoClass to = new TodoClass();
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
			
			Date d = Date.valueOf(todo.date);
			pr.setInt(1, prMaxNum+1);
			pr.setString(2,todo.work);
			pr.setDate(3,d);
			
			rs = pr.executeQuery();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dbClose();
	}
	
	@Override
	public List<TodoClass> incompleteList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void complete(int no) {
		// TODO Auto-generated method stub
		
	}
	
	
}
