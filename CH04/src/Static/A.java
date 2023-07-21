package Static;


//static 정적 - 변수 또는 메소드 앞에 붙을 수 있다.
//static 메모리에 존재한다. -> static이 앞에 붙으면 객체를 생성하지 않아도 미리생성이 되어있어 자원을 공유한다

public class A {
	int a;
	int b;
	final int c = 7;//상수, 고정된 값을 사용하고 싶을때 사용. (변경 불가)  
	//일반적으로 final static 변수로 사용됨.
	
	//static은 객체끼리 같은 값을 공유해야 할 떄 사용, 혹 상수(3.14 등)에 사용
	
	static int sum(int a, int b) {
		return a+b;
	}
	
	int a() {
		return 4;
	}
	
	void b() {
		a();
	}

}
