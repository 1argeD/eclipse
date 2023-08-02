package P323;

public class WrapperClass {
	public static void main(String[] args) {
		//기본타입                   -> WrapperCLass    
		//byte(8bit)    -> Byte             정수
		//int(32bit)    -> Integer			정수
		//short(16bit)  -> Short			정수
		//long(64bit)   -> Long				정수
		//double (32bit)-> Double			실수
		//float  (16bit)-> Float     		실수
		//boolean(64bit)-> Boolean			참/거짓
		//char(16bit)   -> character     	한글자 ''
		
		int a = 3;
		Integer b = 3;
		int c = a+b;
		
		Integer.parseInt("32");//문자를 숫자로 변경
		//WrapperClass의 경우는 null 체크가 가능하지만 기초타입의 경우 null값과 0값을 구분할 수 없다.
	}
}
