package �迭;

import java.util.Random;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.print("�ֻ����� ���� Ƚ���� ���Ͻÿ� : ");
		int throwDice = sc.nextInt();
		int cnt = 0;
		
		int[] numList = new int[throwDice];
		
		System.out.print("�ֻ��� ��� : ");
		
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
			
			System.out.println("�ֻ��� "+j+"�� �� " +cnt+"�� ��ŭ ��������, "
					+ ""+"Ȯ���� "+ ((double)cnt/throwDice*100)+"%�Դϴ�.");
		
		}
		
		
	}

}
