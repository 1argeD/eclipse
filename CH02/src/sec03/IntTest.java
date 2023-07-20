package sec03;

public class IntTest {
	public static void main(String[] args) {
		int a = 1500000000;//15억
		int b = 1500000000;
		int c = a+b;
		
		System.out.println(c);
		
		//int는 21억까지 밖에 읽을 수 없어. 범위를 벗어난 값을 읽지 못해서 이상한 값을 반환한다. 
			//그렇기 떄문에 자바 타입을 단위에 맞게 사용해야한다.
		
		double d1 = 4.31;
		System.out.println(d1);
		
//		int d2 = 4.31; //값과 단위가 일치하지 않아 오류 발생
	}
	
	/*1byte 당 표현가능한 문자는 2가지
	 * 2byte는 총 4가지 값을 표현 할 수 있음.
	 * int 는 32비트로 30억 값을 표현 할 수 없음.*/

}
