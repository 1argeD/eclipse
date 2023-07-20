package 반복문퀴즈;

import java.util.Random;
import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Random rc = new Random();
		int oldOrEven = rc.nextInt(2);
//		System.out.println("치트키 " + oldOrEven);

		
		System.out.println("게임을 시작합니다.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("홀 짝을 입력하시오 : ");
		int input = sc.nextInt();
		int countinue = 1;
		int money = 200;
		
		do {
			if(input == oldOrEven) {
				System.out.println("맞췄습니다");
				money = money*2;
			} else {
				System.out.println("틀렸습니다");
				money=0;
				System.out.println("최종 금액은"+money+"원 입니다.");
				System.out.println("게임을 종료합니다.");
				break;
			}
			System.out.println("계속하시겠습니까?(현재 확보 금액 : "+money+"원 ) : ");
			countinue = sc.nextInt();
			
			if(countinue!=1) {
				System.out.println("게임을 종료합니다.");
				System.out.println("최종 확보 금액 : "+money+"원!");
				break;
			}
			
			System.out.println("홀 짝을 다시 입력하시오 : ");
			oldOrEven = rc.nextInt(2);
//				System.out.println("치트키 " + oldOrEven);
			
			input = sc.nextInt();
			
			if(input != oldOrEven) {
				System.out.println("틀렸습니다");
				money=0;
				System.out.println("최종 금액은"+money+"원 입니다.");
				System.out.println("게임을 종료합니다.");
				break;
			}
		}while(input == oldOrEven);
	} 
		
}
