package ���ǹ�����;
import java.util.Random;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		Random ran = new Random();
		int random = ran.nextInt(10)+1;
		
		System.out.print("Ȧ ¦ �� �Է��ϼ��� : ");
		String answer = in.nextLine();
		
		oddOrEven(answer, random);
		
		while((answer.equals("¦") && random%2!=0) || (answer.equals("Ȧ") && random%2!=1)){
			System.out.print("Ȧ ¦ �� �ٽ� �Է��ϼ��� : ");
			answer = in.next();
			random = ran.nextInt(10)+1;
			
			oddOrEven(answer, random);
		}
	}
	
	public static void oddOrEven(String answer, int random){
		if((answer.equals("¦") && random%2==0) || (answer.equals("Ȧ") && random%2==1)) {
			System.out.println("���ڴ� "+ random +"�̰� �����Դϴ�!");
		} else {
				System.out.println("���ڴ� "+ random +"�̾��� Ʋ�Ƚ��ϴ�");
			}
	}
}
