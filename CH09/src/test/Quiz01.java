package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����ð��� �˷��ٰԿ�.\n���ϴ� ��������� �Է����ּ���:");
		String str = sc.nextLine();//�ð� Ǯ������ ����  �ޱ�
		String w = str.equals("") ?  "MM-dd-E����" : str; // �� ������ Ȯ��
		
		SimpleDateFormat f = new SimpleDateFormat(w);
			
		Date date = new Date();//������� �ð��� ����ð� �׷��ϱ� �ʿ��� �� �����ؾ� ��Ȯ�� �ð� ���� ���� �� �ִ�.
		
		System.out.println(f.format(date));
		
		sc.close();
		
	}
}
