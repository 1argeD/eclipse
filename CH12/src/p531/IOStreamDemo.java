package p531;

import java.io.IOException;

public class IOStreamDemo {

	public static void main(String[] args) throws IOException {
		int b, len=0;
		int ba[] = new int[100];
		
		System.out.println("입력 스트림");
		while((b = System.in.read())!= '\n') {
			System.out.println(b+" "+(char)(b));//입력된 숫자값 문자값
		}
		//			\n		라인피드(line Feed), \r 캐리지리턴(carriage return)
		//줄바꿈 linux(unix) \n(escape 탈출문자) , windows \r\n
		//멕과 리눅스 환경에서 실행했다면 13이 나오지 않았을 거임. window의 줄바꿈인 \r 때문에 아스키코드 13번째를 반환한 것 

		System.out.println("출력스트림");
		for(int i : ba) {
			System.out.write(i);
		}
		System.out.flush();//버퍼에 있는 내용, 모두 출력
		
	}

}
