package ���ǹ�����;
import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();

		if (grade >= 90) {
			System.out.println("��");
		} else if (grade >= 80) {
			System.out.println("��");
		} else if (grade >= 70) {
			System.out.println("��");
		} else if (grade >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
	}
}
