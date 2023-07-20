package 조건문퀴즈;
import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();

		if (grade >= 90) {
			System.out.println("수");
		} else if (grade >= 80) {
			System.out.println("우");
		} else if (grade >= 70) {
			System.out.println("미");
		} else if (grade >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
	}
}
