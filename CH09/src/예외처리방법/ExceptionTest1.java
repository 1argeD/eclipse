package 예외처리방법;

public class ExceptionTest1 {
	public static void main(String[] args){
		MyData myData = new MyData(9,0);
		int num = myData.div();
		System.out.println(num);
	}
}
