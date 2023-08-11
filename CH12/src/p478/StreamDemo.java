package p478;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for(int i = 0; i<10; i++) list.add(rd.nextInt(30));
			
		System.out.println("\n----------------스트림-------------------------");
		Stream<Integer> stream = list.stream();
		stream = stream.filter(o -> o>10);
		stream = stream.sorted();//오름차순
		stream.forEach(o->System.out.print(o+" "));
		System.out.println("\n----------------스트림 다시쓰면-------------------------");
		
		list.stream().filter(o -> o>10).sorted().forEach(o->System.out.print(o+" "));
		
		System.out.println("\n----------------list2에 담아서 출력하기----------------------");
		
		for(int a :	list.stream().filter(o->o>10).collect(Collectors.toList())) list2.add(a);
		
		System.out.println(list);
		System.out.println(list2);
		
	}
}
