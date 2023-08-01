package 기초문제6;

import java.util.Scanner;

public class Test33 {
	static final double pi  = 3.141592;
	private double area;
	static Scanner sc = new Scanner(System.in); 
	
	public Test33() {
		area=0.0;
	}
	
	public void  circle() {
		int r;
		System.out.print("반지름 : ");
		r=sc.nextInt();
		area = r*r*pi;
		System.out.println("넓이 : "+area);
	}
	
	public void  triangle() {
		int a,h;
		System.out.println("\n**** 삼각형의 넓이 ****");
		System.out.print("아래변 : ");
		a=sc.nextInt();
		System.out.print("윗 변 : ");
		h=sc.nextInt();
		
		area = a*h/2;
		System.out.print("넓 이 : "+area);
	}
	
	public void trapezoid() {
		int a,b,h;
		System.out.println("\n**** 사다리꼴의 넓이 ****");
		System.out.print("아래변 : ");
		a=sc.nextInt();
		System.out.print("윗 변 : ");
		b=sc.nextInt();
		System.out.print("높 이 : ");
		h=sc.nextInt();
		
		area = (a+b)*h/2;
		System.out.print("넓 이 : "+area);
		
	}
	
	public int menu() {
		int a;
		
		System.out.println("\n**** 도형선택 ****");
		System.out.println("\n1. 삼각형");
		System.out.println("\n2. 원");
		System.out.println("\n3. 사다리꼴");
		System.out.println("\n4. 종료");
		System.out.print("\n선택 : ");
		a = sc.nextInt();
		
		 switch(a) {
	 			case 1 : triangle(); break;
	 			case 2 : circle(); break;
	 			case 3 : trapezoid(); break;
	 			case 4 : System.out.println("\n감사합니다^.^"); break;
		 }
		 return a;
	}
	
	
	public static void main(String[] args) {
		Test33 ob = new Test33();
		while(true) {
			if(ob.menu()==4)break;
		}
		sc.close();
	}
	
	
}