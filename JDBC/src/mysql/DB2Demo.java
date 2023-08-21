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
			//�׳� �ܼ��ϱ� satement�� ����� ��� �������� �������� �־ ���� ������ �������� sql�������̶�� ��ŷ ����� ���� �� �ֱ� ������ prepareStatement�� ����Ѵ�.
			state = conn.prepareStatement("insert into todo(STR,isComplete,date)values(?,?,?)");
			
			state.setString(1, "���ڸ�");//sql�� 1234 ������� ��������� ������ 1�� 1���� 
			state.setInt(2, 0);
			state.setString(3, "2023-08-21");
			state.executeQuery("select * from todo order by date");
			
			//��ȸ 
			state = conn.prepareStatement("select*from todo");
			rs = state.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			
			System.out.println("���Ἲ��");
		} catch (Exception e) {
		
			System.out.println("�������");
			e.printStackTrace();
		}finally {
			if(rs!=null) try {rs.close();} catch (SQLException e) {}
			if(state!=null) try {state.close();} catch (SQLException e) {}
			if(conn!=null)try {conn.close();//�ݾ�������� ����� �� ���α׷��� �ȴ�.
			} catch (SQLException e) {}
		}
		 
	}

}
