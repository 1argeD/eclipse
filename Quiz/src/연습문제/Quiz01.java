package ��������;

import java.util.ArrayList;

public class Quiz01 {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		
		String[] words = {"���ű�","����","�ٶ���","��"};
		
		for(String w : words) {
			ar.add(w);
		}
		
//		ar.add("���ű�");
//		ar.add("����");
//		ar.add("�ٶ���");
//		ar.add("��");
		
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
