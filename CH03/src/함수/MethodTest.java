package 함수;

import java.util.Scanner;

public class MethodTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 계산을 선택해주세요((ex)더하기, 곱하기, 나누기) : ");
		String want = in.nextLine();
		
		System.out.print("a를 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.print("b를 입력해주세요 : ");
		int b = sc.nextInt();
		
		int answer = claculate(want, a, b);
		System.out.println("계산값은 "+ answer +"입니다.");
	}
	
	public static int claculate(String want,int a, int b) {
		
		if(want.equals("더하기")) {
			return a+b;
		} else if(want.equals("곱하기")) {
			return a*b;
		} else if(want.equals("나누기")) {
			return a/b;
		} else if(want.equals("빼기")) {
			return a-b;
		} else {
			System.out.println("원하는 계산은 지원하지 않거나, 입력값에 오타가 있습니다.");
		}
		return 0;
		
	}
}
