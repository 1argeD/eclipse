package Quiz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Time {
	public void dateCal() {
		Scanner sc = new Scanner(System.in);
		
		long daysBetween=0;
		System.out.print("����� ��¥�� �Է��� �ּ���(���� : yyyy/MM/dd):");
		Date now = new Date();
		String cal = sc.nextLine();
		if(cal.equals("")) cal="yyyy/MM/dd";
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			daysBetween = f.parse(cal).getTime() - now.getTime();
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		int Ddays = (int) (daysBetween/(24*60*60*1000));
		System.out.println("���� ��¥�� "+Ddays+"�� �Դϴ�.");		
	};
}
