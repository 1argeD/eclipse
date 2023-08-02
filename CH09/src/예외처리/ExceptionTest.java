package 예외처리;

public class ExceptionTest {

	public static void main(String[] args) {
		int sum=0;
		String str = "34";
		try{//try에 있는 것을 실행
			sum = Integer.parseInt(str)+1;
			sum	= sum/0;//ArithmeticException
			System.out.println("실행 완료");
		} catch(Exception e) {//예외가 발생하면 이 구문을 실행 Exception은 최상위 클래스로 모든 예외 값을 받아올 수 있다.
			System.out.println("문제 발생");
			e.printStackTrace();//에러에 대한 정보를 받아 올 수 있다
			e.getMessage();
		}
		
		//예외 처리(작동에 문제가 있으면 해당 코드의 애러를 발생 후 코드를 무시함) 후 밑의 코드 실행
		System.out.println(sum);
	}

}
