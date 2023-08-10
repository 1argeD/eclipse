package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date);
		
		//날짜를 원하는 포맷으로 출력하기 위해서
		SimpleDateFormat f= new SimpleDateFormat("yyyy/MM/dd");
		String fDate = f.format(date);
		System.out.println(fDate);
		
		//원하는 포맷으로 입력받기 위해
		SimpleDateFormat f2= new SimpleDateFormat("yy-MM-dd");
		try{
			date=f2.parse("2023-08-15");

		} catch(ParseException e) {
		System.out.println("잘못된 입력");
		}
		System.out.println(f2.format(date));
		
		//날짜계산 
	// 현재시간
		try {
			Date date1 = new Date();
			Long tSub = date.getTime() - date1.getTime();
			System.out.println(tSub);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
