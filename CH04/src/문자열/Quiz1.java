package ���ڿ�;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		//����ڷ� ���� ���ڸ� �Է¹޾� ��������� �˷��ִ� ���α׷�.
		Scanner in = new Scanner(System.in);
		System.out.println("�����Է�");
		String words = in.nextLine();
		System.out.print("\n�Է��� ���ڿ��� ���� : " +words.length());
		String[] arrays = words.split(",");//,, '' "" �� null���� ���ڷ� ����ؼ� �ڸ���.
		
		System.out.println("\n�Է��� �迭 : ");
		for(int i=0; i<arrays.length; i++) {
			System.out.print(arrays[i]+" ");	
		}

		System.out.println("\n(for-each������ ���)�Է��� �迭 : ");
		//for each ����-����� for��
		for(String w : arrays) {
			System.out.print(w+" ");
		}
		
	}
}
