package ���ʹ���;

import java.util.Scanner;

public class Helth {
	 static char gender;
	 static double tall;
	 static double weight;
	
	public Helth() {
		
	}
	
	public Helth(char gender,double tall,double weight) {
		this.gender = gender; 
		this.tall = tall; 
		this.weight = weight;
	}
	
	public static void input() {
		System.out.println("***** �񸸵� Check *****");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("����(M/F) : ");
		gender = sc.nextLine().charAt(0);
		System.out.println();
		System.out.print("����(Cm) : ");
		tall = sc.nextDouble();
		System.out.println();
		System.out.print("ü��(Kg)  : ");
		weight = sc.nextDouble();
		sc.close();
	}
	
	public static void output(double fat, String result) {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("���� - " + gender);
		System.out.println();
		System.out.println("���� - " + tall);
		System.out.println();
		System.out.println("ü�� - " + weight);
		System.out.println();
		System.out.println();
		System.out.println("����� �񸸵� " + String.valueOf(fat).substring(0,6) +"�̰�, " + result +" �Դϴ�");
		
	}

}
