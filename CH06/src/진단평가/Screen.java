package ������;

import java.util.Scanner;

public class Screen {
	static Scanner sc = new Scanner(System.in);
	static int answer;
	static int[] num = new int[4];
	
	public static void main(String[] args) {
		title();
		System.out.println("�����Է� ");
		System.out.println("���α׷� ����");
		System.out.print("�Է��ϼ���(1,2) : ");
		answer = sc.nextInt();
		do {	
			if(answer == 1) {		
				for(int i=0; i<4; i++) {
					System.out.println(i+1+"��° ���ڸ� �Է����ּ���");
					num[i]=sc.nextInt();
				}
			MinMax mn = new MinMax(num[0],num[1],num[2],num[3]);
			System.out.println("���� ū ���� "+ mn.max(mn.a(), mn.b(), mn.c(), mn.d())+"�Դϴ�");
			System.out.println("���� ���� ���� "+ mn.min(mn.a(), mn.b(), mn.c(), mn.d())+"�Դϴ�");	
			System.out.println();
			
			System.out.println("�����Է� ");
			System.out.println("���α׷� ����");
			System.out.print("�Է��ϼ���(1,2) : ");
			answer = sc.nextInt();
		} else if(answer == 2){
				break;
		} else {
			System.out.print("1�� 2�߿� �ϳ��� �Է��ϼ���. : ");
			answer = sc.nextInt();
		}
			
		} while(answer==1 || answer!=2);
		end();
		
	}
	
		static void title() {
			System.out.println("------------------------------------------------");
			System.out.println("----------------���� �м� ���α׷�---------------------");
			System.out.println("------------------------------------------------");
		}
		
		static void end() {
			System.out.println("------------------------------------------------");
			System.out.println("--------------------�����մϴ�---------------------");
			System.out.println("------------------------------------------------");
		}
		
		
	}

