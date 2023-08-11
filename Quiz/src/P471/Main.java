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
				System.out.print("점수를 입력하세요 : ");
				answer=sc.nextInt();
				if(answer>0) {
					score.add(answer);	
				}else {
					break;
				}
			
		} while(answer>0);
		
		System.out.println("전체 학생은 "+score.size()+"명이다");
		System.out.print("학생들의 성적 :");
		
		score.forEach(o -> System.out.print(o+" "));
		
		
		ArrayList<Integer> newList;
		newList = (ArrayList<Integer>) score.clone();
		
//		Collections.sort((ArrayList<Integer>)score.clone());
		
		newList.sort(Comparator.naturalOrder());
//		System.out.println("리스트 값: "+newList);
		
		
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
//		System.out.println("best값"+best);
		
		best = newList.get(newList.size()-1);
		System.out.println("best값"+best);
		
		
		for(int a : score) {
			if((best-10)<=a) {
				System.out.println(i+"번쨰 학생의 성적은"+a+"점이며 등급은"+"A이다.");
			}else if((best-20)<a) {
				System.out.println(i+"번쨰 학생의 성적은"+a+"점이며 등급은"+"B이다.");
			}else if((best-30)<a){
				System.out.println(i+"번쨰 학생의 성적은"+a+"점이며 등급은"+"C이다.");
			}else {
				System.out.println(i+"번쨰 학생의 성적은"+a+"점이며 등급은"+"D이다.");
			}
			i++;
		}
	}
}	
