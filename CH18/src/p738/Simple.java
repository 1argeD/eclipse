package p738;

import java.io.*;
import java.net.*;

public class Simple {
	public static void main(String[] args) throws ClassNotFoundException {
		try (
				ServerSocket server = new ServerSocket(5000);//���� ���� ���� ��Ʈ 5000
				Socket connection = server.accept();//Ŭ���̾�Ʈ ��û ��� ������ ���� ����
				InputStream is = connection.getInputStream();//������ �����͸� �б� ���ؼ� ��ǲ��Ʈ�� ��ü ����
				ObjectInputStream ois = new ObjectInputStream(is);
				) {
			System.out.println("���� ����");
		    String msg = (String)ois.readObject();
			System.out.println(msg);//���� �������
			
			
		} catch (IOException e) {
			System.out.println("�����߻�");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
