package quiz01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		//mysql�����ؼ�
		// world db�� �ִ� city ���̺��� ��ȸ�ؼ� ����� �˷��ְ�
		//������ ��ȣ�� �Է¹޾� �����Ѵ�.
		//��, ���� ������ "���� �Ϸ�". ��ȣ�� ���ٸ� �̻��� "������ ��ȣ"�� �����ϵ��� ����,
		
		Connection conn=null;
		PreparedStatement state=null;
		ResultSet rs=null;
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/world", "aaa", "1234");
			
			state = conn.prepareStatement("SELECT count(*) FROM world.city");
			rs = state.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			
			int s = sc.nextInt();
			state = conn.prepareStatement("DELETE FROM city WHERE ID = ?");
			state.setInt(1, s);
			int count = state.executeUpdate();
			
			if(count!=0) {
				System.out.println("���� �Ϸ�");
			}else {
				System.out.println("������ ��ȣ");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(conn!=null) try {conn.close();} catch(Exception e) {}
			if(state!=null) try {state.close();} catch(Exception e) {}
			if(rs!=null) try {rs.close();} catch(Exception e) {}
			sc.close();
		}
	}
}
