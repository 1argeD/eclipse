package P323;

public class WrapperClass {
	public static void main(String[] args) {
		//�⺻Ÿ��                   -> WrapperCLass    
		//byte(8bit)    -> Byte             ����
		//int(32bit)    -> Integer			����
		//short(16bit)  -> Short			����
		//long(64bit)   -> Long				����
		//double (32bit)-> Double			�Ǽ�
		//float  (16bit)-> Float     		�Ǽ�
		//boolean(64bit)-> Boolean			��/����
		//char(16bit)   -> character     	�ѱ��� ''
		
		int a = 3;
		Integer b = 3;
		int c = a+b;
		
		Integer.parseInt("32");//���ڸ� ���ڷ� ����
		//WrapperClass�� ���� null üũ�� ���������� ����Ÿ���� ��� null���� 0���� ������ �� ����.
	}
}
