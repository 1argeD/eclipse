package quiz01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		//�л� ���̺��� 
		//����ڷ� ���� ���ϴ� ���� ,�����Ը� �Է¹޾Ƽ�
		//�Է� ���� �����Ժ��� ū �л��� ���
		Connection conn = null;
		PreparedStatement pr=null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "aaa", "bbb");
			
			System.out.print("���ϴ� ������ �Է��� �ּ���(���� or ����) : ");
			String gender = sc.nextLine();
			
			if(gender.equals("����")) {
				gender = "M";
			}else if(gender.equals("����")){
				gender = "F";
			}
			
			System.out.print("���� �����Ը� �Է����ּ���(kg): ");
			String weight = sc.nextLine();
			
			pr = conn.prepareStatement("select count(*) from STUDENT where STU_GENDER= ? and ? <=STU_WEIGHT");
			pr.setString(1, gender);
			pr.setString(2, weight);
			rs = pr.executeQuery();
			
			rs.next();
			System.out.println("�� �ο��� " + rs.getString(1) +"���̰� �̸���" );
			
			pr = conn.prepareStatement("select STU_NAME from STUDENT where STU_GENDER= ? and ? <=STU_WEIGHT");
			
			pr.setString(1, gender);
			pr.setString(2, weight);
			rs = pr.executeQuery();
			
			
			while(rs.next()) {
				System.out.println(rs.getString(1));	
			}
			
		} catch(Exception e) {
			
		}finally {
			if(conn!=null) try {conn.close();} catch(Exception e) {}
			if(pr!=null) try {pr.close();} catch(Exception e) {}
			if(rs!=null) try {rs.close();} catch(Exception e) {}
			sc.close();
		}
	}

}
