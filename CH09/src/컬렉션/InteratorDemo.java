package 컬렉션;

import java.util.*;


public class InteratorDemo {

	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("다람쥐","개구리","나비");
		Iterator<String> iterator =list.iterator();//해당 list에 반복자만들기
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+"-");//다음 요소 출력 (최초에는 아무것도 가리키고 있지 않음. next를 해야만 무언가를 가리키고 있다.
		}
		
		iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+"+");
		}
		iterator = list.iterator();//반복자
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+"");
		}
	}

}
