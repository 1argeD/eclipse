package share;

public class PrintThread extends Thread {
	ShareData share;
	public void run() {
		synchronized (share) {
			try {
				share.wait();//��ٷ���
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(share.sum);
		
		}
	}
}
