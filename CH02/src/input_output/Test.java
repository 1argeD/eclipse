package input_output;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		int a = 3, b = 7;
		
		System.out.println("���� ���� ��ȣ ������ �����"+(a+b));
		
		System.out.println("�׳� ����="+a+" ��(��)"+b);
		//���ڴ� + ��ȣ�� ���ؼ� �̾ ����� �� �ִ�.
		//���ڿ� ������ + ��ȣ�� ���ڷ� ó���ȴ�.	
		
		//������ �Է��ϴ� ��
		Scanner in = new Scanner(System.in);
		System.out.println("a�� �Է��ϼ���");
		a = in.nextInt(); //Ű����κ��� ������ �Է� ����.
		System.out.println("b�� �Է��ϼ���");
		b = in.nextInt();
		
		System.out.println("���� �Է��� ���ڴ�");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
