package 기초문제14번문제;

import java.util.Random;

public class Test14 {
	public static void main(String[] args) {
		Random rd = new Random();
		int sum=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<6; j++) {
//				int num=rd.nextInt(101);
//				System.out.print(num+" ");
//				sum+=num;
//			}
//			System.out.println();//줄바꾸기
//		}
//		int num1 = rd.nextInt(101);
//		int num2 = rd.nextInt(101);
//		
//		sum=sum+num1+num2;
//		System.out.println(num1+ " " + num2);
//		System.out.println(sum);
//		
		
		////////////////////////////////
		
		for(int i=0; i<=50; i++) {
			int num = rd.nextInt(101);
			System.out.print(num+"\t");
			sum += num;
			if(i%6==0) {
				System.out.println();
			}
		}
		System.out.println("\n합="+sum);
	}
}
