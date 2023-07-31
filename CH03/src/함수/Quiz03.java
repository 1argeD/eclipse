package 함수;

import java.util.Random;

public class Quiz03 {

	public static void main(String[] args) {
		
		System.out.println(myRandom());
			//자바는 메소드 파라미터의 타입과 개수를 가지고 구분할 수 있다.- 메소드가 구분 가능시 동일 이름 허용
			//메소드오버로딩(method overloading)
	}
	
	private static int myRandom() {
		Random rd = new Random(); 
		return rd.nextInt(10)+1; 
	}
	
	private static int myRandom(int a) {
		return 0;
	}
	
	private static int myRandom(double a) {
		return 0;
	}

}
