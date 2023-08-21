package mysql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. JDBC ����̹� �ε�
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. DB�� �����Ͽ� Connection ��ü ����
			Connection conn = 
					DriverManager.getConnection("jdbc:mysql://127.0.0.1/aaa", "aaa", "1234");
			//3. Connection ��ü�� ������ �۾�
			Statement state = conn.createStatement();//Statement ��ü 
			state.executeQuery("select * from todo order by date");
			//4. Connection ��ü�� �̿��ؼ� DB�۾�
			//rs.next(); //���� ����Ų��. ȣ���� �� ���� ������ (������true, ������ false)
			ResultSet rs = state.executeQuery("select * from todo order by date");
			while(rs.next()) {
				int no = rs.getInt("no");
				Date date  = rs.getDate(2);
				String str = rs.getString("str");
				int isComplete = rs.getInt(4);
				System.out.println(no+" "+date+" "+str+" "+isComplete);
			}
			//����,����,������ executeUpdate) ���
			String content = "������ ������";
			int cnt = state.executeUpdate(
					"insert into todo(STR,isComplete,date)values('"+content+"',0,'2023-08-21')");//�� ������ ����� ���� �Ǿ�����, ó���� ���� ������ ��ȯ��
			System.out.println(cnt);
			
			System.out.println("���Ἲ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("�������");
			e.printStackTrace();
		}
		 
	}

}
