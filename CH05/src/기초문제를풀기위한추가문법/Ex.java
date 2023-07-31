package 기초문제를풀기위한추가문법;

import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
		String str1 = "300";
		//문자를 숫자로 변환하는법
		//int => 래퍼클래스 Intger (상호변환이 자동으로)
		
		int a = 3;
		Integer b = 4;
		
		int num = Integer.parseInt(str1); //문자를 숫자로 변환하는 방법
		
		//2. 출력시 format을 이용하는 법 //%d는 십진수, %s는 문자, %f 소수점으로 출력을 해라.\n는 줄바꿈, %f는 실수
		System.out.printf("num의 값은  %d이다 \n",num);
		System.out.print("ㅁㄴㅇㄹㄹ");
		System.out.println();
		
		//3.문자열을 키보드로 입력 받는 법(nextLine()권장)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("nextLine()입력하기 : ");
		String asd = sc.nextLine();
		System.out.println(asd);
		
		System.out.print("next()입력하기 : ");
		String as = sc.next();
		System.out.println(as);
		//next()와 nextLine()의 차이 next는 한 단어만 입력받을때, nextLine()은 한 줄을 입력 받을떄
		sc.nextLine();//next() 남은 엔터 처리용
		//next() 사용시 주의 할 점
		//사용하고 남은 단어를 다음 단어 실행시 사용한다. nextLine()사용시 이런 문제는 발생하지 않음. 
		
		//4.문자열과 문자 (String 문자열, char 문자)
		char ch = 'a';//문자 - 기초타입이기 떄문에 비교시 if(ch == 'a')
		String str3 = "a";//문자열 - if(str3.equal("a"))
		
		System.out.printf("문자 a는 %c",ch);
		
		char ca = 's'; 
		int num1 = (int)ca; 
		ca = (char)(num1+1);
		
		System.out.println("char ca는"+ca);//ca가 s에서 t가 됨
		
		//5.형변환
		int num5 = (int)(45.4+20.0); //dpf
		
		
		//6.입력된 한글자를 문자로 변경하기
		System.out.println("계속하시겠습니까?y/n");
		String flag = sc.nextLine();
		if(flag.equals("y")) {
			System.out.println("계속이구나");
		}else {
			System.out.println("끝이구나");
		}
		System.out.println("다시 한글자 입력");
		char StringTransToChar = sc.next().charAt(0);//입력받은 String 값에서 chrAt(0)번쨰 값을 가져와서 char로 사용한다  
		//결론 문자열로 nextLine()을 사용해라
	
		
		//7.
	}
}
