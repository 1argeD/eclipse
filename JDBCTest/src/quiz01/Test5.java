package quiz01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		//학생 테이블에서 
		//사용자로 부터 원하는 성별 ,몸무게를 입력받아서
		//입력 받은 몸무게보다 큰 학생만 출력
		Connection conn = null;
		PreparedStatement pr=null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "aaa", "bbb");
			
			System.out.print("원하는 성별을 입력해 주세요(남자 or 여자) : ");
			String gender = sc.nextLine();
			
			if(gender.equals("남자")) {
				gender = "M";
			}else if(gender.equals("여자")){
				gender = "F";
			}
			
			System.out.print("기준 몸무게를 입력해주세요(kg): ");
			String weight = sc.nextLine();
			
			pr = conn.prepareStatement("select count(*) from STUDENT where STU_GENDER= ? and ? <=STU_WEIGHT");
			pr.setString(1, gender);
			pr.setString(2, weight);
			rs = pr.executeQuery();
			
			rs.next();
			System.out.println("총 인원은 " + rs.getString(1) +"명이고 이름은" );
			
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
