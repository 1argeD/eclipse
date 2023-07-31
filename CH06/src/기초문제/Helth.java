package 기초문제;

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
		System.out.println("***** 비만도 Check *****");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("성별(M/F) : ");
		gender = sc.nextLine().charAt(0);
		System.out.println();
		System.out.print("신장(Cm) : ");
		tall = sc.nextDouble();
		System.out.println();
		System.out.print("체중(Kg)  : ");
		weight = sc.nextDouble();
		sc.close();
	}
	
	public static void output(double fat, String result) {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("성병 - " + gender);
		System.out.println();
		System.out.println("신장 - " + tall);
		System.out.println();
		System.out.println("체중 - " + weight);
		System.out.println();
		System.out.println();
		System.out.println("당신은 비만도 " + String.valueOf(fat).substring(0,6) +"이고, " + result +" 입니다");
		
	}

}
