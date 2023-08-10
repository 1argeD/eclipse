package 람다식문법;

interface N {
	int neg(int x);
}

interface P {
	void p();
}

public class Lambda2Demo {
	public static void main(String[] args) {
		N n;
		
		n = (int x) -> {return -x;};//기본표기법
		n = (int x) -> -x;
		n = (x) -> {return -x;}; //선언부 타입 생략가능
		n = x -> {return -x;};	//매게변수가 하나일 경우 관호 생략가능
		n = x -> -x;	    	//실행문이 하나라면 중괄호와 세미콜론 생략가능(단, 실행문이 하나의 return문이라면 )
								//return 키워드도 생략가능
	
		/*void print() {
			System.out.println("안녕");
		}*/
		P p;
		 p = () -> {System.out.println("안녕");};
		 p = () -> System.out.println("안녕");
	}
	
	
//	int neg(int x) {
//		return -x;
//	}
	
}
