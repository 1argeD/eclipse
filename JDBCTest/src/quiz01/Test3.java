package quiz01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Test3 {

	public static void main(String[] args) {
		// scott �������� �����ؼ� 
		// ��� �̸��� �ٹ��ϴ� �μ� ��ġ�� ��ü�� ���
		
		Connection conn=null;
		PreparedStatement pr=null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "TIGER");
			pr = conn.prepareStatement("select ENAME,LOC from EMP join DEPT using(DEPTNO)");
			rs = pr.executeQuery();
			System.out.println("Name"+" "+"LOC");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn!=null) try {conn.close();} catch(Exception e) {}
			if(pr!=null) try {pr.close();} catch(Exception e) {}
			if(rs!=null) try {rs.close();} catch(Exception e) {}
		}
		
	}

}
