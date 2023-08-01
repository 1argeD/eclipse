package 다른패키지;

import 접근제어.A;

public class ATest {
	public static void main(String[] args) {
		A aa = new A();
	int k = aa.PUBLIC;//public 다른 패키지에서도 값을 가져올 수 있음.
			 //PROTECTED
			 //DEFAULT
             //PRIVATE
	}	
}
