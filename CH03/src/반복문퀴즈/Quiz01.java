package �ݺ�������;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
//		int sum=0;
//		
//		for(int i = 0; i<=10; i++) {
//			sum=sum+i;
//		}
//		System.out.println(sum);
////////////////////////////////////////////////////////////////////		
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		System.out.print("ó���� �Է��ϱ� : ");
//		int a = sc.nextInt();
//		System.out.print("�������� �Է��ϱ� : ");
//		int b = sc.nextInt();
//		for(  ; a<=b ; a++) {
//			sum=a+sum;
//		}
//		System.out.println(sum);
////////////////////////////////////////////////////////////////////
//		Scanner sc = new Scanner(System.in);
//		System.out.print("ó���� �Է��ϱ� : ");
//		int a = sc.nextInt();
//		System.out.print("�������� �Է��ϱ� : ");
//		int b = sc.nextInt();
//		
//		int sum = 0;
//		while(a<=b) {
//			sum=sum+a;
//			a++;
//		}
//		System.out.println(sum);
//	}
//////////////////////////////////////////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		System.out.print("ó���� �Է��ϱ� : ");
		int a = sc.nextInt();
		System.out.print("�������� �Է��ϱ� : ");
		int b = sc.nextInt();
		
		int sum=0;
		
		if(a>b) {
			int c=a;
			a=b;
			b=c;
		}
		
		for(  ; a<=b ; a++) {
			sum=a+sum;
			}
		
		System.out.println(sum);
	}
	
//		if(a<b) {
//			for(  ; a<=b ; a++) {
//			sum=a+sum;
//			}
//			System.out.println(sum);
//		} else {
//			for(  ; b<=a ; b++) {
//				sum=b+sum;
//				}
//			System.out.println(sum);
//			}
//		}
	
		
	

}
