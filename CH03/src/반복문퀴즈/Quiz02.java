package �ݺ�������;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;

		do {
			int num;
			do {
				System.out.print("�����Է� : ");
				num = sc.nextInt(); 
				if(String.valueOf(num).split("")[0].equals("-")) {
					System.out.print("����� �Է����ּ���.: ");
					num = sc.nextInt();
				}else if(num>100){
					System.out.print("100���� ���� ���ڸ� �Է����ּ���. : ");
					num = sc.nextInt();	
				}
			} while(num>100||num<0);
			System.out.println("�Էµ� ������ ������ "+num*num+"�Դϴ�.");
			System.out.println("����Ͻðڽ��ϱ�?: ");
			answer = sc.next();
		} while(answer.equals("��")); 
	}
	
//		if(num>100) {
//			System.out.print("100���� ���� ���ڸ� �Է����ּ���.");
//		num = sc.nextInt();
//		} else {
//			System.out.println("�Էµ� ������ ������ "+num*num+"�Դϴ�.");
//		}
}
