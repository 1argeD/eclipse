package quiz01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test1 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pr=null;
		//����Ŭ db�� �����ؼ� ���л��� ���� ������ �̾Ƽ� ����ϱ�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "aaa", "bbb");
			
			pr = conn.prepareStatement("select * from STUDENT where STU_GENDER='M'");
			ResultSet rs = pr.executeQuery();
			
			while(rs.next()) {
				System.out.println("�й� : "+rs.getString(1)+" / �̸� : "+rs.getString(2)+" / �а� : "+rs.getString(3)+" / �г� : "+rs.getString(4)+" / �� : "+rs.getString(5)+" / ���� : "+rs.getString(6)+" / Ű : "+rs.getString(7)+"cm"+" / ������ : "+rs.getString(8)+"kg");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn!=null) {try{conn.close();} catch(Exception e){}}
			if(pr!=null) {try{pr.close();} catch(Exception e){}}
		}
	}
}
