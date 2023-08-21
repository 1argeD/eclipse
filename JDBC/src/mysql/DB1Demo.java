package mysql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. JDBC 드라이버 로드
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. DB와 연결하여 Connection 객체 생성
			Connection conn = 
					DriverManager.getConnection("jdbc:mysql://127.0.0.1/aaa", "aaa", "1234");
			//3. Connection 객체를 가지고 작업
			Statement state = conn.createStatement();//Statement 객체 
			state.executeQuery("select * from todo order by date");
			//4. Connection 객체를 이용해서 DB작업
			//rs.next(); //행을 가르킨다. 호출할 때 마다 다음행 (있으면true, 없으면 false)
			ResultSet rs = state.executeQuery("select * from todo order by date");
			while(rs.next()) {
				int no = rs.getInt("no");
				Date date  = rs.getDate(2);
				String str = rs.getString("str");
				int isComplete = rs.getInt(4);
				System.out.println(no+" "+date+" "+str+" "+isComplete);
			}
			//수정,삭제,삽입은 executeUpdate) 사용
			String content = "오늘은 월요일";
			int cnt = state.executeUpdate(
					"insert into todo(STR,isComplete,date)values('"+content+"',0,'2023-08-21')");//이 쿼리가 제대로 실행 되었을때, 처리된 행의 개수를 반환함
			System.out.println(cnt);
			
			System.out.println("연결성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("연결실패");
			e.printStackTrace();
		}
		 
	}

}
