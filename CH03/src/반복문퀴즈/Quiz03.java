package �ݺ�������;

import java.util.Random;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("�ֻ����� ���� Ƚ�� ���ϱ� : ");
		int cnt = sc.nextInt();

		do{
			if(cnt==0) {
			System.out.print("�ֻ����� �� �� �̻� �����ּ���. : ");
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
			System.out.println(i+"�� �� "+DiceNumberCount+"�� ��������, Ȯ���� : "+ per +"%�Դϴ�");
		}
	}
	
}
