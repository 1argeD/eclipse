package quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� a,b,c,�� �Է��ϼ���");
		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
		
		System.out.println("a,b,c�� ���� ����մϴ�");
		System.out.println(a+b+c);
		//*,-,+, ��Ģ���� /(���� ���. ��, ���� ������ ���´�) %(�������� ���)
	}
}
