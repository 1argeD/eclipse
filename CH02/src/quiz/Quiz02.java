package quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("�� ���� �Է��� �ּ���");
		int a = in.nextInt(), b = in.nextInt();

		System.out.println(
				" �� ���� �� : " + (a+b) 
				+ ", �� ���� �� : "+ a*b 
				+ ", �� ���� ���� �� : " + a/b 
				+ ", �� ���� ���� ������ : " + a%b
				);
		
	}

}
