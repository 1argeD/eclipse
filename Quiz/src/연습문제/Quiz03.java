package ��������;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		Map<String, Integer> map = new Hashtable<>();
		map.put("�迭��", 88);	map.put("�ְ��", 88);
		map.put("����", 88);	map.put("���ڹ�", 88);
		
		for(String key : map.keySet()) {
				System.out.println(key);
		}
		for(Integer value : map.values()) {
			System.out.println(value);
		}
		System.out.println(map.get("���ڹ�"));
		
		/* 				   	���� ����    ������ �ߺ�
		 * List(������) 		O		O
		 * Set(������)		X		X
		 * Map(Ű�� ������)		X		O(��, Ű���� �ߺ��� �Ұ�)
		 * 
		 */
	}

}
