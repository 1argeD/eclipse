package ���ʹ�����Ǯ�������߰�����;

import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
		String str1 = "300";
		//���ڸ� ���ڷ� ��ȯ�ϴ¹�
		//int => ����Ŭ���� Intger (��ȣ��ȯ�� �ڵ�����)
		
		int a = 3;
		Integer b = 4;
		
		int num = Integer.parseInt(str1); //���ڸ� ���ڷ� ��ȯ�ϴ� ���
		
		//2. ��½� format�� �̿��ϴ� �� //%d�� ������, %s�� ����, %f �Ҽ������� ����� �ض�.\n�� �ٹٲ�, %f�� �Ǽ�
		System.out.printf("num�� ����  %d�̴� \n",num);
		System.out.print("����������");
		System.out.println();
		
		//3.���ڿ��� Ű����� �Է� �޴� ��(nextLine()����)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("nextLine()�Է��ϱ� : ");
		String asd = sc.nextLine();
		System.out.println(asd);
		
		System.out.print("next()�Է��ϱ� : ");
		String as = sc.next();
		System.out.println(as);
		//next()�� nextLine()�� ���� next�� �� �ܾ �Է¹�����, nextLine()�� �� ���� �Է� ������
		sc.nextLine();//next() ���� ���� ó����
		//next() ���� ���� �� ��
		//����ϰ� ���� �ܾ ���� �ܾ� ����� ����Ѵ�. nextLine()���� �̷� ������ �߻����� ����. 
		
		//4.���ڿ��� ���� (String ���ڿ�, char ����)
		char ch = 'a';//���� - ����Ÿ���̱� ������ �񱳽� if(ch == 'a')
		String str3 = "a";//���ڿ� - if(str3.equal("a"))
		
		System.out.printf("���� a�� %c",ch);
		
		char ca = 's'; 
		int num1 = (int)ca; 
		ca = (char)(num1+1);
		
		System.out.println("char ca��"+ca);//ca�� s���� t�� ��
		
		//5.����ȯ
		int num5 = (int)(45.4+20.0); //dpf
		
		
		//6.�Էµ� �ѱ��ڸ� ���ڷ� �����ϱ�
		System.out.println("����Ͻðڽ��ϱ�?y/n");
		String flag = sc.nextLine();
		if(flag.equals("y")) {
			System.out.println("����̱���");
		}else {
			System.out.println("���̱���");
		}
		System.out.println("�ٽ� �ѱ��� �Է�");
		char StringTransToChar = sc.next().charAt(0);//�Է¹��� String ������ chrAt(0)���� ���� �����ͼ� char�� ����Ѵ�  
		//��� ���ڿ��� nextLine()�� ����ض�
	
		
		//7.
	}
}
