package 반복문퀴즈;

import java.util.Random;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("주사위를 굴릴 횟수 정하기 : ");
		int cnt = sc.nextInt();

		do{
			if(cnt==0) {
			System.out.print("주사위를 한 번 이상 굴려주세요. : ");
			cnt = sc.nextInt();
			}
		}while(cnt==0);
		
		DiceCNT(cnt);
	}
	
	public static void DiceCNT(int cnt) {
		Random rd = new Random();
		
		int dice=0;
		String per = "";
		int DiceNumberCount;
		
		for(int i=1; i<=6;i++) {
			DiceNumberCount=0;
			for(int k=0; k<cnt; k++) {
				dice = rd.nextInt(6)+1;
					if(dice == i) {
						++DiceNumberCount;
						}
					}
			per = String.valueOf(((double)DiceNumberCount/cnt*100)).substring(0, 3);
			System.out.println(i+"은 총 "+DiceNumberCount+"번 나왔으며, 확률은 : "+ per +"%입니다");
		}
	}
	
}
