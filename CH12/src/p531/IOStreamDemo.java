package p531;

import java.io.IOException;

public class IOStreamDemo {

	public static void main(String[] args) throws IOException {
		int b, len=0;
		int ba[] = new int[100];
		
		System.out.println("�Է� ��Ʈ��");
		while((b = System.in.read())!= '\n') {
			System.out.println(b+" "+(char)(b));//�Էµ� ���ڰ� ���ڰ�
		}
		//			\n		�����ǵ�(line Feed), \r ĳ��������(carriage return)
		//�ٹٲ� linux(unix) \n(escape Ż�⹮��) , windows \r\n
		//�߰� ������ ȯ�濡�� �����ߴٸ� 13�� ������ �ʾ��� ����. window�� �ٹٲ��� \r ������ �ƽ�Ű�ڵ� 13��°�� ��ȯ�� �� 

		System.out.println("��½�Ʈ��");
		for(int i : ba) {
			System.out.write(i);
		}
		System.out.flush();//���ۿ� �ִ� ����, ��� ���
		
	}

}
