package ���ʹ���6;

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
		System.out.print("������ : ");
		r=sc.nextInt();
		area = r*r*pi;
		System.out.println("���� : "+area);
	}
	
	public void  triangle() {
		int a,h;
		System.out.println("\n**** �ﰢ���� ���� ****");
		System.out.print("�Ʒ��� : ");
		a=sc.nextInt();
		System.out.print("�� �� : ");
		h=sc.nextInt();
		
		area = a*h/2;
		System.out.print("�� �� : "+area);
	}
	
	public void trapezoid() {
		int a,b,h;
		System.out.println("\n**** ��ٸ����� ���� ****");
		System.out.print("�Ʒ��� : ");
		a=sc.nextInt();
		System.out.print("�� �� : ");
		b=sc.nextInt();
		System.out.print("�� �� : ");
		h=sc.nextInt();
		
		area = (a+b)*h/2;
		System.out.print("�� �� : "+area);
		
	}
	
	public int menu() {
		int a;
		
		System.out.println("\n**** �������� ****");
		System.out.println("\n1. �ﰢ��");
		System.out.println("\n2. ��");
		System.out.println("\n3. ��ٸ���");
		System.out.println("\n4. ����");
		System.out.print("\n���� : ");
		a = sc.nextInt();
		
		 switch(a) {
	 			case 1 : triangle(); break;
	 			case 2 : circle(); break;
	 			case 3 : trapezoid(); break;
	 			case 4 : System.out.println("\n�����մϴ�^.^"); break;
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