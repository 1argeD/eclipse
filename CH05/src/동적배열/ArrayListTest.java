package �����迭;

import java.util.ArrayList;
import java.util.LinkedList;

//1. list�� ������ �ִ� ����� ����. 


public class ArrayListTest {
	static ArrayList<String> list = new ArrayList<>();//<>���׸� 
	static LinkedList<String> list2 = new LinkedList<>();
	
	public static void main(String[] args) {
		//arrayList
		
		list.add("ù��° ����");//���߰�
		list.add("�ι�° ����");
		list.add("����° ����");
		System.out.println(list.get(1));//index ���� ���ؼ� ������ �� �ִ�.
		list.remove(1);
		System.out.println(list.get(1));//�ι�° ���ڰ� remove�� �����Ǿ� ����° ���ڰ� ��µȴ�.
		
		//linkedList
		
		list2.add("ù��° ����");//���߰�
		list2.add("�ι�° ����");
		list2.add("����° ����");
		System.out.println(list.get(1));//index ���� ���ؼ� ������ �� �ִ�.
		list2.remove(1);
		System.out.println(list.get(1));//�ι�° ���ڰ� remove�� �����Ǿ� ����° ���ڰ� ��µȴ�.
		
		
		
	}
}
