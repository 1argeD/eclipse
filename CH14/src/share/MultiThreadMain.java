package share;

public class MultiThreadMain {

	public static void main(String[] args) {
		CalcThread calc = new CalcThread();
		PrintThread print = new PrintThread();
		ShareData data = new ShareData();//����ȭ ��ü - ������ ��ü�� �ϳ� ���� 
		
		//�� ��ü�� wait�� notify�� ����ϸ� ������ ���ص� �ڿ� ����� �켱������ ���� �� �ִ�.
		print.share = data;//������ ��ü
		print.start();
		
		calc.share = data; //������ ��ü
		calc.start();
	}
}
