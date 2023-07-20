package 조건문퀴즈;
import java.util.Scanner;

public class 조건문퀴즈 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int num = in.nextInt();
		int s = num+3*3/2;
		
		if(s>10) {
			System.out.println("계산 값은 10보다 큽니다.");
		} else if(s<10) {
			System.out.println("계산 값은 10보다 작습니다.");		
		} else {
			System.out.println("계산 값은 10입니다.");
		} 
	}

}
