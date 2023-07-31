package 조건문퀴즈;
import java.util.Random;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		Random ran = new Random();
		int random = ran.nextInt(10)+1;
		
		System.out.print("홀 짝 을 입력하세요 : ");
		String answer = in.nextLine();
		
		oddOrEven(answer, random);
		
		while((answer.equals("짝") && random%2!=0) || (answer.equals("홀") && random%2!=1)){
			System.out.print("홀 짝 을 다시 입력하세요 : ");
			answer = in.next();
			random = ran.nextInt(10)+1;
			
			oddOrEven(answer, random);
		}
	}
	
	public static void oddOrEven(String answer, int random){
		if((answer.equals("짝") && random%2==0) || (answer.equals("홀") && random%2==1)) {
			System.out.println("숫자는 "+ random +"이고 정답입니다!");
		} else {
				System.out.println("숫자는 "+ random +"이었고 틀렸습니다");
			}
	}
}
