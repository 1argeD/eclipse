package �ݺ�������;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("ū���� ������ �� � ���� �ް� ��������? : ");
		String answer = in.nextLine();

		Scanner sc = new Scanner(System.in);
		System.out.print("a �Է��ϱ� : ");
		int a = sc.nextInt();
		System.out.print("b �Է��ϱ� : ");
		int b = sc.nextInt();
		String str = "";

		do {
			if (a == b) {
				System.out.println("��������!");
				System.out.print("a �Է��ϱ� : ");
				a = sc.nextInt();
				System.out.print("b �Է��ϱ� : ");
				b = sc.nextInt();
			}
		} while (a == b);

		if (answer.equals("ū��") || answer.equals("1")) {
			if (a < b) {
				a = b;
				str = "ū";
				System.out.println("���� " + a + "�� �� " + str + " ���Դϴ�.");
			}
		} else if (answer.equals("������") || answer.equals("2")) {
			if (a > b) {
				a = b;
				str = "����";
				System.out.println("���� " + a + "�� " + str + " ���Դϴ�.");
			}
		}

	}

}
