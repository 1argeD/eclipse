package ����ó��;

public class ExceptionTest {

	public static void main(String[] args) {
		int sum=0;
		String str = "34";
		try{//try�� �ִ� ���� ����
			sum = Integer.parseInt(str)+1;
			sum	= sum/0;//ArithmeticException
			System.out.println("���� �Ϸ�");
		} catch(Exception e) {//���ܰ� �߻��ϸ� �� ������ ���� Exception�� �ֻ��� Ŭ������ ��� ���� ���� �޾ƿ� �� �ִ�.
			System.out.println("���� �߻�");
			e.printStackTrace();//������ ���� ������ �޾� �� �� �ִ�
			e.getMessage();
		}
		
		//���� ó��(�۵��� ������ ������ �ش� �ڵ��� �ַ��� �߻� �� �ڵ带 ������) �� ���� �ڵ� ����
		System.out.println(sum);
	}

}
