package ���ǹ�����;
import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		/*
		 *	ǥ�ظ����� 
		 * 	���� -100*10 = ǥ�ظ�����
		 * 		������ �Է��� �ּ���.
		 * 		������ �Է����ּ���
		 * 		�����Ը� �Է����ּ���
		 * 		����� ��ü���Դϴ�
		 * 		or ����� ��ü���Դϴ�.
		 * 		or �Ϻ��� ǥ���Դϴ�.
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� : ");
		String gender = in.next();
		
		System.out.print("������ �Է��ϼ��� : ");
		int height = in.nextInt();
		
		System.out.print("�����Ը� �Է��ϼ��� : ");
		int weight = in.nextInt();
		
		double STW;
		
		if(gender.equals("��")||gender.equals("1")) {
			
			STW = height-100;
			
			checkWeight(STW,weight);
			
		} else if(gender.equals("��")||gender.equals("2")){
			
			STW = (height-100)*0.9;
			
			checkWeight(STW,weight);
		}
		
	}
	
	public static void checkWeight(double STW, int weight) {
		if(STW>weight) {
			System.out.println("����� ��ü���Դϴ�");
		} else if(STW < weight) {
			System.out.println("����� ��ü���Դϴ�");
		} else {
			System.out.println("�Ϻ��� ǥ���Դϴ�");
		}
	}
}
