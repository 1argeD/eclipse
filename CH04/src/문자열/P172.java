package ���ڿ�;

import java.util.Scanner;

public class P172 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է�");
		String s1 = sc.nextLine();
		if(s1 .equals("Y") ) {// == �� ���� ��ü�ΰ� �� ���ҋ� ���. ����(����)�� ���ϰ� ������ .equals()�޼ҵ带 ���
			System.out.println("���� �Է�");
		}else {
			System.out.println("���Է�");
		}
		System.out.println("���ڱ���"+s1.length());//��ĭ�� �ϳ��� ���ڷ� ����Ѵ� tab���� ����� �ѱ���
		System.out.println("���� �κ� ����"+s1.substring(3));
		System.out.println("���� �κ� ����"+s1.substring(3,6));
		System.out.println("�յڰ�������"+s1.trim());//������ ���ﶧ ���
	}

}
