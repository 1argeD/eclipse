package ���ǹ�����;
import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��� �ּ��� : ");
		int k = sc.nextInt();
		
		if((k%7==0 && k%3==0)||k%2!=0) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}

}
