package �÷���;

import java.util.*;


public class InteratorDemo {

	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("�ٶ���","������","����");
		Iterator<String> iterator =list.iterator();//�ش� list�� �ݺ��ڸ����
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+"-");//���� ��� ��� (���ʿ��� �ƹ��͵� ����Ű�� ���� ����. next�� �ؾ߸� ���𰡸� ����Ű�� �ִ�.
		}
		
		iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+"+");
		}
		iterator = list.iterator();//�ݺ���
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+"");
		}
	}

}
