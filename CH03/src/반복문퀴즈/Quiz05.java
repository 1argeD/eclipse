package �ݺ�������;

import java.util.Random;
import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Random rc = new Random();
		int oldOrEven = rc.nextInt(2);
//		System.out.println("ġƮŰ " + oldOrEven);

		
		System.out.println("������ �����մϴ�.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ȧ ¦�� �Է��Ͻÿ� : ");
		int input = sc.nextInt();
		int countinue = 1;
		int money = 200;
		
		do {
			if(input == oldOrEven) {
				System.out.println("������ϴ�");
				money = money*2;
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�");
				money=0;
				System.out.println("���� �ݾ���"+money+"�� �Դϴ�.");
				System.out.println("������ �����մϴ�.");
				break;
			}
			System.out.println("����Ͻðڽ��ϱ�?(���� Ȯ�� �ݾ� : "+money+"�� ) : ");
			countinue = sc.nextInt();
			
			if(countinue!=1) {
				System.out.println("������ �����մϴ�.");
				System.out.println("���� Ȯ�� �ݾ� : "+money+"��!");
				break;
			}
			
			System.out.println("Ȧ ¦�� �ٽ� �Է��Ͻÿ� : ");
			oldOrEven = rc.nextInt(2);
//				System.out.println("ġƮŰ " + oldOrEven);
			
			input = sc.nextInt();
			
			if(input != oldOrEven) {
				System.out.println("Ʋ�Ƚ��ϴ�");
				money=0;
				System.out.println("���� �ݾ���"+money+"�� �Դϴ�.");
				System.out.println("������ �����մϴ�.");
				break;
			}
		}while(input == oldOrEven);
	} 
		
}
