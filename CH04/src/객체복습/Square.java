package ��ü����;
//���������� ���� 4���� public, ����(default), private, protect
//               (����), ���� ��Ű��������, private ���� - ��ӽÿ��� ��밡��, �ڱ��ڽŸ� ��밡��
//Ŭ������ public�� default�� ��밡��.


public class Square {
	
	//Ŭ������ 3���� �������
	//�ʵ�(�ɹ�����, ��������), �޼ҵ�(�Լ�), ������
	//������(�⺻ �����ڴ� ���� ���� - ��, �����ڸ� ����� �⺻�����ڸ� �ڵ����� �� ����)
	
	private int width, height;
	
	//������
	Square(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	int area() {
		return height*width;
	}
	
	int round() {
		return (height+width)*2;
	}

}
