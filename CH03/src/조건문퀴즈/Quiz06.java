package 조건문퀴즈;
import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해 주세요 : ");
		int k = sc.nextInt();
		
		if((k%7==0 && k%3==0)||k%2!=0) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}

}
