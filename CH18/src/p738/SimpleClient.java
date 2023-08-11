package p738;

import java.io.*;
import java.net.*;

public class SimpleClient {
	public static void main(String[] args) {
		
		//java 7 �������� java with resource ��
		//finally�� ���� �ʰ� ()���� �޼ҵ� ������ ���� �� ����
		try (
				Socket client = new Socket("localhost", 5000);//��������
				OutputStream os =client.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				) {
			oos.writeObject("asdfgg");
			oos.flush();
			System.out.println("Ŭ���̾�Ʈ ����");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
