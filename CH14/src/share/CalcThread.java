package share;

public class CalcThread extends Thread {
    ShareData share = null; //������ü 
	public void run() {
		long sum = 0;
		//����ȭ 
		synchronized (share) {//()�ȿ� �ִ� ���� ����ȭ ��� ��ü - ���⼱ share������
			for(int i = 0; i<20000000; i++) {
				sum+=i;
				share.sum = sum;//���� ��ü�� ������ ����
			}
			share.notify();//�����ض�-��ȣ�� �ִ� ��
		}
		
//		ShareData.isReady = true;
	}

}
