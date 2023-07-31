package 배열;

import java.util.Random;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.print("주사위를 굴릴 횟수를 정하시오 : ");
		int throwDice = sc.nextInt();
		int cnt = 0;
		
		int[] numList = new int[throwDice];
		
		System.out.print("주사위 결과 : ");
		
		for(int i=0; i<throwDice; i++) {
			numList[i] = ran.nextInt(6)+1;
			System.out.print(numList[i]+",");
		}
		
		System.out.println();
		
		for(int j=1; j<=6;j++) {
			cnt=0;
			for(int num : numList) {
				if(num==j) {
					cnt++;
				}
			}
			
			System.out.println("주사위 "+j+"는 총 " +cnt+"번 만큼 나왔으며, "
					+ ""+"확률은 "+ ((double)cnt/throwDice*100)+"%입니다.");
		
		}
		
		
	}

}
