package 조건문;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		System.out.print("숫자 입력하기 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num==1) {
			System.out.println("1이다.");
		}else if(num == 2) {
			System.out.println("2이다.");
		}else if(num == 3){
			System.out.println("3이다.");
		}else if(num == 4) {
			System.out.println("4이다.");
		}else {
			System.out.println("모르는 숫자이다");
		}
		
		switch(num) {
		 case 1 : System.out.println("1이다.");
	 			break;
		 case 2 : System.out.println("2이다.");
	 			break;
		 case 3 : System.out.println("3이다.");
		 		break;
		 case 4 : System.out.println("4이다.");
		 		break;
		 default : System.out.println("모르는 숫자이다");
		}
		
		
	}
}
