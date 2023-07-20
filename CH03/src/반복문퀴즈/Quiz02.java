package 반복문퀴즈;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;

		do {
			int num;
			do {
				System.out.print("숫자입력 : ");
				num = sc.nextInt(); 
				if(String.valueOf(num).split("")[0].equals("-")) {
					System.out.print("양수를 입력해주세요.: ");
					num = sc.nextInt();
				}else if(num>100){
					System.out.print("100보다 작은 숫자를 입력해주세요. : ");
					num = sc.nextInt();	
				}
			} while(num>100||num<0);
			System.out.println("입력된 숫자의 제곱은 "+num*num+"입니다.");
			System.out.println("계속하시겠습니까?: ");
			answer = sc.next();
		} while(answer.equals("네")); 
	}
	
//		if(num>100) {
//			System.out.print("100보다 작은 숫자를 입력해주세요.");
//		num = sc.nextInt();
//		} else {
//			System.out.println("입력된 숫자의 제곱은 "+num*num+"입니다.");
//		}
}
