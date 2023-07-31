package 반복문퀴즈;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("큰수와 작은수 중 어떤 값을 받고 싶은가요? : ");
		String answer = in.nextLine();

		Scanner sc = new Scanner(System.in);
		System.out.print("a 입력하기 : ");
		int a = sc.nextInt();
		System.out.print("b 입력하기 : ");
		int b = sc.nextInt();
		String str = "";

		do {
			if (a == b) {
				System.out.println("정신차려!");
				System.out.print("a 입력하기 : ");
				a = sc.nextInt();
				System.out.print("b 입력하기 : ");
				b = sc.nextInt();
			}
		} while (a == b);

		if (answer.equals("큰수") || answer.equals("1")) {
			if (a < b) {
				a = b;
				str = "큰";
				System.out.println("숫자 " + a + "가 더 " + str + " 수입니다.");
			}
		} else if (answer.equals("작은수") || answer.equals("2")) {
			if (a > b) {
				a = b;
				str = "작은";
				System.out.println("숫자 " + a + "가 " + str + " 수입니다.");
			}
		}

	}

}
