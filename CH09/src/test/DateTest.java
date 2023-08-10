package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date);
		
		//��¥�� ���ϴ� �������� ����ϱ� ���ؼ�
		SimpleDateFormat f= new SimpleDateFormat("yyyy/MM/dd");
		String fDate = f.format(date);
		System.out.println(fDate);
		
		//���ϴ� �������� �Է¹ޱ� ����
		SimpleDateFormat f2= new SimpleDateFormat("yy-MM-dd");
		try{
			date=f2.parse("2023-08-15");

		} catch(ParseException e) {
		System.out.println("�߸��� �Է�");
		}
		System.out.println(f2.format(date));
		
		//��¥��� 
	// ����ð�
		try {
			Date date1 = new Date();
			Long tSub = date.getTime() - date1.getTime();
			System.out.println(tSub);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
