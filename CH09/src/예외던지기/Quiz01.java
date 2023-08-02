package 예외던지기;

public class Quiz01 {
	public static void main(String[] args) {
		MyClass1 obj = new MyClass1();
		int result;
		try {
			result = obj.div(10,0);
		}catch(Exception e) {
			result = 0;
		}
		System.out.println("결과는"+result);
		//0으로 나누어도 결과는 0으로 나오게 만들기
	
	}
}
