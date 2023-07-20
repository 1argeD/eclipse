package 조건문퀴즈;
import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age>=19) {
			System.out.println("성년");
		} else {
			System.out.println("미성년");
		}
		
	}

}
