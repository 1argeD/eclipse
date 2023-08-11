package 연습문제;

import java.util.ArrayList;

public class Quiz01 {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		
		String[] words = {"갈매기","나비","다람쥐","라마"};
		
		for(String w : words) {
			ar.add(w);
		}
		
//		ar.add("갈매기");
//		ar.add("나비");
//		ar.add("다람쥐");
//		ar.add("라마");
		
//		for(String a : ar) {
//			if(a.length()<3) {
//				System.out.println(a);
//			}
//		}
		ar.stream()
		.filter(o->o.length()<3)
		.forEach(o->System.out.println(o));
	}
}
