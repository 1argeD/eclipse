package �ݺ���;

import java.util.Scanner;

public class DoWhileQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		
		do {
			if(a==0) {
				break;
			}else {
				System.out.println("a�� 0�� �ƴ�.");
				System.out.print("���ڸ� �ٽ� �Է��Ͻÿ� : ");
				a = sc.nextInt();
			}
		} while(a!=0);
		
		System.out.println("��");
		
	}
}
