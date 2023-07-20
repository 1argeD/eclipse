package input_output;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		int a = 3, b = 7;
		
		System.out.println("정수 값을 괄호 떄문에 계산함"+(a+b));
		
		System.out.println("그냥 나열="+a+" 과(와)"+b);
		//문자는 + 기호를 통해서 이어서 출력할 수 있다.
		//문자와 숫자의 + 기호는 문자로 처리된다.	
		
		//정수를 입력하는 법
		Scanner in = new Scanner(System.in);
		System.out.println("a를 입력하세요");
		a = in.nextInt(); //키보드로부터 정보를 입력 받음.
		System.out.println("b를 입력하세요");
		b = in.nextInt();
		
		System.out.println("내가 입력한 숫자는");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
