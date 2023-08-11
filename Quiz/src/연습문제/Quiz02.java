package 연습문제;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Quiz02 {
	public static void main(String[] args) {
		List<HashMap<String, String>> list = new ArrayList<>();
		HashMap<String, String> map;
		
		map = new HashMap<>();
		map.put("eng", "boy");
		map.put("han", "머스마");
		list.add(map);
		
		map = new HashMap<>();
		map.put("eng", "girl");
		map.put("han", "가스나");
		list.add(map);
		
		list.forEach( m -> System.out.println(m.get("eng")+ " = "+ m.get("han")));
		
	}
}
