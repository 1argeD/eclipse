package p738;

import java.io.*;
import java.net.*;

public class SimpleClient {
	public static void main(String[] args) {
		
		//java 7 버전부터 java with resource 문
		//finally를 하지 않고 ()안의 메소드 연결을 끊을 수 있음
		try (
				Socket client = new Socket("localhost", 5000);//서버연결
				OutputStream os =client.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				) {
			oos.writeObject("asdfgg");
			oos.flush();
			System.out.println("클라이언트 전송");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
