package ����ó��;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���");
		String num = sc.nextLine();
		
		try {
			int k = Integer.parseInt(num);
			if(k>100) {
				System.out.println(k+"��(��) 100���� Ů�ϴ�.");
			}else if(k==100) {
				System.out.println(k+"�� 100�� �����ϴ�.");
			} else {
				System.out.println(k+"��(��) 100���� �۽��ϴ�.");
			}
		} catch(Exception e) {
			System.out.println("'�߸��� �Է��Դϴ�.'");
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
		System.out.println("�Ʒ����� �̾ ����");
	}
}
