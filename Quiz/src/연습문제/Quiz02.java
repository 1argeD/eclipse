package ��������;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Quiz02 {
	public static void main(String[] args) {
		List<HashMap<String, String>> list = new ArrayList<>();
		HashMap<String, String> map;
		
		map = new HashMap<>();
		map.put("eng", "boy");
		map.put("han", "�ӽ���");
		list.add(map);
		
		map = new HashMap<>();
		map.put("eng", "girl");
		map.put("han", "������");
		list.add(map);
		
		list.forEach( m -> System.out.println(m.get("eng")+ " = "+ m.get("han")));
		
	}
}
