package 명령행인자;
//argument 인수 - 건네주는 변수
//parameter 매개변수, 인자 - 함수정의
public class AgrsTest {
	public static void main(String[] args) {
		//java AgrsTest aa bb
		//ipconfig / a
		
		for(String arg : args) {
			System.out.println(arg);
		}
	}
	
}
