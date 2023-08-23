package mit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DBClass {
	Connection conn;
	PreparedStatement pr;
	ResultSet rs;
	
	private void dbConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "aaa", "bbb");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//db 닫기
	private void dbClose() {
		if(rs!=null) try {rs.close();} catch (SQLException e) {}
		if(pr!=null) try {pr.close();} catch (SQLException e) {}
		if(conn!=null)try {conn.close();} catch (SQLException e) {};
	}
	//자바 테이블 생성
	void createTable() {
		dbConn();
		try {
			pr = conn.prepareStatement("select count(*) from all_tables where table_name = 'SUMNUM'");
			rs = pr.executeQuery();
			rs.next();
			if(rs.getInt(1)==1) {
				dbClose();
			} else {
				pr = conn.prepareStatement("create table AAA.SUMNUM");
				rs = pr.executeQuery();
				pr = conn.prepareStatement("create sequence num_key");
				rs = pr.executeQuery();
			}
		} catch (SQLException e) {}
		dbClose();
	};
	

	public void saveSumNum(Map<Num, Integer> sumNum) {
		dbConn();
		try {
			Set<Num> n = sumNum.keySet();
			pr = conn.prepareStatement("insert into SUMNUM select num_seq.nextval,?,? from SUMNUM");
			pr.setObject(1, n);
			pr.setInt(2, sumNum.get(n));
			rs = pr.executeQuery();
		} catch (Exception e) {}
		dbClose();
		
	}
	
	public Map<Num, Integer> checkLog() {
		dbConn();
		try {
			pr = conn.prepareStatement("select * from SUMNUM");
			rs = pr.executeQuery();
			while(rs.next()) {
				Map<Num, Integer> returnMap = new HashMap<Num, Integer>();
				rs.getObject(1);
			}
		} catch (Exception e) {}
		dbClose();
		return null;
	}
}
