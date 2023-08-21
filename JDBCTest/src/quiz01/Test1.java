package quiz01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test1 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pr=null;
		//오라클 db를 연결해서 남학생에 대한 정보만 뽑아서 출력하기
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "aaa", "bbb");
			
			pr = conn.prepareStatement("select * from STUDENT where STU_GENDER='M'");
			ResultSet rs = pr.executeQuery();
			
			while(rs.next()) {
				System.out.println("학번 : "+rs.getString(1)+" / 이름 : "+rs.getString(2)+" / 학과 : "+rs.getString(3)+" / 학년 : "+rs.getString(4)+" / 반 : "+rs.getString(5)+" / 성별 : "+rs.getString(6)+" / 키 : "+rs.getString(7)+"cm"+" / 몸무게 : "+rs.getString(8)+"kg");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn!=null) {try{conn.close();} catch(Exception e){}}
			if(pr!=null) {try{pr.close();} catch(Exception e){}}
		}
	}
}
