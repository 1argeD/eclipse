package quiz01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test4 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pr=null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "TIGER");
			pr = conn.prepareStatement("select count(*) from EMP , SALGRADE where SALGRADE.GRADE=2 and SALGRADE.LOSAL<=sal and EMP.sal<SALGRADE.HISAL");
			rs = pr.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1));	
			}
			
		} catch(Exception e) {
			
		}finally {
			if(conn!=null) try {conn.close();} catch(Exception e) {}
			if(pr!=null) try {pr.close();} catch(Exception e) {}
			if(rs!=null) try {rs.close();} catch(Exception e) {}
		}
	}
}
