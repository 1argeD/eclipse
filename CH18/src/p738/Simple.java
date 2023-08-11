package p738;

import java.io.*;
import java.net.*;

public class Simple {
	public static void main(String[] args) throws ClassNotFoundException {
		try (
				ServerSocket server = new ServerSocket(5000);//소켓 서버 생성 포트 5000
				Socket connection = server.accept();//클라이언트 요청 대기 성공시 소켓 생성
				InputStream is = connection.getInputStream();//보내온 데이터를 읽기 위해서 인풋스트림 객체 생성
				ObjectInputStream ois = new ObjectInputStream(is);
				) {
			System.out.println("서버 실행");
		    String msg = (String)ois.readObject();
			System.out.println(msg);//받은 문자찍기
			
			
		} catch (IOException e) {
			System.out.println("오류발생");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
