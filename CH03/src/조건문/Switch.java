package ���ǹ�;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		System.out.print("���� �Է��ϱ� : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num==1) {
			System.out.println("1�̴�.");
		}else if(num == 2) {
			System.out.println("2�̴�.");
		}else if(num == 3){
			System.out.println("3�̴�.");
		}else if(num == 4) {
			System.out.println("4�̴�.");
		}else {
			System.out.println("�𸣴� �����̴�");
		}
		
		switch(num) {
		 case 1 : System.out.println("1�̴�.");
	 			break;
		 case 2 : System.out.println("2�̴�.");
	 			break;
		 case 3 : System.out.println("3�̴�.");
		 		break;
		 case 4 : System.out.println("4�̴�.");
		 		break;
		 default : System.out.println("�𸣴� �����̴�");
		}
		
		
	}
}
