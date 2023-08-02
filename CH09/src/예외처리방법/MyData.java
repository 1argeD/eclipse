package 예외처리방법;

public class MyData {
	int a,b;
	MyData(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int div() {
		try {
			return a/b;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생");
			return 0;
		} finally {//오류가 있고 없고 무조건 수행이 되어야 하는문 , 전에 return 값이 있어도 실행이 된다.
			System.out.println("aaaaa");
		}
	}

}
