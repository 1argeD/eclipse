package 조건문퀴즈;
import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검사할 연도를 입력하세요 : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0 ) {
			System.out.println(year + "년도는 윤년입니다");
		} else {
			System.out.println(year + "년도는 평년입니다");
		}
	}

}
