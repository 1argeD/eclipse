package 연습문제;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		Map<String, Integer> map = new Hashtable<>();
		map.put("김열공", 88);	map.put("최고봉", 88);
		map.put("우등생", 88);	map.put("나자바", 88);
		
		for(String key : map.keySet()) {
				System.out.println(key);
		}
		for(Integer value : map.values()) {
			System.out.println(value);
		}
		System.out.println(map.get("나자바"));
		
		/* 				   	순서 유무    데이터 중복
		 * List(데이터) 		O		O
		 * Set(데이터)		X		X
		 * Map(키와 데이터)		X		O(단, 키값은 중복이 불가)
		 * 
		 */
	}

}
