package 반복문;

public class DoWhileTest {
 public static void main(String[] args) {
	 /* 문법 - 조건이 아래에 있으므로 무조건 한번의 반복이 필요할 때 사용한다.
	  do{
	  	조건이 참일 떄 반복할 내용
	   } while(조건); [주의 : 끝에 ;를 붙여야 한다.]
	  */
	 int a = 9;
	 
	 do {
		 System.out.println("출력");
		 a+=10;
	 } while(a<10);
 }
}
