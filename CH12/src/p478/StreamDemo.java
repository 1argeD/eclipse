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
			
		System.out.println("\n----------------��Ʈ��-------------------------");
		Stream<Integer> stream = list.stream();
		stream = stream.filter(o -> o>10);
		stream = stream.sorted();//��������
		stream.forEach(o->System.out.print(o+" "));
		System.out.println("\n----------------��Ʈ�� �ٽþ���-------------------------");
		
		list.stream().filter(o -> o>10).sorted().forEach(o->System.out.print(o+" "));
		
		System.out.println("\n----------------list2�� ��Ƽ� ����ϱ�----------------------");
		
		for(int a :	list.stream().filter(o->o>10).collect(Collectors.toList())) list2.add(a);
		
		System.out.println(list);
		System.out.println(list2);
		
	}
}
