package 문자열;

import java.util.Scanner;

public class P172 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		String s1 = sc.nextLine();
		if(s1 .equals("Y") ) {// == 는 같은 객체인가 를 비교할떄 사용. 문자(내용)을 비교하고 싶을때 .equals()메소드를 사용
			System.out.println("예스 입력");
		}else {
			System.out.println("노입력");
		}
		System.out.println("문자길이"+s1.length());//빈칸도 하나의 글자로 취급한다 tab으로 띄워도 한글자
		System.out.println("문자 부분 추출"+s1.substring(3));
		System.out.println("문자 부분 추출"+s1.substring(3,6));
		System.out.println("앞뒤공백제거"+s1.trim());//공백을 지울때 사용
	}

}
