package 반복문;

public class WhileTest {
	public static void main(String[] args) {
		int a = 0;
		//while은 특정 조건이 true일떄 반복문 실행, false가 되면 while밖의 함수를 실행한다.
		while(a<10) {
			System.out.println("안녕"+a);
			++a;
		}
		System.out.println(a);
	}
}
