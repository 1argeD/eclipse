package �Լ�;

import java.util.Scanner;

public class MethodTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ϴ� ����� �������ּ���((ex)���ϱ�, ���ϱ�, ������) : ");
		String want = in.nextLine();
		
		System.out.print("a�� �Է����ּ��� : ");
		int a = sc.nextInt();
		System.out.print("b�� �Է����ּ��� : ");
		int b = sc.nextInt();
		
		int answer = claculate(want, a, b);
		System.out.println("��갪�� "+ answer +"�Դϴ�.");
	}
	
	public static int claculate(String want,int a, int b) {
		
		if(want.equals("���ϱ�")) {
			return a+b;
		} else if(want.equals("���ϱ�")) {
			return a*b;
		} else if(want.equals("������")) {
			return a/b;
		} else if(want.equals("����")) {
			return a-b;
		} else {
			System.out.println("���ϴ� ����� �������� �ʰų�, �Է°��� ��Ÿ�� �ֽ��ϴ�.");
		}
		return 0;
		
	}
}
