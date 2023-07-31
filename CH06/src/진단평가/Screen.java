package 진단평가;

import java.util.Scanner;

public class Screen {
	static Scanner sc = new Scanner(System.in);
	static int answer;
	static int[] num = new int[4];
	
	public static void main(String[] args) {
		title();
		System.out.println("숫자입력 ");
		System.out.println("프로그램 종료");
		System.out.print("입력하세요(1,2) : ");
		answer = sc.nextInt();
		do {	
			if(answer == 1) {		
				for(int i=0; i<4; i++) {
					System.out.println(i+1+"번째 숫자를 입력해주세요");
					num[i]=sc.nextInt();
				}
			MinMax mn = new MinMax(num[0],num[1],num[2],num[3]);
			System.out.println("가장 큰 수는 "+ mn.max(mn.a(), mn.b(), mn.c(), mn.d())+"입니다");
			System.out.println("가장 작은 수는 "+ mn.min(mn.a(), mn.b(), mn.c(), mn.d())+"입니다");	
			System.out.println();
			
			System.out.println("숫자입력 ");
			System.out.println("프로그램 종료");
			System.out.print("입력하세요(1,2) : ");
			answer = sc.nextInt();
		} else if(answer == 2){
				break;
		} else {
			System.out.print("1과 2중에 하나만 입력하세요. : ");
			answer = sc.nextInt();
		}
			
		} while(answer==1 || answer!=2);
		end();
		
	}
	
		static void title() {
			System.out.println("------------------------------------------------");
			System.out.println("----------------숫자 분석 프로그램---------------------");
			System.out.println("------------------------------------------------");
		}
		
		static void end() {
			System.out.println("------------------------------------------------");
			System.out.println("--------------------감사합니다---------------------");
			System.out.println("------------------------------------------------");
		}
		
		
	}

