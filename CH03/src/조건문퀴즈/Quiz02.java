package 조건문퀴즈;
import java.util.Scanner;

public class Quiz02 {
 public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 
	 System.out.print("숫자를 입력하세요 : ");
	 int a = in.nextInt();
	 if(a%2==0) {
		 System.out.println("입렵값은 짝수입니다");
	 } else {
		 System.out.println("입렵값은 홀수입니다");
	 }
 }
}
