package P471;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> score = new ArrayList<>();
		int answer=1;
		do {
				System.out.print("������ �Է��ϼ��� : ");
				answer=sc.nextInt();
				if(answer>0) {
					score.add(answer);	
				}else {
					break;
				}
			
		} while(answer>0);
		
		System.out.println("��ü �л��� "+score.size()+"���̴�");
		System.out.print("�л����� ���� :");
		
		score.forEach(o -> System.out.print(o+" "));
		
		
		ArrayList<Integer> newList;
		newList = (ArrayList<Integer>) score.clone();
		
//		Collections.sort((ArrayList<Integer>)score.clone());
		
		newList.sort(Comparator.naturalOrder());
//		System.out.println("����Ʈ ��: "+newList);
		
		
		int best=0;
		int i = 0;
		
//		int ae = 0;	
//		
//		for(int b : score) {
//	
//			if(ae<b) {
//				ae=b;
//				best = ae;
//			} 
//		}
		
//		System.out.println();
//		System.out.println("best��"+best);
		
		best = newList.get(newList.size()-1);
		System.out.println("best��"+best);
		
		
		for(int a : score) {
			if((best-10)<=a) {
				System.out.println(i+"���� �л��� ������"+a+"���̸� �����"+"A�̴�.");
			}else if((best-20)<a) {
				System.out.println(i+"���� �л��� ������"+a+"���̸� �����"+"B�̴�.");
			}else if((best-30)<a){
				System.out.println(i+"���� �л��� ������"+a+"���̸� �����"+"C�̴�.");
			}else {
				System.out.println(i+"���� �л��� ������"+a+"���̸� �����"+"D�̴�.");
			}
			i++;
		}
	}
}	
