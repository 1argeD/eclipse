package ���ǹ�����;
import java.util.Scanner;

public class ���ǹ����� {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		int num = in.nextInt();
		int s = num+3*3/2;
		
		if(s>10) {
			System.out.println("��� ���� 10���� Ů�ϴ�.");
		} else if(s<10) {
			System.out.println("��� ���� 10���� �۽��ϴ�.");		
		} else {
			System.out.println("��� ���� 10�Դϴ�.");
		} 
	}

}
