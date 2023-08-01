package 다른패키지;

import 접근제어.A;

public class C extends A {
	void Test() {
	int k = super.PROTECTED;//상속을 받았기 때문에 사용이 가능하다.
		k = super.PUBLIC;   
				//DEFAULT
        	    //PRIVATE
	}
}
