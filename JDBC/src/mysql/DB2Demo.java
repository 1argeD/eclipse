package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB2Demo {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement state=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = 
					DriverManager.getConnection("jdbc:mysql://127.0.0.1/aaa", "aaa", "1234");
			//그냥 단순하기 satement를 사용할 경우 쿼리문을 엉망으로 넣어서 직접 정보를 가져오는 sql인젝션이라는 해킹 기법에 당할 수 있기 떄문에 prepareStatement를 사용한다.
			state = conn.prepareStatement("insert into todo(STR,isComplete,date)values(?,?,?)");
			
			state.setString(1, "문자만");//sql은 1234 순서대로 만들어지기 떄문에 1은 1번쨰 
			state.setInt(2, 0);
			state.setString(3, "2023-08-21");
			state.executeQuery("select * from todo order by date");
			
			//조회 
			state = conn.prepareStatement("select*from todo");
			rs = state.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			
			System.out.println("연결성공");
		} catch (Exception e) {
		
			System.out.println("연결실패");
			e.printStackTrace();
		}finally {
			if(rs!=null) try {rs.close();} catch (SQLException e) {}
			if(state!=null) try {state.close();} catch (SQLException e) {}
			if(conn!=null)try {conn.close();//닫아줘야지만 제대로 된 프로그램이 된다.
			} catch (SQLException e) {}
		}
		 
	}

}
